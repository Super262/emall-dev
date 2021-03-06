package com.lly835.bestpay.service.impl;

import com.lly835.bestpay.config.SignType;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.constants.WxPayConstants;
import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.enums.OrderStatusEnum;
import com.lly835.bestpay.model.*;
import com.lly835.bestpay.model.wxpay.WxPayApi;
import com.lly835.bestpay.model.wxpay.request.WxDownloadBillRequest;
import com.lly835.bestpay.model.wxpay.request.WxOrderQueryRequest;
import com.lly835.bestpay.model.wxpay.request.WxPayRefundRequest;
import com.lly835.bestpay.model.wxpay.request.WxPayUnifiedorderRequest;
import com.lly835.bestpay.model.wxpay.response.*;
import com.lly835.bestpay.utils.MapUtil;
import com.lly835.bestpay.utils.MoneyUtil;
import com.lly835.bestpay.utils.RandomUtil;
import com.lly835.bestpay.utils.XmlUtil;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WxPayServiceImpl extends BestPayServiceImpl {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(WxPayServiceImpl.class);
    private final Retrofit retrofit = new Retrofit.Builder().baseUrl(WxPayConstants.WXPAY_GATEWAY).addConverterFactory(SimpleXmlConverterFactory.create()).client(new OkHttpClient.Builder().addInterceptor((new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))).build()).build();
    private WxPayConfig wxPayConfig;

    public void setWxPayConfig(WxPayConfig wxPayConfig) {
        this.wxPayConfig = wxPayConfig;
    }

    @Override
    public PayResponse pay(PayRequest request) {
        WxPayUnifiedorderRequest wxRequest = new WxPayUnifiedorderRequest();
        wxRequest.setOutTradeNo(request.getOrderId());
        wxRequest.setTotalFee(MoneyUtil.Yuan2Fen(request.getOrderAmount()));
        wxRequest.setBody(request.getOrderName());
        wxRequest.setOpenid(request.getOpenid());
        wxRequest.setTradeType(request.getPayTypeEnum().getCode());

        //????????????app??????????????????appid???????????????h5???native??????????????????appid
        if (request.getPayTypeEnum() == BestPayTypeEnum.WXPAY_MINI) {
            wxRequest.setAppid(wxPayConfig.getMiniAppId());
        } else if (request.getPayTypeEnum() == BestPayTypeEnum.WXPAY_APP) {
            wxRequest.setAppid(wxPayConfig.getAppAppId());
        } else {
            wxRequest.setAppid(wxPayConfig.getAppId());
        }
        wxRequest.setMchId(wxPayConfig.getMchId());
        wxRequest.setNotifyUrl(wxPayConfig.getNotifyUrl());
        wxRequest.setNonceStr(RandomUtil.getRandomStr());
        wxRequest.setSpbillCreateIp(StringUtils.isEmpty(request.getSpbillCreateIp()) ? "8.8.8.8" : request.getSpbillCreateIp());
        wxRequest.setAttach(request.getAttach());
        wxRequest.setSign(WxPaySignature.sign(MapUtil.buildMap(wxRequest),wxPayConfig.getMchKey()));

        RequestBody body = RequestBody.create(MediaType.parse("application/xml; charset=utf-8"),XmlUtil.toString(wxRequest));
        Call<WxPaySyncResponse> call = retrofit.create(WxPayApi.class).unifiedorder(body);
        Response<WxPaySyncResponse> retrofitResponse = null;
        try {
            retrofitResponse = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert retrofitResponse != null;
        if (!retrofitResponse.isSuccessful()) {
            throw new RuntimeException("????????????????????????????????????, ????????????");
        }
        WxPaySyncResponse response = retrofitResponse.body();

        assert response != null;
        if (!response.getReturnCode().equals(WxPayConstants.SUCCESS)) {
            throw new RuntimeException("????????????????????????????????????, returnCode != SUCCESS, returnMsg = " + response.getReturnMsg());
        }
        if (!response.getResultCode().equals(WxPayConstants.SUCCESS)) {
            throw new RuntimeException("????????????????????????????????????, resultCode != SUCCESS, err_code = " + response.getErrCode() + " err_code_des=" + response.getErrCodeDes());
        }

        return buildPayResponse(response);
    }

    @Override
    public boolean verify(Map<String, String> map,SignType signType,String sign) {
        return WxPaySignature.verify(map,wxPayConfig.getMchKey());
    }

    @Override
    public PayResponse syncNotify(HttpServletRequest request) {
        return null;
    }

    /**
     * ????????????
     */
    @Override
    public PayResponse asyncNotify(String notifyData) {
        //????????????
        if (!WxPaySignature.verify(XmlUtil.toMap(notifyData),wxPayConfig.getMchKey())) {
            log.error("????????????????????????????????????????????????, response={}",notifyData);
            throw new RuntimeException("????????????????????????????????????????????????");
        }

        //xml???????????????
        WxPayAsyncResponse asyncResponse = (WxPayAsyncResponse) XmlUtil.toObject(notifyData,WxPayAsyncResponse.class);

        if (!Objects.requireNonNull(asyncResponse).getReturnCode().equals(WxPayConstants.SUCCESS)) {
            throw new RuntimeException("??????????????????????????????????????????, returnCode != SUCCESS, returnMsg = " + asyncResponse.getReturnMsg());
        }
        //??????????????????????????????
        if (!asyncResponse.getResultCode().equals(WxPayConstants.SUCCESS) && asyncResponse.getErrCode().equals("ORDERPAID")) {
            return buildPayResponse(asyncResponse);
        }

        if (!asyncResponse.getResultCode().equals(WxPayConstants.SUCCESS)) {
            throw new RuntimeException("??????????????????????????????????????????, resultCode != SUCCESS, err_code = " + asyncResponse.getErrCode() + " err_code_des=" + asyncResponse.getErrCodeDes());
        }

        return buildPayResponse(asyncResponse);
    }

    /**
     * ????????????
     */
    public RefundResponse refund(RefundRequest request) {
        WxPayRefundRequest wxRequest = new WxPayRefundRequest();
        wxRequest.setOutTradeNo(request.getOrderId());
        wxRequest.setOutRefundNo(request.getOrderId());
        wxRequest.setTotalFee(MoneyUtil.Yuan2Fen(request.getOrderAmount()));
        wxRequest.setRefundFee(MoneyUtil.Yuan2Fen(request.getOrderAmount()));

        wxRequest.setAppid(wxPayConfig.getAppId());
        wxRequest.setMchId(wxPayConfig.getMchId());
        wxRequest.setNonceStr(RandomUtil.getRandomStr());
        wxRequest.setSign(WxPaySignature.sign(MapUtil.buildMap(wxRequest),wxPayConfig.getMchKey()));

        //???????????????
        if (wxPayConfig.getSslContext() == null) {
            wxPayConfig.initSSLContext();
        }
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().sslSocketFactory(wxPayConfig.getSslContext().getSocketFactory()).addInterceptor((new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))).build();

        Retrofit retrofit = new Retrofit.Builder().baseUrl(WxPayConstants.WXPAY_GATEWAY).addConverterFactory(SimpleXmlConverterFactory.create()).client(okHttpClient).build();
        String xml = XmlUtil.toString(wxRequest);
        RequestBody body = RequestBody.create(MediaType.parse("application/xml; charset=utf-8"),xml);
        Call<WxRefundResponse> call = retrofit.create(WxPayApi.class).refund(body);
        Response<WxRefundResponse> retrofitResponse = null;
        try {
            retrofitResponse = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!Objects.requireNonNull(retrofitResponse).isSuccessful()) {
            throw new RuntimeException("??????????????????????????????, ????????????");
        }
        WxRefundResponse response = retrofitResponse.body();

        if (!Objects.requireNonNull(response).getReturnCode().equals(WxPayConstants.SUCCESS)) {
            throw new RuntimeException("??????????????????????????????, returnCode != SUCCESS, returnMsg = " + response.getReturnMsg());
        }
        if (!response.getResultCode().equals(WxPayConstants.SUCCESS)) {
            throw new RuntimeException("??????????????????????????????, resultCode != SUCCESS, err_code = " + response.getErrCode() + " err_code_des=" + response.getErrCodeDes());
        }

        return buildRefundResponse(response);
    }

    /**
     * ????????????
     */
    @Override
    public OrderQueryResponse query(OrderQueryRequest request) {
        WxOrderQueryRequest wxRequest = new WxOrderQueryRequest();
        wxRequest.setOutTradeNo(request.getOrderId());
        wxRequest.setTransactionId(request.getOutOrderId());

        wxRequest.setAppid(wxPayConfig.getAppId());
        wxRequest.setMchId(wxPayConfig.getMchId());
        wxRequest.setNonceStr(RandomUtil.getRandomStr());
        wxRequest.setSign(WxPaySignature.sign(MapUtil.buildMap(wxRequest),wxPayConfig.getMchKey()));
        RequestBody body = RequestBody.create(MediaType.parse("application/xml; charset=utf-8"),XmlUtil.toString(wxRequest));

        Call<WxOrderQueryResponse> call = retrofit.create(WxPayApi.class).orderquery(body);
        Response<WxOrderQueryResponse> retrofitResponse = null;
        try {
            retrofitResponse = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert retrofitResponse != null;
        if (!retrofitResponse.isSuccessful()) {
            throw new RuntimeException("????????????????????????????????????");
        }
        WxOrderQueryResponse response = retrofitResponse.body();

        assert response != null;
        if (!response.getReturnCode().equals(WxPayConstants.SUCCESS)) {
            throw new RuntimeException("????????????????????????returnCode != SUCCESS, returnMsg = " + response.getReturnMsg());
        }
        if (!response.getResultCode().equals(WxPayConstants.SUCCESS)) {
            throw new RuntimeException("????????????????????????resultCode != SUCCESS, err_code = " + response.getErrCode() + ", err_code_des=" + response.getErrCodeDes());
        }

        return OrderQueryResponse.builder().orderStatusEnum(OrderStatusEnum.findByName(response.getTradeState())).resultMsg(response.getTradeStateDesc()).outTradeNo(response.getTransactionId()).orderId(response.getOutTradeNo()).attach(response.getAttach())
                //yyyyMMddHHmmss -> yyyy-MM-dd HH:mm:ss
                .finishTime(StringUtils.isEmpty(response.getTimeEnd()) ? "" : response.getTimeEnd().replaceAll("(\\d{4})(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\d{2})","$1-$2-$3 $4:$5:$6")).build();
    }

    private RefundResponse buildRefundResponse(WxRefundResponse response) {
        RefundResponse refundResponse = new RefundResponse();
        refundResponse.setOrderId(response.getOutTradeNo());
        refundResponse.setOrderAmount(MoneyUtil.Fen2Yuan(response.getTotalFee()));
        refundResponse.setOutTradeNo(response.getTransactionId());
        refundResponse.setRefundId(response.getOutRefundNo());
        refundResponse.setOutRefundNo(response.getRefundId());
        return refundResponse;
    }

    private PayResponse buildPayResponse(WxPayAsyncResponse response) {
        PayResponse payResponse = new PayResponse();
        payResponse.setPayPlatformEnum(BestPayPlatformEnum.WX);
        payResponse.setOrderAmount(MoneyUtil.Fen2Yuan(response.getTotalFee()));
        payResponse.setOrderId(response.getOutTradeNo());
        payResponse.setOutTradeNo(response.getTransactionId());
        payResponse.setAttach(response.getAttach());
        payResponse.setMwebUrl(response.getMwebUrl());
        return payResponse;
    }

    /**
     * ?????????h5?????????
     */
    private PayResponse buildPayResponse(WxPaySyncResponse response) {
        String timeStamp = String.valueOf(System.currentTimeMillis() / 1000);
        String nonceStr = RandomUtil.getRandomStr();
        String prepayId = response.getPrepayId();

        //?????????????????????map
        Map<String, String> map = new HashMap<>();
        String signType = "MD5";
        map.put("appId",response.getAppid());
        map.put("timeStamp",timeStamp);
        map.put("nonceStr",nonceStr);

        //???????????????
        PayResponse payResponse = new PayResponse();
        payResponse.setAppId(response.getAppid());
        payResponse.setTimeStamp(timeStamp);
        payResponse.setNonceStr(nonceStr);
        payResponse.setSignType(signType);
        payResponse.setMwebUrl(response.getMwebUrl());
        payResponse.setCodeUrl(response.getCodeUrl());

        //??????APP????????????????????????prepay_id, package="Sign=WXPay"
        if (response.getTradeType().equals(BestPayTypeEnum.WXPAY_APP.getCode())) {
            String packAge = "Sign=WXPay";
            map.put("package",packAge);
            map.put("prepayid",prepayId);
            map.put("partnerid",response.getMchId());
            payResponse.setPackAge(packAge);
            payResponse.setPaySign(WxPaySignature.signForApp(map,wxPayConfig.getMchKey()));
            payResponse.setPrepayId(prepayId);
            return payResponse;
        } else {
            prepayId = "prepay_id=" + prepayId;
            map.put("package",prepayId);
            map.put("signType",signType);
            payResponse.setPackAge(prepayId);
            payResponse.setPaySign(WxPaySignature.sign(map,wxPayConfig.getMchKey()));
            return payResponse;
        }
    }

    /**
     *
     */
    @Override
    public String downloadBill(DownloadBillRequest request) {

        WxDownloadBillRequest wxRequest = new WxDownloadBillRequest();
        wxRequest.setBillDate(request.getBillDate());

        wxRequest.setAppid(wxPayConfig.getAppId());
        wxRequest.setMchId(wxPayConfig.getMchId());
        wxRequest.setNonceStr(RandomUtil.getRandomStr());
        wxRequest.setSign(WxPaySignature.sign(MapUtil.buildMap(wxRequest),wxPayConfig.getMchKey()));
        RequestBody body = RequestBody.create(MediaType.parse("application/xml; charset=utf-8"),XmlUtil.toString(wxRequest));

        Call<ResponseBody> call = retrofit.create(WxPayApi.class).downloadBill(body);
        Response<ResponseBody> retrofitResponse = null;
        try {
            retrofitResponse = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!Objects.requireNonNull(retrofitResponse).isSuccessful()) {
            throw new RuntimeException("????????????????????????????????????");
        }

        String response = null;
        try {
            response = Objects.requireNonNull(retrofitResponse.body()).string();

            //????????????xml???????????????????????????
            if (response.startsWith("<")) {
                WxDownloadBillResponse downloadBillResponse = (WxDownloadBillResponse) XmlUtil.toObject(response,WxDownloadBillResponse.class);
                throw new RuntimeException("?????????????????????????????? ?????????: " + Objects.requireNonNull(downloadBillResponse).getErrorCode() + " ????????????: " + downloadBillResponse.getReturnMsg());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return response;
    }

    /**
     * ??????????????????????????????????????????URL
     */
    @Override
    public String getQrCodeUrl(String productId) {
        String appid = wxPayConfig.getAppId();
        String mch_id = wxPayConfig.getMchId();
        String timeStamp = String.valueOf(System.currentTimeMillis() / 1000);
        String nonceStr = RandomUtil.getRandomStr();

        //?????????????????????map
        Map<String, String> map = new HashMap<>();
        map.put("appid",appid);
        map.put("mch_id",mch_id);
        map.put("product_id",productId);
        map.put("time_stamp",timeStamp);
        map.put("nonce_str",nonceStr);

        return "weixin://wxpay/bizpayurl?" + "appid=" + appid + "&mch_id=" + mch_id + "&product_id=" + productId + "&time_stamp=" + timeStamp + "&nonce_str=" + nonceStr + "&sign=" + WxPaySignature.sign(map,wxPayConfig.getMchKey());
    }
}
