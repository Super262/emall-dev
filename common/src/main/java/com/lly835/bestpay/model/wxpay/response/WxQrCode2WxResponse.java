package com.lly835.bestpay.model.wxpay.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;

/**
 * 响应微信扫码回调的返回
 */

@Root(name = "xml", strict = false)
public class WxQrCode2WxResponse {

    @Element(name = "return_code")
    private String returnCode;

    @Element(name = "return_msg", required = false)
    private String returnMsg;

    @Element(name = "appid", required = false)
    private String appid;

    @Element(name = "mch_id", required = false)
    private String mchId;

    @Element(name = "nonce_str", required = false)
    private String nonceStr;

    @Element(name = "prepay_id", required = false)
    private String prepayId;

    @Element(name = "result_code", required = false)
    private String resultCode;

    @Element(name = "err_code_des", required = false)
    private String errCodeDes;

    @Element(name = "sign", required = false)
    private String sign;

    public WxQrCode2WxResponse() {
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getAppid() {
        return this.appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
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

    public String getPrepayId() {
        return this.prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCodeDes() {
        return this.errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxQrCode2WxResponse)) return false;
        final WxQrCode2WxResponse other = (WxQrCode2WxResponse) o;
        if (!other.canEqual(this)) return false;
        final Object this$returnCode = this.getReturnCode();
        final Object other$returnCode = other.getReturnCode();
        if (!Objects.equals(this$returnCode,other$returnCode)) return false;
        final Object this$returnMsg = this.getReturnMsg();
        final Object other$returnMsg = other.getReturnMsg();
        if (!Objects.equals(this$returnMsg,other$returnMsg)) return false;
        final Object this$appid = this.getAppid();
        final Object other$appid = other.getAppid();
        if (!Objects.equals(this$appid,other$appid)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (!Objects.equals(this$mchId,other$mchId)) return false;
        final Object this$nonceStr = this.getNonceStr();
        final Object other$nonceStr = other.getNonceStr();
        if (!Objects.equals(this$nonceStr,other$nonceStr)) return false;
        final Object this$prepayId = this.getPrepayId();
        final Object other$prepayId = other.getPrepayId();
        if (!Objects.equals(this$prepayId,other$prepayId)) return false;
        final Object this$resultCode = this.getResultCode();
        final Object other$resultCode = other.getResultCode();
        if (!Objects.equals(this$resultCode,other$resultCode)) return false;
        final Object this$errCodeDes = this.getErrCodeDes();
        final Object other$errCodeDes = other.getErrCodeDes();
        if (!Objects.equals(this$errCodeDes,other$errCodeDes)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        return Objects.equals(this$sign,other$sign);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxQrCode2WxResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $returnCode = this.getReturnCode();
        result = result * PRIME + ($returnCode == null ? 43 : $returnCode.hashCode());
        final Object $returnMsg = this.getReturnMsg();
        result = result * PRIME + ($returnMsg == null ? 43 : $returnMsg.hashCode());
        final Object $appid = this.getAppid();
        result = result * PRIME + ($appid == null ? 43 : $appid.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $nonceStr = this.getNonceStr();
        result = result * PRIME + ($nonceStr == null ? 43 : $nonceStr.hashCode());
        final Object $prepayId = this.getPrepayId();
        result = result * PRIME + ($prepayId == null ? 43 : $prepayId.hashCode());
        final Object $resultCode = this.getResultCode();
        result = result * PRIME + ($resultCode == null ? 43 : $resultCode.hashCode());
        final Object $errCodeDes = this.getErrCodeDes();
        result = result * PRIME + ($errCodeDes == null ? 43 : $errCodeDes.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        return result;
    }

    public String toString() {
        return "WxQrCode2WxResponse(returnCode=" + this.getReturnCode() + ", returnMsg=" + this.getReturnMsg() + ", appid=" + this.getAppid() + ", mchId=" + this.getMchId() + ", nonceStr=" + this.getNonceStr() + ", prepayId=" + this.getPrepayId() + ", resultCode=" + this.getResultCode() + ", errCodeDes=" + this.getErrCodeDes() + ", sign=" + this.getSign() + ")";
    }
}
