package com.lly835.bestpay.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lly835.bestpay.enums.BestPayPlatformEnum;

import java.net.URI;

/**
 * 支付时的同步/异步返回参数
 */
public class PayResponse {

    private String prePayParams;

    private URI payUri;

    /** 以下字段仅在微信h5支付返回. */
    private String appId;

    private String timeStamp;

    private String nonceStr;

    @JsonProperty("package")
    private String packAge;

    private String signType;

    private String paySign;

    /**
     * 以下字段在微信异步通知下返回.
     */
    private Double orderAmount;

    private String orderId;

    /**
     * 第三方支付的流水号
     */
    private String outTradeNo;

    /**
     * 以下支付是h5支付返回
     */
    private String mwebUrl;

    /**
     * AliPay  pc网站支付返回的body体，html 可直接嵌入网页使用
     */
    private String body;

    /**
     * 扫码付模式二用来生成二维码
     */
    private String codeUrl;

    /**
     * 附加内容，发起支付时传入
     */
    private String attach;

    private BestPayPlatformEnum payPlatformEnum;

    private String prepayId;

    public PayResponse() {
    }

    public String getPrePayParams() {
        return this.prePayParams;
    }

    public URI getPayUri() {
        return this.payUri;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }

    public String getPackAge() {
        return this.packAge;
    }

    public String getSignType() {
        return this.signType;
    }

    public String getPaySign() {
        return this.paySign;
    }

    public Double getOrderAmount() {
        return this.orderAmount;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public String getMwebUrl() {
        return this.mwebUrl;
    }

    public String getBody() {
        return this.body;
    }

    public String getCodeUrl() {
        return this.codeUrl;
    }

    public String getAttach() {
        return this.attach;
    }

    public BestPayPlatformEnum getPayPlatformEnum() {
        return this.payPlatformEnum;
    }

    public String getPrepayId() {
        return this.prepayId;
    }

    public void setPrePayParams(String prePayParams) {
        this.prePayParams = prePayParams;
    }

    public void setPayUri(URI payUri) {
        this.payUri = payUri;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    @JsonProperty("package")
    public void setPackAge(String packAge) {
        this.packAge = packAge;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public void setMwebUrl(String mwebUrl) {
        this.mwebUrl = mwebUrl;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public void setPayPlatformEnum(BestPayPlatformEnum payPlatformEnum) {
        this.payPlatformEnum = payPlatformEnum;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PayResponse)) return false;
        final PayResponse other = (PayResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$prePayParams = this.getPrePayParams();
        final Object other$prePayParams = other.getPrePayParams();
        if (this$prePayParams == null ? other$prePayParams != null : !this$prePayParams.equals(other$prePayParams))
            return false;
        final Object this$payUri = this.getPayUri();
        final Object other$payUri = other.getPayUri();
        if (this$payUri == null ? other$payUri != null : !this$payUri.equals(other$payUri)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (this$appId == null ? other$appId != null : !this$appId.equals(other$appId)) return false;
        final Object this$timeStamp = this.getTimeStamp();
        final Object other$timeStamp = other.getTimeStamp();
        if (this$timeStamp == null ? other$timeStamp != null : !this$timeStamp.equals(other$timeStamp)) return false;
        final Object this$nonceStr = this.getNonceStr();
        final Object other$nonceStr = other.getNonceStr();
        if (this$nonceStr == null ? other$nonceStr != null : !this$nonceStr.equals(other$nonceStr)) return false;
        final Object this$packAge = this.getPackAge();
        final Object other$packAge = other.getPackAge();
        if (this$packAge == null ? other$packAge != null : !this$packAge.equals(other$packAge)) return false;
        final Object this$signType = this.getSignType();
        final Object other$signType = other.getSignType();
        if (this$signType == null ? other$signType != null : !this$signType.equals(other$signType)) return false;
        final Object this$paySign = this.getPaySign();
        final Object other$paySign = other.getPaySign();
        if (this$paySign == null ? other$paySign != null : !this$paySign.equals(other$paySign)) return false;
        final Object this$orderAmount = this.getOrderAmount();
        final Object other$orderAmount = other.getOrderAmount();
        if (this$orderAmount == null ? other$orderAmount != null : !this$orderAmount.equals(other$orderAmount))
            return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (this$outTradeNo == null ? other$outTradeNo != null : !this$outTradeNo.equals(other$outTradeNo))
            return false;
        final Object this$mwebUrl = this.getMwebUrl();
        final Object other$mwebUrl = other.getMwebUrl();
        if (this$mwebUrl == null ? other$mwebUrl != null : !this$mwebUrl.equals(other$mwebUrl)) return false;
        final Object this$body = this.getBody();
        final Object other$body = other.getBody();
        if (this$body == null ? other$body != null : !this$body.equals(other$body)) return false;
        final Object this$codeUrl = this.getCodeUrl();
        final Object other$codeUrl = other.getCodeUrl();
        if (this$codeUrl == null ? other$codeUrl != null : !this$codeUrl.equals(other$codeUrl)) return false;
        final Object this$attach = this.getAttach();
        final Object other$attach = other.getAttach();
        if (this$attach == null ? other$attach != null : !this$attach.equals(other$attach)) return false;
        final Object this$payPlatformEnum = this.getPayPlatformEnum();
        final Object other$payPlatformEnum = other.getPayPlatformEnum();
        if (this$payPlatformEnum == null ? other$payPlatformEnum != null : !this$payPlatformEnum.equals(other$payPlatformEnum))
            return false;
        final Object this$prepayId = this.getPrepayId();
        final Object other$prepayId = other.getPrepayId();
        if (this$prepayId == null ? other$prepayId != null : !this$prepayId.equals(other$prepayId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PayResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $prePayParams = this.getPrePayParams();
        result = result * PRIME + ($prePayParams == null ? 43 : $prePayParams.hashCode());
        final Object $payUri = this.getPayUri();
        result = result * PRIME + ($payUri == null ? 43 : $payUri.hashCode());
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $timeStamp = this.getTimeStamp();
        result = result * PRIME + ($timeStamp == null ? 43 : $timeStamp.hashCode());
        final Object $nonceStr = this.getNonceStr();
        result = result * PRIME + ($nonceStr == null ? 43 : $nonceStr.hashCode());
        final Object $packAge = this.getPackAge();
        result = result * PRIME + ($packAge == null ? 43 : $packAge.hashCode());
        final Object $signType = this.getSignType();
        result = result * PRIME + ($signType == null ? 43 : $signType.hashCode());
        final Object $paySign = this.getPaySign();
        result = result * PRIME + ($paySign == null ? 43 : $paySign.hashCode());
        final Object $orderAmount = this.getOrderAmount();
        result = result * PRIME + ($orderAmount == null ? 43 : $orderAmount.hashCode());
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $mwebUrl = this.getMwebUrl();
        result = result * PRIME + ($mwebUrl == null ? 43 : $mwebUrl.hashCode());
        final Object $body = this.getBody();
        result = result * PRIME + ($body == null ? 43 : $body.hashCode());
        final Object $codeUrl = this.getCodeUrl();
        result = result * PRIME + ($codeUrl == null ? 43 : $codeUrl.hashCode());
        final Object $attach = this.getAttach();
        result = result * PRIME + ($attach == null ? 43 : $attach.hashCode());
        final Object $payPlatformEnum = this.getPayPlatformEnum();
        result = result * PRIME + ($payPlatformEnum == null ? 43 : $payPlatformEnum.hashCode());
        final Object $prepayId = this.getPrepayId();
        result = result * PRIME + ($prepayId == null ? 43 : $prepayId.hashCode());
        return result;
    }

    public String toString() {
        return "PayResponse(prePayParams=" + this.getPrePayParams() + ", payUri=" + this.getPayUri() + ", appId=" + this.getAppId() + ", timeStamp=" + this.getTimeStamp() + ", nonceStr=" + this.getNonceStr() + ", packAge=" + this.getPackAge() + ", signType=" + this.getSignType() + ", paySign=" + this.getPaySign() + ", orderAmount=" + this.getOrderAmount() + ", orderId=" + this.getOrderId() + ", outTradeNo=" + this.getOutTradeNo() + ", mwebUrl=" + this.getMwebUrl() + ", body=" + this.getBody() + ", codeUrl=" + this.getCodeUrl() + ", attach=" + this.getAttach() + ", payPlatformEnum=" + this.getPayPlatformEnum() + ", prepayId=" + this.getPrepayId() + ")";
    }
}
