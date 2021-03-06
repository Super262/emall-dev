package com.lly835.bestpay.model;

import com.lly835.bestpay.enums.BestPayTypeEnum;

import java.util.Objects;

/**
 * 支付时请求参数
 */
public class RefundRequest {

    /**
     * 支付方式.
     */
    private BestPayTypeEnum payTypeEnum;

    /**
     * 订单号.
     */
    private String orderId;

    /**
     * 订单金额.
     */
    private Double orderAmount;

    public RefundRequest() {
    }

    public BestPayTypeEnum getPayTypeEnum() {
        return this.payTypeEnum;
    }

    public void setPayTypeEnum(BestPayTypeEnum payTypeEnum) {
        this.payTypeEnum = payTypeEnum;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RefundRequest)) return false;
        final RefundRequest other = (RefundRequest) o;
        if (!other.canEqual(this)) return false;
        final Object this$payTypeEnum = this.getPayTypeEnum();
        final Object other$payTypeEnum = other.getPayTypeEnum();
        if (!Objects.equals(this$payTypeEnum,other$payTypeEnum)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (!Objects.equals(this$orderId,other$orderId)) return false;
        final Object this$orderAmount = this.getOrderAmount();
        final Object other$orderAmount = other.getOrderAmount();
        return Objects.equals(this$orderAmount,other$orderAmount);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RefundRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $payTypeEnum = this.getPayTypeEnum();
        result = result * PRIME + ($payTypeEnum == null ? 43 : $payTypeEnum.hashCode());
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $orderAmount = this.getOrderAmount();
        result = result * PRIME + ($orderAmount == null ? 43 : $orderAmount.hashCode());
        return result;
    }

    public String toString() {
        return "RefundRequest(payTypeEnum=" + this.getPayTypeEnum() + ", orderId=" + this.getOrderId() + ", orderAmount=" + this.getOrderAmount() + ")";
    }
}
