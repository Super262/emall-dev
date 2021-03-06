package com.lly835.bestpay.model.wxpay.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;

/**
 * 异步返回参数
 */
@Root(name = "xml", strict = false)
public class WxPayAsyncResponse {

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

    @Element(name = "openid", required = false)
    private String openid;

    @Element(name = "is_subscribe", required = false)
    private String isSubscribe;

    @Element(name = "trade_type", required = false)
    private String tradeType;

    @Element(name = "bank_type", required = false)
    private String bankType;

    @Element(name = "total_fee", required = false)
    private Integer totalFee;

    @Element(name = "fee_type", required = false)
    private String feeType;

    @Element(name = "cash_fee", required = false)
    private String cashFee;

    @Element(name = "cash_fee_type", required = false)
    private String cashFeeType;

    @Element(name = "coupon_fee", required = false)
    private String couponFee;

    @Element(name = "coupon_count", required = false)
    private String couponCount;

    @Element(name = "transaction_id", required = false)
    private String transactionId;

    @Element(name = "out_trade_no", required = false)
    private String outTradeNo;

    @Element(name = "attach", required = false)
    private String attach;

    @Element(name = "time_end", required = false)
    private String timeEnd;

    @Element(name = "mweb_url", required = false)
    private String mwebUrl;

    //支付优惠时多返回字段
    @Element(name = "settlement_total_fee", required = false)
    private Integer settlementTotalFee;

    @Element(name = "coupon_type", required = false)
    private String couponType;

    public WxPayAsyncResponse() {
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

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIsSubscribe() {
        return this.isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getBankType() {
        return this.bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public Integer getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getFeeType() {
        return this.feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getCashFee() {
        return this.cashFee;
    }

    public void setCashFee(String cashFee) {
        this.cashFee = cashFee;
    }

    public String getCashFeeType() {
        return this.cashFeeType;
    }

    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType;
    }

    public String getCouponFee() {
        return this.couponFee;
    }

    public void setCouponFee(String couponFee) {
        this.couponFee = couponFee;
    }

    public String getCouponCount() {
        return this.couponCount;
    }

    public void setCouponCount(String couponCount) {
        this.couponCount = couponCount;
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

    public String getAttach() {
        return this.attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTimeEnd() {
        return this.timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getMwebUrl() {
        return this.mwebUrl;
    }

    public void setMwebUrl(String mwebUrl) {
        this.mwebUrl = mwebUrl;
    }

    public Integer getSettlementTotalFee() {
        return this.settlementTotalFee;
    }

    public void setSettlementTotalFee(Integer settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    public String getCouponType() {
        return this.couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxPayAsyncResponse)) return false;
        final WxPayAsyncResponse other = (WxPayAsyncResponse) o;
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
        final Object this$deviceInfo = this.getDeviceInfo();
        final Object other$deviceInfo = other.getDeviceInfo();
        if (!Objects.equals(this$deviceInfo,other$deviceInfo)) return false;
        final Object this$nonceStr = this.getNonceStr();
        final Object other$nonceStr = other.getNonceStr();
        if (!Objects.equals(this$nonceStr,other$nonceStr)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (!Objects.equals(this$sign,other$sign)) return false;
        final Object this$resultCode = this.getResultCode();
        final Object other$resultCode = other.getResultCode();
        if (!Objects.equals(this$resultCode,other$resultCode)) return false;
        final Object this$errCode = this.getErrCode();
        final Object other$errCode = other.getErrCode();
        if (!Objects.equals(this$errCode,other$errCode)) return false;
        final Object this$errCodeDes = this.getErrCodeDes();
        final Object other$errCodeDes = other.getErrCodeDes();
        if (!Objects.equals(this$errCodeDes,other$errCodeDes)) return false;
        final Object this$openid = this.getOpenid();
        final Object other$openid = other.getOpenid();
        if (!Objects.equals(this$openid,other$openid)) return false;
        final Object this$isSubscribe = this.getIsSubscribe();
        final Object other$isSubscribe = other.getIsSubscribe();
        if (!Objects.equals(this$isSubscribe,other$isSubscribe)) return false;
        final Object this$tradeType = this.getTradeType();
        final Object other$tradeType = other.getTradeType();
        if (!Objects.equals(this$tradeType,other$tradeType)) return false;
        final Object this$bankType = this.getBankType();
        final Object other$bankType = other.getBankType();
        if (!Objects.equals(this$bankType,other$bankType)) return false;
        final Object this$totalFee = this.getTotalFee();
        final Object other$totalFee = other.getTotalFee();
        if (!Objects.equals(this$totalFee,other$totalFee)) return false;
        final Object this$feeType = this.getFeeType();
        final Object other$feeType = other.getFeeType();
        if (!Objects.equals(this$feeType,other$feeType)) return false;
        final Object this$cashFee = this.getCashFee();
        final Object other$cashFee = other.getCashFee();
        if (!Objects.equals(this$cashFee,other$cashFee)) return false;
        final Object this$cashFeeType = this.getCashFeeType();
        final Object other$cashFeeType = other.getCashFeeType();
        if (!Objects.equals(this$cashFeeType,other$cashFeeType)) return false;
        final Object this$couponFee = this.getCouponFee();
        final Object other$couponFee = other.getCouponFee();
        if (!Objects.equals(this$couponFee,other$couponFee)) return false;
        final Object this$couponCount = this.getCouponCount();
        final Object other$couponCount = other.getCouponCount();
        if (!Objects.equals(this$couponCount,other$couponCount)) return false;
        final Object this$transactionId = this.getTransactionId();
        final Object other$transactionId = other.getTransactionId();
        if (!Objects.equals(this$transactionId,other$transactionId)) return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (!Objects.equals(this$outTradeNo,other$outTradeNo)) return false;
        final Object this$attach = this.getAttach();
        final Object other$attach = other.getAttach();
        if (!Objects.equals(this$attach,other$attach)) return false;
        final Object this$timeEnd = this.getTimeEnd();
        final Object other$timeEnd = other.getTimeEnd();
        if (!Objects.equals(this$timeEnd,other$timeEnd)) return false;
        final Object this$mwebUrl = this.getMwebUrl();
        final Object other$mwebUrl = other.getMwebUrl();
        if (!Objects.equals(this$mwebUrl,other$mwebUrl)) return false;
        final Object this$settlementTotalFee = this.getSettlementTotalFee();
        final Object other$settlementTotalFee = other.getSettlementTotalFee();
        if (!Objects.equals(this$settlementTotalFee,other$settlementTotalFee)) return false;
        final Object this$couponType = this.getCouponType();
        final Object other$couponType = other.getCouponType();
        return Objects.equals(this$couponType,other$couponType);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxPayAsyncResponse;
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
        final Object $openid = this.getOpenid();
        result = result * PRIME + ($openid == null ? 43 : $openid.hashCode());
        final Object $isSubscribe = this.getIsSubscribe();
        result = result * PRIME + ($isSubscribe == null ? 43 : $isSubscribe.hashCode());
        final Object $tradeType = this.getTradeType();
        result = result * PRIME + ($tradeType == null ? 43 : $tradeType.hashCode());
        final Object $bankType = this.getBankType();
        result = result * PRIME + ($bankType == null ? 43 : $bankType.hashCode());
        final Object $totalFee = this.getTotalFee();
        result = result * PRIME + ($totalFee == null ? 43 : $totalFee.hashCode());
        final Object $feeType = this.getFeeType();
        result = result * PRIME + ($feeType == null ? 43 : $feeType.hashCode());
        final Object $cashFee = this.getCashFee();
        result = result * PRIME + ($cashFee == null ? 43 : $cashFee.hashCode());
        final Object $cashFeeType = this.getCashFeeType();
        result = result * PRIME + ($cashFeeType == null ? 43 : $cashFeeType.hashCode());
        final Object $couponFee = this.getCouponFee();
        result = result * PRIME + ($couponFee == null ? 43 : $couponFee.hashCode());
        final Object $couponCount = this.getCouponCount();
        result = result * PRIME + ($couponCount == null ? 43 : $couponCount.hashCode());
        final Object $transactionId = this.getTransactionId();
        result = result * PRIME + ($transactionId == null ? 43 : $transactionId.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $attach = this.getAttach();
        result = result * PRIME + ($attach == null ? 43 : $attach.hashCode());
        final Object $timeEnd = this.getTimeEnd();
        result = result * PRIME + ($timeEnd == null ? 43 : $timeEnd.hashCode());
        final Object $mwebUrl = this.getMwebUrl();
        result = result * PRIME + ($mwebUrl == null ? 43 : $mwebUrl.hashCode());
        final Object $settlementTotalFee = this.getSettlementTotalFee();
        result = result * PRIME + ($settlementTotalFee == null ? 43 : $settlementTotalFee.hashCode());
        final Object $couponType = this.getCouponType();
        result = result * PRIME + ($couponType == null ? 43 : $couponType.hashCode());
        return result;
    }

    public String toString() {
        return "WxPayAsyncResponse(returnCode=" + this.getReturnCode() + ", returnMsg=" + this.getReturnMsg() + ", appid=" + this.getAppid() + ", mchId=" + this.getMchId() + ", deviceInfo=" + this.getDeviceInfo() + ", nonceStr=" + this.getNonceStr() + ", sign=" + this.getSign() + ", resultCode=" + this.getResultCode() + ", errCode=" + this.getErrCode() + ", errCodeDes=" + this.getErrCodeDes() + ", openid=" + this.getOpenid() + ", isSubscribe=" + this.getIsSubscribe() + ", tradeType=" + this.getTradeType() + ", bankType=" + this.getBankType() + ", totalFee=" + this.getTotalFee() + ", feeType=" + this.getFeeType() + ", cashFee=" + this.getCashFee() + ", cashFeeType=" + this.getCashFeeType() + ", couponFee=" + this.getCouponFee() + ", couponCount=" + this.getCouponCount() + ", transactionId=" + this.getTransactionId() + ", outTradeNo=" + this.getOutTradeNo() + ", attach=" + this.getAttach() + ", timeEnd=" + this.getTimeEnd() + ", mwebUrl=" + this.getMwebUrl() + ", settlementTotalFee=" + this.getSettlementTotalFee() + ", couponType=" + this.getCouponType() + ")";
    }
}