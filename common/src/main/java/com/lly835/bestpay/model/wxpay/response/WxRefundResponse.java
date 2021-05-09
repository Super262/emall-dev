package com.lly835.bestpay.model.wxpay.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 微信退款返回参数
 * Created by 廖师兄
 * 2017-07-02 13:33
 */
@Root(name = "xml", strict = false) //name:要解析的xml数据的头部
public class WxRefundResponse {

    @Element(name = "return_code")
    private String returnCode;

    @Element(name = "return_msg", required = false)
    private String returnMsg;

    /**
     * 以下字段在return_code为SUCCESS的时候有返回.
     */
    @Element(name = "result_code", required = false)
    private String resultCode;

    @Element(name = "err_code", required = false)
    private String errCode;

    @Element(name = "err_code_des", required = false)
    private String errCodeDes;

    @Element(name = "appid", required = false)
    private String appid;

    @Element(name = "mch_id", required = false)
    private String mchId;

    @Element(name = "nonce_str", required = false)
    private String nonceStr;

    @Element(name = "sign", required = false)
    private String sign;

    @Element(name = "transaction_id", required = false)
    private String transactionId;

    @Element(name = "out_trade_no", required = false)
    private String outTradeNo;

    @Element(name = "out_refund_no", required = false)
    private String outRefundNo;

    @Element(name = "refund_id", required = false)
    private String refundId;

    @Element(name = "refund_fee", required = false)
    private Integer refundFee;

    @Element(name = "settlement_refund_fee", required = false)
    private Integer settlementRefundFee;

    @Element(name = "total_fee", required = false)
    private Integer totalFee;

    @Element(name = "settlement_total_fee", required = false)
    private Integer settlementTotalFee;

    @Element(name = "fee_type", required = false)
    private String feeType;

    @Element(name = "cash_fee", required = false)
    private Integer cashFee;

    @Element(name = "cash_fee_type", required = false)
    private String cashFeeType;

    @Element(name = "cash_refund_fee", required = false)
    private Integer cashRefundFee;

    @Element(name = "coupon_refund_fee", required = false)
    private Integer couponRefundFee;

    @Element(name = "coupon_refund_count", required = false)
    private Integer couponRefundCount;

    public WxRefundResponse() {
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

    public String getRefundId() {
        return this.refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public Integer getRefundFee() {
        return this.refundFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    public Integer getSettlementRefundFee() {
        return this.settlementRefundFee;
    }

    public void setSettlementRefundFee(Integer settlementRefundFee) {
        this.settlementRefundFee = settlementRefundFee;
    }

    public Integer getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getSettlementTotalFee() {
        return this.settlementTotalFee;
    }

    public void setSettlementTotalFee(Integer settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    public String getFeeType() {
        return this.feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Integer getCashFee() {
        return this.cashFee;
    }

    public void setCashFee(Integer cashFee) {
        this.cashFee = cashFee;
    }

    public String getCashFeeType() {
        return this.cashFeeType;
    }

    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType;
    }

    public Integer getCashRefundFee() {
        return this.cashRefundFee;
    }

    public void setCashRefundFee(Integer cashRefundFee) {
        this.cashRefundFee = cashRefundFee;
    }

    public Integer getCouponRefundFee() {
        return this.couponRefundFee;
    }

    public void setCouponRefundFee(Integer couponRefundFee) {
        this.couponRefundFee = couponRefundFee;
    }

    public Integer getCouponRefundCount() {
        return this.couponRefundCount;
    }

    public void setCouponRefundCount(Integer couponRefundCount) {
        this.couponRefundCount = couponRefundCount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxRefundResponse)) return false;
        final WxRefundResponse other = (WxRefundResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$returnCode = this.getReturnCode();
        final Object other$returnCode = other.getReturnCode();
        if (this$returnCode == null ? other$returnCode != null : !this$returnCode.equals(other$returnCode))
            return false;
        final Object this$returnMsg = this.getReturnMsg();
        final Object other$returnMsg = other.getReturnMsg();
        if (this$returnMsg == null ? other$returnMsg != null : !this$returnMsg.equals(other$returnMsg)) return false;
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
        final Object this$appid = this.getAppid();
        final Object other$appid = other.getAppid();
        if (this$appid == null ? other$appid != null : !this$appid.equals(other$appid)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (this$mchId == null ? other$mchId != null : !this$mchId.equals(other$mchId)) return false;
        final Object this$nonceStr = this.getNonceStr();
        final Object other$nonceStr = other.getNonceStr();
        if (this$nonceStr == null ? other$nonceStr != null : !this$nonceStr.equals(other$nonceStr)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (this$sign == null ? other$sign != null : !this$sign.equals(other$sign)) return false;
        final Object this$transactionId = this.getTransactionId();
        final Object other$transactionId = other.getTransactionId();
        if (this$transactionId == null ? other$transactionId != null : !this$transactionId.equals(other$transactionId))
            return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (this$outTradeNo == null ? other$outTradeNo != null : !this$outTradeNo.equals(other$outTradeNo))
            return false;
        final Object this$outRefundNo = this.getOutRefundNo();
        final Object other$outRefundNo = other.getOutRefundNo();
        if (this$outRefundNo == null ? other$outRefundNo != null : !this$outRefundNo.equals(other$outRefundNo))
            return false;
        final Object this$refundId = this.getRefundId();
        final Object other$refundId = other.getRefundId();
        if (this$refundId == null ? other$refundId != null : !this$refundId.equals(other$refundId)) return false;
        final Object this$refundFee = this.getRefundFee();
        final Object other$refundFee = other.getRefundFee();
        if (this$refundFee == null ? other$refundFee != null : !this$refundFee.equals(other$refundFee)) return false;
        final Object this$settlementRefundFee = this.getSettlementRefundFee();
        final Object other$settlementRefundFee = other.getSettlementRefundFee();
        if (this$settlementRefundFee == null ? other$settlementRefundFee != null : !this$settlementRefundFee.equals(other$settlementRefundFee))
            return false;
        final Object this$totalFee = this.getTotalFee();
        final Object other$totalFee = other.getTotalFee();
        if (this$totalFee == null ? other$totalFee != null : !this$totalFee.equals(other$totalFee)) return false;
        final Object this$settlementTotalFee = this.getSettlementTotalFee();
        final Object other$settlementTotalFee = other.getSettlementTotalFee();
        if (this$settlementTotalFee == null ? other$settlementTotalFee != null : !this$settlementTotalFee.equals(other$settlementTotalFee))
            return false;
        final Object this$feeType = this.getFeeType();
        final Object other$feeType = other.getFeeType();
        if (this$feeType == null ? other$feeType != null : !this$feeType.equals(other$feeType)) return false;
        final Object this$cashFee = this.getCashFee();
        final Object other$cashFee = other.getCashFee();
        if (this$cashFee == null ? other$cashFee != null : !this$cashFee.equals(other$cashFee)) return false;
        final Object this$cashFeeType = this.getCashFeeType();
        final Object other$cashFeeType = other.getCashFeeType();
        if (this$cashFeeType == null ? other$cashFeeType != null : !this$cashFeeType.equals(other$cashFeeType))
            return false;
        final Object this$cashRefundFee = this.getCashRefundFee();
        final Object other$cashRefundFee = other.getCashRefundFee();
        if (this$cashRefundFee == null ? other$cashRefundFee != null : !this$cashRefundFee.equals(other$cashRefundFee))
            return false;
        final Object this$couponRefundFee = this.getCouponRefundFee();
        final Object other$couponRefundFee = other.getCouponRefundFee();
        if (this$couponRefundFee == null ? other$couponRefundFee != null : !this$couponRefundFee.equals(other$couponRefundFee))
            return false;
        final Object this$couponRefundCount = this.getCouponRefundCount();
        final Object other$couponRefundCount = other.getCouponRefundCount();
        if (this$couponRefundCount == null ? other$couponRefundCount != null : !this$couponRefundCount.equals(other$couponRefundCount))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxRefundResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $returnCode = this.getReturnCode();
        result = result * PRIME + ($returnCode == null ? 43 : $returnCode.hashCode());
        final Object $returnMsg = this.getReturnMsg();
        result = result * PRIME + ($returnMsg == null ? 43 : $returnMsg.hashCode());
        final Object $resultCode = this.getResultCode();
        result = result * PRIME + ($resultCode == null ? 43 : $resultCode.hashCode());
        final Object $errCode = this.getErrCode();
        result = result * PRIME + ($errCode == null ? 43 : $errCode.hashCode());
        final Object $errCodeDes = this.getErrCodeDes();
        result = result * PRIME + ($errCodeDes == null ? 43 : $errCodeDes.hashCode());
        final Object $appid = this.getAppid();
        result = result * PRIME + ($appid == null ? 43 : $appid.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $nonceStr = this.getNonceStr();
        result = result * PRIME + ($nonceStr == null ? 43 : $nonceStr.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        final Object $transactionId = this.getTransactionId();
        result = result * PRIME + ($transactionId == null ? 43 : $transactionId.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $outRefundNo = this.getOutRefundNo();
        result = result * PRIME + ($outRefundNo == null ? 43 : $outRefundNo.hashCode());
        final Object $refundId = this.getRefundId();
        result = result * PRIME + ($refundId == null ? 43 : $refundId.hashCode());
        final Object $refundFee = this.getRefundFee();
        result = result * PRIME + ($refundFee == null ? 43 : $refundFee.hashCode());
        final Object $settlementRefundFee = this.getSettlementRefundFee();
        result = result * PRIME + ($settlementRefundFee == null ? 43 : $settlementRefundFee.hashCode());
        final Object $totalFee = this.getTotalFee();
        result = result * PRIME + ($totalFee == null ? 43 : $totalFee.hashCode());
        final Object $settlementTotalFee = this.getSettlementTotalFee();
        result = result * PRIME + ($settlementTotalFee == null ? 43 : $settlementTotalFee.hashCode());
        final Object $feeType = this.getFeeType();
        result = result * PRIME + ($feeType == null ? 43 : $feeType.hashCode());
        final Object $cashFee = this.getCashFee();
        result = result * PRIME + ($cashFee == null ? 43 : $cashFee.hashCode());
        final Object $cashFeeType = this.getCashFeeType();
        result = result * PRIME + ($cashFeeType == null ? 43 : $cashFeeType.hashCode());
        final Object $cashRefundFee = this.getCashRefundFee();
        result = result * PRIME + ($cashRefundFee == null ? 43 : $cashRefundFee.hashCode());
        final Object $couponRefundFee = this.getCouponRefundFee();
        result = result * PRIME + ($couponRefundFee == null ? 43 : $couponRefundFee.hashCode());
        final Object $couponRefundCount = this.getCouponRefundCount();
        result = result * PRIME + ($couponRefundCount == null ? 43 : $couponRefundCount.hashCode());
        return result;
    }

    public String toString() {
        return "WxRefundResponse(returnCode=" + this.getReturnCode() + ", returnMsg=" + this.getReturnMsg() + ", resultCode=" + this.getResultCode() + ", errCode=" + this.getErrCode() + ", errCodeDes=" + this.getErrCodeDes() + ", appid=" + this.getAppid() + ", mchId=" + this.getMchId() + ", nonceStr=" + this.getNonceStr() + ", sign=" + this.getSign() + ", transactionId=" + this.getTransactionId() + ", outTradeNo=" + this.getOutTradeNo() + ", outRefundNo=" + this.getOutRefundNo() + ", refundId=" + this.getRefundId() + ", refundFee=" + this.getRefundFee() + ", settlementRefundFee=" + this.getSettlementRefundFee() + ", totalFee=" + this.getTotalFee() + ", settlementTotalFee=" + this.getSettlementTotalFee() + ", feeType=" + this.getFeeType() + ", cashFee=" + this.getCashFee() + ", cashFeeType=" + this.getCashFeeType() + ", cashRefundFee=" + this.getCashRefundFee() + ", couponRefundFee=" + this.getCouponRefundFee() + ", couponRefundCount=" + this.getCouponRefundCount() + ")";
    }
}
