package com.lly835.bestpay.service.impl;

import com.lly835.bestpay.constants.WxPayConstants;
import com.lly835.bestpay.model.wxpay.WxPayApi;
import com.lly835.bestpay.model.wxpay.response.WxPaySandboxKeyResponse;
import com.lly835.bestpay.utils.JsonUtil;
import com.lly835.bestpay.utils.RandomUtil;
import com.lly835.bestpay.utils.XmlUtil;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.slf4j.Logger;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lly835@163.com
 * 2018-05-16 20:35
 */
public class WxPaySandboxKey {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(WxPaySandboxKey.class);

    public void get(String mchId) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(WxPayConstants.WXPAY_GATEWAY).addConverterFactory(SimpleXmlConverterFactory.create()).build();
        SandboxParam sandboxParam = new SandboxParam();
        sandboxParam.setMchId(mchId);
        sandboxParam.setNonceStr(RandomUtil.getRandomStr());
        sandboxParam.setSign(WxPaySignature.sign(sandboxParam.buildMap(),""));

        String xml = XmlUtil.toString(sandboxParam);
        RequestBody body = RequestBody.create(MediaType.parse("application/xml; charset=utf-8"),xml);
        Call<WxPaySandboxKeyResponse> call = retrofit.create(WxPayApi.class).getsignkey(body);
        Response<WxPaySandboxKeyResponse> retrofitResponse = null;
        try {
            retrofitResponse = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!retrofitResponse.isSuccessful()) {
            throw new RuntimeException("【微信统一支付】发起支付，网络异常，" + retrofitResponse);
        }
        Object response = retrofitResponse.body();
        log.info("【获取微信沙箱密钥】response={}",JsonUtil.toJson(response));
    }


    @Root(name = "xml")
    static class SandboxParam {

        @Element(name = "mch_id")
        private String mchId;

        @Element(name = "nonce_str")
        private String nonceStr;

        @Element(name = "sign")
        private String sign;

        public SandboxParam() {
        }

        public Map<String, String> buildMap() {
            Map<String, String> map = new HashMap<>();
            map.put("mch_id",this.mchId);
            map.put("nonce_str",this.nonceStr);
            return map;
        }

        public String getMchId() {
            return this.mchId;
        }

        public void setMchId(String mchId) {
            this.mchId = mchId;
        }

        public String getNonceStr() {
            return this.nonceStr;
        }

        public void setNonceStr(String nonceStr) {
            this.nonceStr = nonceStr;
        }

        public String getSign() {
            return this.sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof SandboxParam)) return false;
            final SandboxParam other = (SandboxParam) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$mchId = this.getMchId();
            final Object other$mchId = other.getMchId();
            if (this$mchId == null ? other$mchId != null : !this$mchId.equals(other$mchId)) return false;
            final Object this$nonceStr = this.getNonceStr();
            final Object other$nonceStr = other.getNonceStr();
            if (this$nonceStr == null ? other$nonceStr != null : !this$nonceStr.equals(other$nonceStr)) return false;
            final Object this$sign = this.getSign();
            final Object other$sign = other.getSign();
            if (this$sign == null ? other$sign != null : !this$sign.equals(other$sign)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof SandboxParam;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $mchId = this.getMchId();
            result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
            final Object $nonceStr = this.getNonceStr();
            result = result * PRIME + ($nonceStr == null ? 43 : $nonceStr.hashCode());
            final Object $sign = this.getSign();
            result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
            return result;
        }

        public String toString() {
            return "WxPaySandboxKey.SandboxParam(mchId=" + this.getMchId() + ", nonceStr=" + this.getNonceStr() + ", sign=" + this.getSign() + ")";
        }
    }
}
