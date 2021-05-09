package com.lly835.bestpay.model.wxpay.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;

/**
 * 退款请求参数
 */
@Root(name = "xml", strict = false)
public class WxPayRefundRequest {

    @Element(name = "appid")
    private String appid;

    @Element(name = "mch_id")
    private String mchId;

    @Element(name = "nonce_str")
    private String nonceStr;

    @Element(name = "sign")
    private String sign;

    @Element(name = "sign_type", required = false)
    private String signType;

    @Element(name = "transaction_id", required = false)
    private String transactionId;

    @Element(name = "out_trade_no")
    private String outTradeNo;

    @Element(name = "out_refund_no")
    private String outRefundNo;

    @Element(name = "total_fee")
    private Integer totalFee;

    @Element(name = "refund_fee")
    private Integer refundFee;

    @Element(name = "refund_fee_type", required = false)
    private String refundFeeType;

    @Element(name = "refund_desc", required = false)
    private String refundDesc;

    @Element(name = "refund_account", required = false)
    private String refundAccount;

    public WxPayRefundRequest() {
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

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSignType() {
        return this.signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutRefundNo() {
        return this.outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public Integer getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getRefundFee() {
        return this.refundFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    public String getRefundFeeType() {
        return this.refundFeeType;
    }

    public void setRefundFeeType(String refundFeeType) {
        this.refundFeeType = refundFeeType;
    }

    public String getRefundDesc() {
        return this.refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getRefundAccount() {
        return this.refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxPayRefundRequest)) return false;
        final WxPayRefundRequest other = (WxPayRefundRequest) o;
        if (!other.canEqual(this)) return false;
        final Object this$appid = this.getAppid();
        final Object other$appid = other.getAppid();
        if (!Objects.equals(this$appid,other$appid)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (!Objects.equals(this$mchId,other$mchId)) return false;
        final Object this$nonceStr = this.getNonceStr();
        final Object other$nonceStr = other.getNonceStr();
        if (!Objects.equals(this$nonceStr,other$nonceStr)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (!Objects.equals(this$sign,other$sign)) return false;
        final Object this$signType = this.getSignType();
        final Object other$signType = other.getSignType();
        if (!Objects.equals(this$signType,other$signType)) return false;
        final Object this$transactionId = this.getTransactionId();
        final Object other$transactionId = other.getTransactionId();
        if (!Objects.equals(this$transactionId,other$transactionId)) return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (!Objects.equals(this$outTradeNo,other$outTradeNo)) return false;
        final Object this$outRefundNo = this.getOutRefundNo();
        final Object other$outRefundNo = other.getOutRefundNo();
        if (!Objects.equals(this$outRefundNo,other$outRefundNo)) return false;
        final Object this$totalFee = this.getTotalFee();
        final Object other$totalFee = other.getTotalFee();
        if (!Objects.equals(this$totalFee,other$totalFee)) return false;
        final Object this$refundFee = this.getRefundFee();
        final Object other$refundFee = other.getRefundFee();
        if (!Objects.equals(this$refundFee,other$refundFee)) return false;
        final Object this$refundFeeType = this.getRefundFeeType();
        final Object other$refundFeeType = other.getRefundFeeType();
        if (!Objects.equals(this$refundFeeType,other$refundFeeType)) return false;
        final Object this$refundDesc = this.getRefundDesc();
        final Object other$refundDesc = other.getRefundDesc();
        if (!Objects.equals(this$refundDesc,other$refundDesc)) return false;
        final Object this$refundAccount = this.getRefundAccount();
        final Object other$refundAccount = other.getRefundAccount();
        return Objects.equals(this$refundAccount,other$refundAccount);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxPayRefundRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appid = this.getAppid();
        result = result * PRIME + ($appid == null ? 43 : $appid.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $nonceStr = this.getNonceStr();
        result = result * PRIME + ($nonceStr == null ? 43 : $nonceStr.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        final Object $signType = this.getSignType();
        result = result * PRIME + ($signType == null ? 43 : $signType.hashCode());
        final Object $transactionId = this.getTransactionId();
        result = result * PRIME + ($transactionId == null ? 43 : $transactionId.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $outRefundNo = this.getOutRefundNo();
        result = result * PRIME + ($outRefundNo == null ? 43 : $outRefundNo.hashCode());
        final Object $totalFee = this.getTotalFee();
        result = result * PRIME + ($totalFee == null ? 43 : $totalFee.hashCode());
        final Object $refundFee = this.getRefundFee();
        result = result * PRIME + ($refundFee == null ? 43 : $refundFee.hashCode());
        final Object $refundFeeType = this.getRefundFeeType();
        result = result * PRIME + ($refundFeeType == null ? 43 : $refundFeeType.hashCode());
        final Object $refundDesc = this.getRefundDesc();
        result = result * PRIME + ($refundDesc == null ? 43 : $refundDesc.hashCode());
        final Object $refundAccount = this.getRefundAccount();
        result = result * PRIME + ($refundAccount == null ? 43 : $refundAccount.hashCode());
        return result;
    }

    public String toString() {
        return "WxPayRefundRequest(appid=" + this.getAppid() + ", mchId=" + this.getMchId() + ", nonceStr=" + this.getNonceStr() + ", sign=" + this.getSign() + ", signType=" + this.getSignType() + ", transactionId=" + this.getTransactionId() + ", outTradeNo=" + this.getOutTradeNo() + ", outRefundNo=" + this.getOutRefundNo() + ", totalFee=" + this.getTotalFee() + ", refundFee=" + this.getRefundFee() + ", refundFeeType=" + this.getRefundFeeType() + ", refundDesc=" + this.getRefundDesc() + ", refundAccount=" + this.getRefundAccount() + ")";
    }
}
