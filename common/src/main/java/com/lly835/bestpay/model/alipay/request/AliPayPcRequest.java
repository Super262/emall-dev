package com.lly835.bestpay.model.alipay.request;

/**
 * Created by this
 * @date 2019/9/8 15:19
 */
public class AliPayPcRequest {

    /**
     * app_id
     */
    private String appId;
    /**
     * 接口名称
     */
    private String method;
    /**
     * 请求使用的编码格式，如utf-8,gbk,gb2312等
     */
    private String charset;
    /**
     * 生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
     */
    private String signType;
    /**
     * 商户请求参数的签名串，详见签名 https://docs.open.alipay.com/291/105974
     */
    private String sign;
    /**
     * 发送请求的时间，格式"yyyy-MM-dd HH:mm:ss"
     */
    private String timestamp;
    /**
     * 调用的接口版本，固定为：1.0
     */
    private String version;
    /**
     * 支付宝服务器主动通知商户服务器里指定的页面http/https路径。
     */
    private String notifyUrl;
    /**
     * 请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档
     */
    private String bizContent;
    /**
     * HTTP/HTTPS开头字符串
     */
    private String returnUrl;

    public AliPayPcRequest() {
    }

    public String getAppId() {
        return this.appId;
    }

    public String getMethod() {
        return this.method;
    }

    public String getCharset() {
        return this.charset;
    }

    public String getSignType() {
        return this.signType;
    }

    public String getSign() {
        return this.sign;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getVersion() {
        return this.version;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public String getBizContent() {
        return this.bizContent;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AliPayPcRequest)) return false;
        final AliPayPcRequest other = (AliPayPcRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (this$appId == null ? other$appId != null : !this$appId.equals(other$appId)) return false;
        final Object this$method = this.getMethod();
        final Object other$method = other.getMethod();
        if (this$method == null ? other$method != null : !this$method.equals(other$method)) return false;
        final Object this$charset = this.getCharset();
        final Object other$charset = other.getCharset();
        if (this$charset == null ? other$charset != null : !this$charset.equals(other$charset)) return false;
        final Object this$signType = this.getSignType();
        final Object other$signType = other.getSignType();
        if (this$signType == null ? other$signType != null : !this$signType.equals(other$signType)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (this$sign == null ? other$sign != null : !this$sign.equals(other$sign)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$notifyUrl = this.getNotifyUrl();
        final Object other$notifyUrl = other.getNotifyUrl();
        if (this$notifyUrl == null ? other$notifyUrl != null : !this$notifyUrl.equals(other$notifyUrl)) return false;
        final Object this$bizContent = this.getBizContent();
        final Object other$bizContent = other.getBizContent();
        if (this$bizContent == null ? other$bizContent != null : !this$bizContent.equals(other$bizContent))
            return false;
        final Object this$returnUrl = this.getReturnUrl();
        final Object other$returnUrl = other.getReturnUrl();
        if (this$returnUrl == null ? other$returnUrl != null : !this$returnUrl.equals(other$returnUrl)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AliPayPcRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $method = this.getMethod();
        result = result * PRIME + ($method == null ? 43 : $method.hashCode());
        final Object $charset = this.getCharset();
        result = result * PRIME + ($charset == null ? 43 : $charset.hashCode());
        final Object $signType = this.getSignType();
        result = result * PRIME + ($signType == null ? 43 : $signType.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $notifyUrl = this.getNotifyUrl();
        result = result * PRIME + ($notifyUrl == null ? 43 : $notifyUrl.hashCode());
        final Object $bizContent = this.getBizContent();
        result = result * PRIME + ($bizContent == null ? 43 : $bizContent.hashCode());
        final Object $returnUrl = this.getReturnUrl();
        result = result * PRIME + ($returnUrl == null ? 43 : $returnUrl.hashCode());
        return result;
    }

    public String toString() {
        return "AliPayPcRequest(appId=" + this.getAppId() + ", method=" + this.getMethod() + ", charset=" + this.getCharset() + ", signType=" + this.getSignType() + ", sign=" + this.getSign() + ", timestamp=" + this.getTimestamp() + ", version=" + this.getVersion() + ", notifyUrl=" + this.getNotifyUrl() + ", bizContent=" + this.getBizContent() + ", returnUrl=" + this.getReturnUrl() + ")";
    }
}
