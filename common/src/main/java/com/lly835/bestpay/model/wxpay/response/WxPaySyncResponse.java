package com.lly835.bestpay.model.wxpay.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 同步返回参数
 * Created by 廖师兄
 * 2017-07-02 13:46
 */
@Root(name = "xml", strict = false)
public class WxPaySyncResponse {
    @Element(name = "return_code")
    private String returnCode;

    @Element(name = "return_msg", required = false)
    private String returnMsg;

    /**
     * 以下字段在return_code为SUCCESS的时候有返回.
     */
    @Element(name = "appid", required = false)
    private String appid;

    @Element(name = "mch_id", required = false)
    private String mchId;

    @Element(name = "device_info", required = false)
    private String deviceInfo;

    @Element(name = "nonce_str", required = false)
    private String nonceStr;

    @Element(name = "sign", required = false)
    private String sign;

    @Element(name = "result_code", required = false)
    private String resultCode;

    @Element(name = "err_code", required = false)
    private String errCode;

    @Element(name = "err_code_des", required = false)
    private String errCodeDes;

    /**
     * 以下字段在return_code 和result_code都为SUCCESS的时候有返回.
     */
    @Element(name = "trade_type", required = false)
    private String tradeType;

    @Element(name = "prepay_id", required = false)
    private String prepayId;

    @Element(name = "code_url", required = false)
    private String codeUrl;

    @Element(name = "mweb_url", required = false)
    private String mwebUrl;

    public WxPaySyncResponse() {
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

    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
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

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return this.errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getPrepayId() {
        return this.prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getCodeUrl() {
        return this.codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getMwebUrl() {
        return this.mwebUrl;
    }

    public void setMwebUrl(String mwebUrl) {
        this.mwebUrl = mwebUrl;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxPaySyncResponse)) return false;
        final WxPaySyncResponse other = (WxPaySyncResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$returnCode = this.getReturnCode();
        final Object other$returnCode = other.getReturnCode();
        if (this$returnCode == null ? other$returnCode != null : !this$returnCode.equals(other$returnCode))
            return false;
        final Object this$returnMsg = this.getReturnMsg();
        final Object other$returnMsg = other.getReturnMsg();
        if (this$returnMsg == null ? other$returnMsg != null : !this$returnMsg.equals(other$returnMsg)) return false;
        final Object this$appid = this.getAppid();
        final Object other$appid = other.getAppid();
        if (this$appid == null ? other$appid != null : !this$appid.equals(other$appid)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (this$mchId == null ? other$mchId != null : !this$mchId.equals(other$mchId)) return false;
        final Object this$deviceInfo = this.getDeviceInfo();
        final Object other$deviceInfo = other.getDeviceInfo();
        if (this$deviceInfo == null ? other$deviceInfo != null : !this$deviceInfo.equals(other$deviceInfo))
            return false;
        final Object this$nonceStr = this.getNonceStr();
        final Object other$nonceStr = other.getNonceStr();
        if (this$nonceStr == null ? other$nonceStr != null : !this$nonceStr.equals(other$nonceStr)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (this$sign == null ? other$sign != null : !this$sign.equals(other$sign)) return false;
        final Object this$resultCode = this.getResultCode();
        final Object other$resultCode = other.getResultCode();
        if (this$resultCode == null ? other$resultCode != null : !this$resultCode.equals(other$resultCode))
            return false;
        final Object this$errCode = this.getErrCode();
        final Object other$errCode = other.getErrCode();
        if (this$errCode == null ? other$errCode != null : !this$errCode.equals(other$errCode)) return false;
        final Object this$errCodeDes = this.getErrCodeDes();
        final Object other$errCodeDes = other.getErrCodeDes();
        if (this$errCodeDes == null ? other$errCodeDes != null : !this$errCodeDes.equals(other$errCodeDes))
            return false;
        final Object this$tradeType = this.getTradeType();
        final Object other$tradeType = other.getTradeType();
        if (this$tradeType == null ? other$tradeType != null : !this$tradeType.equals(other$tradeType)) return false;
        final Object this$prepayId = this.getPrepayId();
        final Object other$prepayId = other.getPrepayId();
        if (this$prepayId == null ? other$prepayId != null : !this$prepayId.equals(other$prepayId)) return false;
        final Object this$codeUrl = this.getCodeUrl();
        final Object other$codeUrl = other.getCodeUrl();
        if (this$codeUrl == null ? other$codeUrl != null : !this$codeUrl.equals(other$codeUrl)) return false;
        final Object this$mwebUrl = this.getMwebUrl();
        final Object other$mwebUrl = other.getMwebUrl();
        if (this$mwebUrl == null ? other$mwebUrl != null : !this$mwebUrl.equals(other$mwebUrl)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxPaySyncResponse;
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
        final Object $deviceInfo = this.getDeviceInfo();
        result = result * PRIME + ($deviceInfo == null ? 43 : $deviceInfo.hashCode());
        final Object $nonceStr = this.getNonceStr();
        result = result * PRIME + ($nonceStr == null ? 43 : $nonceStr.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        final Object $resultCode = this.getResultCode();
        result = result * PRIME + ($resultCode == null ? 43 : $resultCode.hashCode());
        final Object $errCode = this.getErrCode();
        result = result * PRIME + ($errCode == null ? 43 : $errCode.hashCode());
        final Object $errCodeDes = this.getErrCodeDes();
        result = result * PRIME + ($errCodeDes == null ? 43 : $errCodeDes.hashCode());
        final Object $tradeType = this.getTradeType();
        result = result * PRIME + ($tradeType == null ? 43 : $tradeType.hashCode());
        final Object $prepayId = this.getPrepayId();
        result = result * PRIME + ($prepayId == null ? 43 : $prepayId.hashCode());
        final Object $codeUrl = this.getCodeUrl();
        result = result * PRIME + ($codeUrl == null ? 43 : $codeUrl.hashCode());
        final Object $mwebUrl = this.getMwebUrl();
        result = result * PRIME + ($mwebUrl == null ? 43 : $mwebUrl.hashCode());
        return result;
    }

    public String toString() {
        return "WxPaySyncResponse(returnCode=" + this.getReturnCode() + ", returnMsg=" + this.getReturnMsg() + ", appid=" + this.getAppid() + ", mchId=" + this.getMchId() + ", deviceInfo=" + this.getDeviceInfo() + ", nonceStr=" + this.getNonceStr() + ", sign=" + this.getSign() + ", resultCode=" + this.getResultCode() + ", errCode=" + this.getErrCode() + ", errCodeDes=" + this.getErrCodeDes() + ", tradeType=" + this.getTradeType() + ", prepayId=" + this.getPrepayId() + ", codeUrl=" + this.getCodeUrl() + ", mwebUrl=" + this.getMwebUrl() + ")";
    }
}
