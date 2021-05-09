package com.lly835.bestpay.model;

/**
 * 退款返回的参数
 * Created by 廖师兄
 * 2017-07-08 23:40
 */
public class RefundResponse {

    /**
     * 订单号.
     */
    private String orderId;

    /**
     * 订单金额.
     */
    private Double orderAmount;

    /**
     * 第三方支付流水号.
     */
    private String outTradeNo;

    /**
     * 退款号.
     */
    private String refundId;

    /**
     * 第三方退款流水号.
     */
    private String outRefundNo;

    public RefundResponse() {
    }


    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getOrderAmount() {
        return this.orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getRefundId() {
        return this.refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getOutRefundNo() {
        return this.outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RefundResponse)) return false;
        final RefundResponse other = (RefundResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$orderAmount = this.getOrderAmount();
        final Object other$orderAmount = other.getOrderAmount();
        if (this$orderAmount == null ? other$orderAmount != null : !this$orderAmount.equals(other$orderAmount))
            return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (this$outTradeNo == null ? other$outTradeNo != null : !this$outTradeNo.equals(other$outTradeNo))
            return false;
        final Object this$refundId = this.getRefundId();
        final Object other$refundId = other.getRefundId();
        if (this$refundId == null ? other$refundId != null : !this$refundId.equals(other$refundId)) return false;
        final Object this$outRefundNo = this.getOutRefundNo();
        final Object other$outRefundNo = other.getOutRefundNo();
        if (this$outRefundNo == null ? other$outRefundNo != null : !this$outRefundNo.equals(other$outRefundNo))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RefundResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $orderAmount = this.getOrderAmount();
        result = result * PRIME + ($orderAmount == null ? 43 : $orderAmount.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $refundId = this.getRefundId();
        result = result * PRIME + ($refundId == null ? 43 : $refundId.hashCode());
        final Object $outRefundNo = this.getOutRefundNo();
        result = result * PRIME + ($outRefundNo == null ? 43 : $outRefundNo.hashCode());
        return result;
    }

    public String toString() {
        return "RefundResponse(orderId=" + this.getOrderId() + ", orderAmount=" + this.getOrderAmount() + ", outTradeNo=" + this.getOutTradeNo() + ", refundId=" + this.getRefundId() + ", outRefundNo=" + this.getOutRefundNo() + ")";
    }
}
