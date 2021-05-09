package com.lly835.bestpay.model.alipay.response;

import java.io.Serializable;

/**
 * Created by this on 2019/9/13 2:36
 */
public class AliPayAsyncResponse implements Serializable {


    /**
     * 通知时间
     */
    private String notifyTime;

    /**
     * 	通知的类型
     */
    private String notifyType;

    /**
     * 通知校验ID
     */
    private String notifyId;

    /**
     * 编码格式
     */
    private String charset;

    /**
     * 接口版本
     */
    private String version;

    /**
     * 签名类型
     */
    private String signType;

    /**
     * 签名
     */
    private String sign;

    /**
     * 授权方的app_id
     */
    private String authAppId;

    /**
     * 支付宝交易号
     */
    private  String tradeNo;

    /**
     * APP_ID
     */
    private String appId;

    /**
     * 商户订单号
     */
    private String outTradeNo;

    /**
     * 交易状态
     */
    private String tradeStatus;

    /**
     * 订单金额
     */
    private String totalAmount;

    /**
     * 实收金额
     */
    private String receiptAmount;

    /**
     * 付款金额
     */
    private String buyerPayAmount;

    /**
     * 订单标题
     */
    private String subject;

    /**
     * 商品描述
     */
    private String body;

    /**
     * 交易创建时间
     */
    private String gmtCreate;

    /**
     * 交易结束时间
     */
    private String gmtClose;

    public AliPayAsyncResponse() {
    }

    public String getNotifyTime() {
        return this.notifyTime;
    }

    public String getNotifyType() {
        return this.notifyType;
    }

    public String getNotifyId() {
        return this.notifyId;
    }

    public String getCharset() {
        return this.charset;
    }

    public String getVersion() {
        return this.version;
    }

    public String getSignType() {
        return this.signType;
    }

    public String getSign() {
        return this.sign;
    }

    public String getAuthAppId() {
        return this.authAppId;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public String getReceiptAmount() {
        return this.receiptAmount;
    }

    public String getBuyerPayAmount() {
        return this.buyerPayAmount;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getBody() {
        return this.body;
    }

    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public String getGmtClose() {
        return this.gmtClose;
    }

    public void setNotifyTime(String notifyTime) {
        this.notifyTime = notifyTime;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setAuthAppId(String authAppId) {
        this.authAppId = authAppId;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public void setBuyerPayAmount(String buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtClose(String gmtClose) {
        this.gmtClose = gmtClose;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AliPayAsyncResponse)) return false;
        final AliPayAsyncResponse other = (AliPayAsyncResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$notifyTime = this.getNotifyTime();
        final Object other$notifyTime = other.getNotifyTime();
        if (this$notifyTime == null ? other$notifyTime != null : !this$notifyTime.equals(other$notifyTime))
            return false;
        final Object this$notifyType = this.getNotifyType();
        final Object other$notifyType = other.getNotifyType();
        if (this$notifyType == null ? other$notifyType != null : !this$notifyType.equals(other$notifyType))
            return false;
        final Object this$notifyId = this.getNotifyId();
        final Object other$notifyId = other.getNotifyId();
        if (this$notifyId == null ? other$notifyId != null : !this$notifyId.equals(other$notifyId)) return false;
        final Object this$charset = this.getCharset();
        final Object other$charset = other.getCharset();
        if (this$charset == null ? other$charset != null : !this$charset.equals(other$charset)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$signType = this.getSignType();
        final Object other$signType = other.getSignType();
        if (this$signType == null ? other$signType != null : !this$signType.equals(other$signType)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (this$sign == null ? other$sign != null : !this$sign.equals(other$sign)) return false;
        final Object this$authAppId = this.getAuthAppId();
        final Object other$authAppId = other.getAuthAppId();
        if (this$authAppId == null ? other$authAppId != null : !this$authAppId.equals(other$authAppId)) return false;
        final Object this$tradeNo = this.getTradeNo();
        final Object other$tradeNo = other.getTradeNo();
        if (this$tradeNo == null ? other$tradeNo != null : !this$tradeNo.equals(other$tradeNo)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (this$appId == null ? other$appId != null : !this$appId.equals(other$appId)) return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (this$outTradeNo == null ? other$outTradeNo != null : !this$outTradeNo.equals(other$outTradeNo))
            return false;
        final Object this$tradeStatus = this.getTradeStatus();
        final Object other$tradeStatus = other.getTradeStatus();
        if (this$tradeStatus == null ? other$tradeStatus != null : !this$tradeStatus.equals(other$tradeStatus))
            return false;
        final Object this$totalAmount = this.getTotalAmount();
        final Object other$totalAmount = other.getTotalAmount();
        if (this$totalAmount == null ? other$totalAmount != null : !this$totalAmount.equals(other$totalAmount))
            return false;
        final Object this$receiptAmount = this.getReceiptAmount();
        final Object other$receiptAmount = other.getReceiptAmount();
        if (this$receiptAmount == null ? other$receiptAmount != null : !this$receiptAmount.equals(other$receiptAmount))
            return false;
        final Object this$buyerPayAmount = this.getBuyerPayAmount();
        final Object other$buyerPayAmount = other.getBuyerPayAmount();
        if (this$buyerPayAmount == null ? other$buyerPayAmount != null : !this$buyerPayAmount.equals(other$buyerPayAmount))
            return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$body = this.getBody();
        final Object other$body = other.getBody();
        if (this$body == null ? other$body != null : !this$body.equals(other$body)) return false;
        final Object this$gmtCreate = this.getGmtCreate();
        final Object other$gmtCreate = other.getGmtCreate();
        if (this$gmtCreate == null ? other$gmtCreate != null : !this$gmtCreate.equals(other$gmtCreate)) return false;
        final Object this$gmtClose = this.getGmtClose();
        final Object other$gmtClose = other.getGmtClose();
        if (this$gmtClose == null ? other$gmtClose != null : !this$gmtClose.equals(other$gmtClose)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AliPayAsyncResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $notifyTime = this.getNotifyTime();
        result = result * PRIME + ($notifyTime == null ? 43 : $notifyTime.hashCode());
        final Object $notifyType = this.getNotifyType();
        result = result * PRIME + ($notifyType == null ? 43 : $notifyType.hashCode());
        final Object $notifyId = this.getNotifyId();
        result = result * PRIME + ($notifyId == null ? 43 : $notifyId.hashCode());
        final Object $charset = this.getCharset();
        result = result * PRIME + ($charset == null ? 43 : $charset.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $signType = this.getSignType();
        result = result * PRIME + ($signType == null ? 43 : $signType.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        final Object $authAppId = this.getAuthAppId();
        result = result * PRIME + ($authAppId == null ? 43 : $authAppId.hashCode());
        final Object $tradeNo = this.getTradeNo();
        result = result * PRIME + ($tradeNo == null ? 43 : $tradeNo.hashCode());
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $tradeStatus = this.getTradeStatus();
        result = result * PRIME + ($tradeStatus == null ? 43 : $tradeStatus.hashCode());
        final Object $totalAmount = this.getTotalAmount();
        result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
        final Object $receiptAmount = this.getReceiptAmount();
        result = result * PRIME + ($receiptAmount == null ? 43 : $receiptAmount.hashCode());
        final Object $buyerPayAmount = this.getBuyerPayAmount();
        result = result * PRIME + ($buyerPayAmount == null ? 43 : $buyerPayAmount.hashCode());
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $body = this.getBody();
        result = result * PRIME + ($body == null ? 43 : $body.hashCode());
        final Object $gmtCreate = this.getGmtCreate();
        result = result * PRIME + ($gmtCreate == null ? 43 : $gmtCreate.hashCode());
        final Object $gmtClose = this.getGmtClose();
        result = result * PRIME + ($gmtClose == null ? 43 : $gmtClose.hashCode());
        return result;
    }

    public String toString() {
        return "AliPayAsyncResponse(notifyTime=" + this.getNotifyTime() + ", notifyType=" + this.getNotifyType() + ", notifyId=" + this.getNotifyId() + ", charset=" + this.getCharset() + ", version=" + this.getVersion() + ", signType=" + this.getSignType() + ", sign=" + this.getSign() + ", authAppId=" + this.getAuthAppId() + ", tradeNo=" + this.getTradeNo() + ", appId=" + this.getAppId() + ", outTradeNo=" + this.getOutTradeNo() + ", tradeStatus=" + this.getTradeStatus() + ", totalAmount=" + this.getTotalAmount() + ", receiptAmount=" + this.getReceiptAmount() + ", buyerPayAmount=" + this.getBuyerPayAmount() + ", subject=" + this.getSubject() + ", body=" + this.getBody() + ", gmtCreate=" + this.getGmtCreate() + ", gmtClose=" + this.getGmtClose() + ")";
    }
}
