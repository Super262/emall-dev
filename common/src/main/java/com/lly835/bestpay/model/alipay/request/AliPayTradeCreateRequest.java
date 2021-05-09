package com.lly835.bestpay.model.alipay.request;

import com.lly835.bestpay.constants.AliPayConstants;

import java.util.Objects;

/**
 * https://docs.open.alipay.com/api_1/alipay.trade.create
 */
public class AliPayTradeCreateRequest {

    /**
     * app_id
     */
    private String appId;
    /**
     * 接口名称
     */
    private String method = "alipay.trade.create";
    /**
     * 请求使用的编码格式，如utf-8,gbk,gb2312等
     */
    private String charset = "utf-8";
    /**
     * 生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
     */
    private String signType = AliPayConstants.SIGN_TYPE_RSA2;
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
    private String version = "1.0";
    /**
     * 支付宝服务器主动通知商户服务器里指定的页面http/https路径。
     */
    private String notifyUrl;

    private String appAuthToken;

    /**
     * 请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档
     */
    private String bizContent;

    public AliPayTradeCreateRequest() {
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getCharset() {
        return this.charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getSignType() {
        return this.signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getAppAuthToken() {
        return this.appAuthToken;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }

    public String getBizContent() {
        return this.bizContent;
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AliPayTradeCreateRequest)) return false;
        final AliPayTradeCreateRequest other = (AliPayTradeCreateRequest) o;
        if (!other.canEqual(this)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (!Objects.equals(this$appId,other$appId)) return false;
        final Object this$method = this.getMethod();
        final Object other$method = other.getMethod();
        if (!Objects.equals(this$method,other$method)) return false;
        final Object this$charset = this.getCharset();
        final Object other$charset = other.getCharset();
        if (!Objects.equals(this$charset,other$charset)) return false;
        final Object this$signType = this.getSignType();
        final Object other$signType = other.getSignType();
        if (!Objects.equals(this$signType,other$signType)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (!Objects.equals(this$sign,other$sign)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (!Objects.equals(this$timestamp,other$timestamp)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (!Objects.equals(this$version,other$version)) return false;
        final Object this$notifyUrl = this.getNotifyUrl();
        final Object other$notifyUrl = other.getNotifyUrl();
        if (!Objects.equals(this$notifyUrl,other$notifyUrl)) return false;
        final Object this$appAuthToken = this.getAppAuthToken();
        final Object other$appAuthToken = other.getAppAuthToken();
        if (!Objects.equals(this$appAuthToken,other$appAuthToken)) return false;
        final Object this$bizContent = this.getBizContent();
        final Object other$bizContent = other.getBizContent();
        return Objects.equals(this$bizContent,other$bizContent);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AliPayTradeCreateRequest;
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
        final Object $appAuthToken = this.getAppAuthToken();
        result = result * PRIME + ($appAuthToken == null ? 43 : $appAuthToken.hashCode());
        final Object $bizContent = this.getBizContent();
        result = result * PRIME + ($bizContent == null ? 43 : $bizContent.hashCode());
        return result;
    }

    public String toString() {
        return "AliPayTradeCreateRequest(appId=" + this.getAppId() + ", method=" + this.getMethod() + ", charset=" + this.getCharset() + ", signType=" + this.getSignType() + ", sign=" + this.getSign() + ", timestamp=" + this.getTimestamp() + ", version=" + this.getVersion() + ", notifyUrl=" + this.getNotifyUrl() + ", appAuthToken=" + this.getAppAuthToken() + ", bizContent=" + this.getBizContent() + ")";
    }

    public static class BizContent {
        /**
         * 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。
         * trade_no,out_trade_no如果同时存在优先取trade_no
         */
        private String outTradeNo;

        /**
         * 订单总金额，单位为元
         */
        private Double totalAmount;

        /**
         * 订单标题
         */
        private String subject;

        /**
         * 买家支付宝账号(和buyer_id不能同时为空)
         * api文档上只剩buyer_id了，推荐使用buyer_id
         */
        private String buyerLogonId;

        /**
         * 买家的支付宝唯一用户号（2088开头的16位纯数字）
         * 获取方式见 https://docs.open.alipay.com/api_9/alipay.user.info.auth
         */
        private String buyerId;

        public BizContent() {
        }

        public String getOutTradeNo() {
            return this.outTradeNo;
        }

        public void setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
        }

        public Double getTotalAmount() {
            return this.totalAmount;
        }

        public void setTotalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
        }

        public String getSubject() {
            return this.subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getBuyerLogonId() {
            return this.buyerLogonId;
        }

        public void setBuyerLogonId(String buyerLogonId) {
            this.buyerLogonId = buyerLogonId;
        }

        public String getBuyerId() {
            return this.buyerId;
        }

        public void setBuyerId(String buyerId) {
            this.buyerId = buyerId;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof BizContent)) return false;
            final BizContent other = (BizContent) o;
            if (!other.canEqual(this)) return false;
            final Object this$outTradeNo = this.getOutTradeNo();
            final Object other$outTradeNo = other.getOutTradeNo();
            if (!Objects.equals(this$outTradeNo,other$outTradeNo)) return false;
            final Object this$totalAmount = this.getTotalAmount();
            final Object other$totalAmount = other.getTotalAmount();
            if (!Objects.equals(this$totalAmount,other$totalAmount)) return false;
            final Object this$subject = this.getSubject();
            final Object other$subject = other.getSubject();
            if (!Objects.equals(this$subject,other$subject)) return false;
            final Object this$buyerLogonId = this.getBuyerLogonId();
            final Object other$buyerLogonId = other.getBuyerLogonId();
            if (!Objects.equals(this$buyerLogonId,other$buyerLogonId)) return false;
            final Object this$buyerId = this.getBuyerId();
            final Object other$buyerId = other.getBuyerId();
            return Objects.equals(this$buyerId,other$buyerId);
        }

        protected boolean canEqual(final Object other) {
            return other instanceof BizContent;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $outTradeNo = this.getOutTradeNo();
            result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
            final Object $totalAmount = this.getTotalAmount();
            result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
            final Object $subject = this.getSubject();
            result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
            final Object $buyerLogonId = this.getBuyerLogonId();
            result = result * PRIME + ($buyerLogonId == null ? 43 : $buyerLogonId.hashCode());
            final Object $buyerId = this.getBuyerId();
            result = result * PRIME + ($buyerId == null ? 43 : $buyerId.hashCode());
            return result;
        }

        public String toString() {
            return "AliPayTradeCreateRequest.BizContent(outTradeNo=" + this.getOutTradeNo() + ", totalAmount=" + this.getTotalAmount() + ", subject=" + this.getSubject() + ", buyerLogonId=" + this.getBuyerLogonId() + ", buyerId=" + this.getBuyerId() + ")";
        }
    }
}
