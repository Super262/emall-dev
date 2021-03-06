package com.lly835.bestpay.model.alipay.request;

import com.lly835.bestpay.constants.AliPayConstants;

import java.util.Objects;

public class AliPayOrderQueryRequest {
    /**
     * app_id
     */
    private String appId;
    /**
     * 接口名称
     */
    private String method = "alipay.trade.query";

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
     * 详见应用授权概述
     * https://docs.open.alipay.com/20160728150111277227/intro
     */
    private String appAuthToken;

    /**
     * 请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档
     */
    private String bizContent;

    public AliPayOrderQueryRequest() {
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
        if (!(o instanceof AliPayOrderQueryRequest)) return false;
        final AliPayOrderQueryRequest other = (AliPayOrderQueryRequest) o;
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
        final Object this$appAuthToken = this.getAppAuthToken();
        final Object other$appAuthToken = other.getAppAuthToken();
        if (!Objects.equals(this$appAuthToken,other$appAuthToken)) return false;
        final Object this$bizContent = this.getBizContent();
        final Object other$bizContent = other.getBizContent();
        return Objects.equals(this$bizContent,other$bizContent);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AliPayOrderQueryRequest;
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
        final Object $appAuthToken = this.getAppAuthToken();
        result = result * PRIME + ($appAuthToken == null ? 43 : $appAuthToken.hashCode());
        final Object $bizContent = this.getBizContent();
        result = result * PRIME + ($bizContent == null ? 43 : $bizContent.hashCode());
        return result;
    }

    public String toString() {
        return "AliPayOrderQueryRequest(appId=" + this.getAppId() + ", method=" + this.getMethod() + ", charset=" + this.getCharset() + ", signType=" + this.getSignType() + ", sign=" + this.getSign() + ", timestamp=" + this.getTimestamp() + ", version=" + this.getVersion() + ", appAuthToken=" + this.getAppAuthToken() + ", bizContent=" + this.getBizContent() + ")";
    }

    public static class BizContent {
        /**
         * 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。
         * trade_no,out_trade_no如果同时存在优先取trade_no
         */
        private String outTradeNo;

        /**
         * 支付宝交易号，和商户订单号不能同时为空
         */
        private String tradeNo;

        /**
         * 银行间联模式下有用，其它场景请不要使用；
         * 双联通过该参数指定需要查询的交易所属收单机构的pid;
         */
        private String orgPid;

        /**
         * 查询选项，商户通过上送该字段来定制查询返回信息
         */
        private String queryOptions;

        public BizContent() {
        }

        public String getOutTradeNo() {
            return this.outTradeNo;
        }

        public void setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
        }

        public String getTradeNo() {
            return this.tradeNo;
        }

        public void setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
        }

        public String getOrgPid() {
            return this.orgPid;
        }

        public void setOrgPid(String orgPid) {
            this.orgPid = orgPid;
        }

        public String getQueryOptions() {
            return this.queryOptions;
        }

        public void setQueryOptions(String queryOptions) {
            this.queryOptions = queryOptions;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof BizContent)) return false;
            final BizContent other = (BizContent) o;
            if (!other.canEqual(this)) return false;
            final Object this$outTradeNo = this.getOutTradeNo();
            final Object other$outTradeNo = other.getOutTradeNo();
            if (!Objects.equals(this$outTradeNo,other$outTradeNo)) return false;
            final Object this$tradeNo = this.getTradeNo();
            final Object other$tradeNo = other.getTradeNo();
            if (!Objects.equals(this$tradeNo,other$tradeNo)) return false;
            final Object this$orgPid = this.getOrgPid();
            final Object other$orgPid = other.getOrgPid();
            if (!Objects.equals(this$orgPid,other$orgPid)) return false;
            final Object this$queryOptions = this.getQueryOptions();
            final Object other$queryOptions = other.getQueryOptions();
            return Objects.equals(this$queryOptions,other$queryOptions);
        }

        protected boolean canEqual(final Object other) {
            return other instanceof BizContent;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $outTradeNo = this.getOutTradeNo();
            result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
            final Object $tradeNo = this.getTradeNo();
            result = result * PRIME + ($tradeNo == null ? 43 : $tradeNo.hashCode());
            final Object $orgPid = this.getOrgPid();
            result = result * PRIME + ($orgPid == null ? 43 : $orgPid.hashCode());
            final Object $queryOptions = this.getQueryOptions();
            result = result * PRIME + ($queryOptions == null ? 43 : $queryOptions.hashCode());
            return result;
        }

        public String toString() {
            return "AliPayOrderQueryRequest.BizContent(outTradeNo=" + this.getOutTradeNo() + ", tradeNo=" + this.getTradeNo() + ", orgPid=" + this.getOrgPid() + ", queryOptions=" + this.getQueryOptions() + ")";
        }
    }
}
