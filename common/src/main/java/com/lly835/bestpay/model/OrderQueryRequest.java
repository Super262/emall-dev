package com.lly835.bestpay.model;

import com.lly835.bestpay.enums.BestPayPlatformEnum;

/**
 * 支付订单查询
 * Created by 廖师兄
 * 2018-05-31 17:52
 */
public class OrderQueryRequest {

    /**
     * 支付平台.
     */
    private BestPayPlatformEnum platformEnum;

    /**
     * 订单号(orderId 和 outOrderId 二选一，两个都传以outOrderId为准)
     */
    private String orderId = "";

    /**
     * 外部订单号(例如微信生成的)
     */
    private String outOrderId = "";

    public OrderQueryRequest() {
    }

    public BestPayPlatformEnum getPlatformEnum() {
        return this.platformEnum;
    }

    public void setPlatformEnum(BestPayPlatformEnum platformEnum) {
        this.platformEnum = platformEnum;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOutOrderId() {
        return this.outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderQueryRequest)) return false;
        final OrderQueryRequest other = (OrderQueryRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$platformEnum = this.getPlatformEnum();
        final Object other$platformEnum = other.getPlatformEnum();
        if (this$platformEnum == null ? other$platformEnum != null : !this$platformEnum.equals(other$platformEnum))
            return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$outOrderId = this.getOutOrderId();
        final Object other$outOrderId = other.getOutOrderId();
        if (this$outOrderId == null ? other$outOrderId != null : !this$outOrderId.equals(other$outOrderId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderQueryRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $platformEnum = this.getPlatformEnum();
        result = result * PRIME + ($platformEnum == null ? 43 : $platformEnum.hashCode());
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $outOrderId = this.getOutOrderId();
        result = result * PRIME + ($outOrderId == null ? 43 : $outOrderId.hashCode());
        return result;
    }

    public String toString() {
        return "OrderQueryRequest(platformEnum=" + this.getPlatformEnum() + ", orderId=" + this.getOrderId() + ", outOrderId=" + this.getOutOrderId() + ")";
    }
}
