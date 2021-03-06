package com.lly835.bestpay.service.impl.alipay;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.lly835.bestpay.config.AliPayConfig;
import com.lly835.bestpay.config.SignType;
import com.lly835.bestpay.constants.AliPayConstants;
import com.lly835.bestpay.enums.AlipayTradeStatusEnum;
import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.*;
import com.lly835.bestpay.model.alipay.AliPayApi;
import com.lly835.bestpay.model.alipay.request.AliPayOrderQueryRequest;
import com.lly835.bestpay.model.alipay.request.AliPayPcRequest;
import com.lly835.bestpay.model.alipay.response.AliPayAsyncResponse;
import com.lly835.bestpay.model.alipay.response.AliPayOrderQueryResponse;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import com.lly835.bestpay.utils.JsonUtil;
import com.lly835.bestpay.utils.MapUtil;
import com.lly835.bestpay.utils.WebUtil;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AliPayServiceImpl extends BestPayServiceImpl {

    protected final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(AliPayServiceImpl.class);
    private final Retrofit retrofit = new Retrofit.Builder().baseUrl(AliPayConstants.ALIPAY_GATEWAY_OPEN).addConverterFactory(GsonConverterFactory.create(
            //下划线驼峰互转
            new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create())).client(new OkHttpClient.Builder().addInterceptor((new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))).build()).build();
    protected AliPayConfig aliPayConfig;

    public void setAliPayConfig(AliPayConfig aliPayConfig) {
        this.aliPayConfig = aliPayConfig;
    }

    @Override
    public PayResponse pay(PayRequest request) {
        if (request.getPayTypeEnum() == BestPayTypeEnum.ALIPAY_H5) {
            AlipayH5ServiceImpl alipayH5Service = new AlipayH5ServiceImpl();
            alipayH5Service.setAliPayConfig(aliPayConfig);
            return alipayH5Service.pay(request);
        }
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("out_trade_no",request.getOrderId());
        AliPayPcRequest aliPayRequest = new AliPayPcRequest();
        if (request.getPayTypeEnum() == BestPayTypeEnum.ALIPAY_PC) {
            requestParams.put("product_code",AliPayConstants.FAST_INSTANT_TRADE_PAY);
            aliPayRequest.setMethod(AliPayConstants.ALIPAY_TRADE_PAGE_PAY);
        } else {
            requestParams.put("product_code",AliPayConstants.QUICK_WAP_PAY);
            aliPayRequest.setMethod(AliPayConstants.ALIPAY_TRADE_WAP_PAY);
        }
        requestParams.put("product_code",AliPayConstants.FAST_INSTANT_TRADE_PAY);
        requestParams.put("total_amount",String.valueOf(request.getOrderAmount()));
        requestParams.put("subject",String.valueOf(request.getOrderName()));

        aliPayRequest.setAppId(aliPayConfig.getAppId());
        aliPayRequest.setCharset("utf-8");
        aliPayRequest.setSignType(AliPayConstants.SIGN_TYPE_RSA2);
        aliPayRequest.setNotifyUrl(aliPayConfig.getNotifyUrl());
        //优先使用PayRequest.returnUrl
        aliPayRequest.setReturnUrl(StringUtils.isEmpty(request.getReturnUrl()) ? aliPayConfig.getReturnUrl() : request.getReturnUrl());
        aliPayRequest.setTimestamp(LocalDateTime.now().format(formatter));
        aliPayRequest.setVersion("1.0");
        // 剔除空格、制表符、换行
        aliPayRequest.setBizContent(JsonUtil.toJson(requestParams).replaceAll("\\s*",""));
        aliPayRequest.setSign(AliPaySignature.sign(MapUtil.object2MapWithUnderline(aliPayRequest),aliPayConfig.getPrivateKey()));

        Map<String, String> parameters = MapUtil.object2MapWithUnderline(aliPayRequest);
        Map<String, String> applicationParams = new HashMap<>();
        applicationParams.put("biz_content",aliPayRequest.getBizContent());
        parameters.remove("biz_content");
        String baseUrl = WebUtil.getRequestUrl(parameters,aliPayConfig.isSandbox());
        String body = WebUtil.buildForm(baseUrl,applicationParams);

        // pc 网站支付 只需返回body
        PayResponse response = new PayResponse();
        response.setBody(body);
        return response;
    }


    @Override
    public boolean verify(Map<String, String> toBeVerifiedParamMap,SignType signType,String sign) {
        return AliPaySignature.verify(toBeVerifiedParamMap,aliPayConfig.getAliPayPublicKey());
    }

    /**
     * 异步通知
     */
    @Override
    public PayResponse asyncNotify(String notifyData) {
        try {
            notifyData = URLDecoder.decode(notifyData,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //签名校验
        if (!AliPaySignature.verify(MapUtil.form2Map(notifyData),aliPayConfig.getAliPayPublicKey())) {
            log.error("【支付宝支付异步通知】签名验证失败, response={}",notifyData);
            throw new RuntimeException("【支付宝支付异步通知】签名验证失败");
        }
        HashMap<String, String> params = MapUtil.form2MapWithCamelCase(notifyData);
        AliPayAsyncResponse response = MapUtil.mapToObject(params,AliPayAsyncResponse.class);
        String tradeStatus = Objects.requireNonNull(response).getTradeStatus();
        if (!tradeStatus.equals(AliPayConstants.TRADE_FINISHED) && !tradeStatus.equals(AliPayConstants.TRADE_SUCCESS)) {
            throw new RuntimeException("【支付宝支付异步通知】发起支付, trade_status != SUCCESS | FINISHED");
        }
        return buildPayResponse(response);
    }

    @Override
    public RefundResponse refund(RefundRequest request) {
        return super.refund(request);
    }

    @Override
    public OrderQueryResponse query(OrderQueryRequest request) {
        AliPayOrderQueryRequest aliPayOrderQueryRequest = new AliPayOrderQueryRequest();
        aliPayOrderQueryRequest.setAppId(aliPayConfig.getAppId());
        aliPayOrderQueryRequest.setTimestamp(LocalDateTime.now().format(formatter));
        AliPayOrderQueryRequest.BizContent bizContent = new AliPayOrderQueryRequest.BizContent();
        bizContent.setOutTradeNo(request.getOrderId());
        bizContent.setTradeNo(request.getOutOrderId());
        aliPayOrderQueryRequest.setBizContent(JsonUtil.toJsonWithUnderscores(bizContent).replaceAll("\\s*",""));
        aliPayOrderQueryRequest.setSign(AliPaySignature.sign(MapUtil.object2MapWithUnderline(aliPayOrderQueryRequest),aliPayConfig.getPrivateKey()));

        Call<AliPayOrderQueryResponse> call = retrofit.create(AliPayApi.class).orderQuery((MapUtil.object2MapWithUnderline(aliPayOrderQueryRequest)));
        Response<AliPayOrderQueryResponse> retrofitResponse = null;
        try {
            retrofitResponse = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert retrofitResponse != null;
        if (!retrofitResponse.isSuccessful()) {
            throw new RuntimeException("【查询支付宝订单】网络异常");
        }
        assert retrofitResponse.body() != null;
        AliPayOrderQueryResponse.AlipayTradeQueryResponse response = retrofitResponse.body().getAlipayTradeQueryResponse();
        if (!response.getCode().equals(AliPayConstants.RESPONSE_CODE_SUCCESS)) {
            throw new RuntimeException("【查询支付宝订单】code=" + response.getCode() + ", returnMsg=" + response.getMsg() + String.format("|%s|%s",response.getSubCode(),response.getSubMsg()));
        }

        return OrderQueryResponse.builder().orderStatusEnum(AlipayTradeStatusEnum.findByName(response.getTradeStatus()).getOrderStatusEnum()).outTradeNo(response.getTradeNo()).orderId(response.getOutTradeNo()).resultMsg(response.getMsg()).finishTime(response.getSendPayDate()).build();
    }

    @Override
    public String downloadBill(DownloadBillRequest request) {
        return super.downloadBill(request);
    }

    private PayResponse buildPayResponse(AliPayAsyncResponse response) {
        PayResponse payResponse = new PayResponse();
        payResponse.setPayPlatformEnum(BestPayPlatformEnum.ALIPAY);
        payResponse.setOrderAmount(Double.valueOf(response.getTotalAmount()));
        payResponse.setOrderId(response.getOutTradeNo());
        payResponse.setOutTradeNo(response.getTradeNo());
        return payResponse;
    }
}
