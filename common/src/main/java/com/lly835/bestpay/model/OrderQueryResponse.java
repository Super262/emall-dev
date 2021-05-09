package com.lly835.bestpay.model;

import com.lly835.bestpay.enums.OrderStatusEnum;

/**
 * 订单查询结果
 * Created by 廖师兄
 * 2018-06-04 16:52
 */
public class OrderQueryResponse {

    /**
     * 订单状态
     */
    private OrderStatusEnum orderStatusEnum;

    /**
     * 第三方支付的流水号
     */
    private String outTradeNo;

    /**
     * 附加内容，发起支付时传入
     */
    private String attach;

    /**
     * 错误原因
     */
    private String resultMsg;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 支付完成时间
     */
    private String finishTime;

    OrderQueryResponse(OrderStatusEnum orderStatusEnum,String outTradeNo,String attach,String resultMsg,String orderId,String finishTime) {
        this.orderStatusEnum = orderStatusEnum;
        this.outTradeNo = outTradeNo;
        this.attach = attach;
        this.resultMsg = resultMsg;
        this.orderId = orderId;
        this.finishTime = finishTime;
    }

    public static OrderQueryResponseBuilder builder() {
        return new OrderQueryResponseBuilder();
    }

    public OrderStatusEnum getOrderStatusEnum() {
        return this.orderStatusEnum;
    }

    public void setOrderStatusEnum(OrderStatusEnum orderStatusEnum) {
        this.orderStatusEnum = orderStatusEnum;
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

    public String getResultMsg() {
        return this.resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFinishTime() {
        return this.finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderQueryResponse)) return false;
        final OrderQueryResponse other = (OrderQueryResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderStatusEnum = this.getOrderStatusEnum();
        final Object other$orderStatusEnum = other.getOrderStatusEnum();
        if (this$orderStatusEnum == null ? other$orderStatusEnum != null : !this$orderStatusEnum.equals(other$orderStatusEnum))
            return false;
        final Object this$outTradeNo = this.getOutTradeNo();
        final Object other$outTradeNo = other.getOutTradeNo();
        if (this$outTradeNo == null ? other$outTradeNo != null : !this$outTradeNo.equals(other$outTradeNo))
            return false;
        final Object this$attach = this.getAttach();
        final Object other$attach = other.getAttach();
        if (this$attach == null ? other$attach != null : !this$attach.equals(other$attach)) return false;
        final Object this$resultMsg = this.getResultMsg();
        final Object other$resultMsg = other.getResultMsg();
        if (this$resultMsg == null ? other$resultMsg != null : !this$resultMsg.equals(other$resultMsg)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$finishTime = this.getFinishTime();
        final Object other$finishTime = other.getFinishTime();
        if (this$finishTime == null ? other$finishTime != null : !this$finishTime.equals(other$finishTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderQueryResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderStatusEnum = this.getOrderStatusEnum();
        result = result * PRIME + ($orderStatusEnum == null ? 43 : $orderStatusEnum.hashCode());
        final Object $outTradeNo = this.getOutTradeNo();
        result = result * PRIME + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
        final Object $attach = this.getAttach();
        result = result * PRIME + ($attach == null ? 43 : $attach.hashCode());
        final Object $resultMsg = this.getResultMsg();
        result = result * PRIME + ($resultMsg == null ? 43 : $resultMsg.hashCode());
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $finishTime = this.getFinishTime();
        result = result * PRIME + ($finishTime == null ? 43 : $finishTime.hashCode());
        return result;
    }

    public String toString() {
        return "OrderQueryResponse(orderStatusEnum=" + this.getOrderStatusEnum() + ", outTradeNo=" + this.getOutTradeNo() + ", attach=" + this.getAttach() + ", resultMsg=" + this.getResultMsg() + ", orderId=" + this.getOrderId() + ", finishTime=" + this.getFinishTime() + ")";
    }

    public static class OrderQueryResponseBuilder {
        private OrderStatusEnum orderStatusEnum;
        private String outTradeNo;
        private String attach;
        private String resultMsg;
        private String orderId;
        private String finishTime;

        OrderQueryResponseBuilder() {
        }

        public OrderQueryResponseBuilder orderStatusEnum(OrderStatusEnum orderStatusEnum) {
            this.orderStatusEnum = orderStatusEnum;
            return this;
        }

        public OrderQueryResponseBuilder outTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }

        public OrderQueryResponseBuilder attach(String attach) {
            this.attach = attach;
            return this;
        }

        public OrderQueryResponseBuilder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        public OrderQueryResponseBuilder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public OrderQueryResponseBuilder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        public OrderQueryResponse build() {
            return new OrderQueryResponse(orderStatusEnum,outTradeNo,attach,resultMsg,orderId,finishTime);
        }

        public String toString() {
            return "OrderQueryResponse.OrderQueryResponseBuilder(orderStatusEnum=" + this.orderStatusEnum + ", outTradeNo=" + this.outTradeNo + ", attach=" + this.attach + ", resultMsg=" + this.resultMsg + ", orderId=" + this.orderId + ", finishTime=" + this.finishTime + ")";
        }
    }
}
