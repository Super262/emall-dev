package com.fengwei.pojo.vo;


import com.fengwei.pojo.UserShipping;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class OrderVo {

    private Long orderNo;

    private BigDecimal paymentAmount;

    private Integer paymentType;

    private Integer postage;

    private Integer status;

    private Date paidTime;

    private Date sentTime;

    private Date endedTime;

    private Date closedTime;

    private Date createdTime;

    private List<OrderItemVo> orderItemVoList;

    private Integer shippingId;

    private UserShipping shippingVo;

    public OrderVo() {
    }

    public Long getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getPaymentAmount() {
        return this.paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Integer getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getPostage() {
        return this.postage;
    }

    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPaidTime() {
        return this.paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Date getSentTime() {
        return this.sentTime;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public Date getEndedTime() {
        return this.endedTime;
    }

    public void setEndedTime(Date endedTime) {
        this.endedTime = endedTime;
    }

    public Date getClosedTime() {
        return this.closedTime;
    }

    public void setClosedTime(Date closedTime) {
        this.closedTime = closedTime;
    }

    public Date getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public List<OrderItemVo> getOrderItemVoList() {
        return this.orderItemVoList;
    }

    public void setOrderItemVoList(List<OrderItemVo> orderItemVoList) {
        this.orderItemVoList = orderItemVoList;
    }

    public Integer getShippingId() {
        return this.shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public UserShipping getShippingVo() {
        return this.shippingVo;
    }

    public void setShippingVo(UserShipping shippingVo) {
        this.shippingVo = shippingVo;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderVo)) return false;
        final OrderVo other = (OrderVo) o;
        if (!other.canEqual(this)) return false;
        final Object this$orderNo = this.getOrderNo();
        final Object other$orderNo = other.getOrderNo();
        if (!Objects.equals(this$orderNo,other$orderNo)) return false;
        final Object this$payment = this.getPaymentAmount();
        final Object other$payment = other.getPaymentAmount();
        if (!Objects.equals(this$payment,other$payment)) return false;
        final Object this$paymentType = this.getPaymentType();
        final Object other$paymentType = other.getPaymentType();
        if (!Objects.equals(this$paymentType,other$paymentType))
            return false;
        final Object this$postage = this.getPostage();
        final Object other$postage = other.getPostage();
        if (!Objects.equals(this$postage,other$postage)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (!Objects.equals(this$status,other$status)) return false;
        final Object this$paymentTime = this.getPaidTime();
        final Object other$paymentTime = other.getPaidTime();
        if (!Objects.equals(this$paymentTime,other$paymentTime))
            return false;
        final Object this$sendTime = this.getSentTime();
        final Object other$sendTime = other.getSentTime();
        if (!Objects.equals(this$sendTime,other$sendTime)) return false;
        final Object this$endTime = this.getEndedTime();
        final Object other$endTime = other.getEndedTime();
        if (!Objects.equals(this$endTime,other$endTime)) return false;
        final Object this$closeTime = this.getClosedTime();
        final Object other$closeTime = other.getClosedTime();
        if (!Objects.equals(this$closeTime,other$closeTime)) return false;
        final Object this$createTime = this.getCreatedTime();
        final Object other$createTime = other.getCreatedTime();
        if (!Objects.equals(this$createTime,other$createTime))
            return false;
        final Object this$orderItemVoList = this.getOrderItemVoList();
        final Object other$orderItemVoList = other.getOrderItemVoList();
        if (!Objects.equals(this$orderItemVoList,other$orderItemVoList))
            return false;
        final Object this$shippingId = this.getShippingId();
        final Object other$shippingId = other.getShippingId();
        if (!Objects.equals(this$shippingId,other$shippingId))
            return false;
        final Object this$shippingVo = this.getShippingVo();
        final Object other$shippingVo = other.getShippingVo();
        return Objects.equals(this$shippingVo,other$shippingVo);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderNo = this.getOrderNo();
        result = result * PRIME + ($orderNo == null ? 43 : $orderNo.hashCode());
        final Object $payment = this.getPaymentAmount();
        result = result * PRIME + ($payment == null ? 43 : $payment.hashCode());
        final Object $paymentType = this.getPaymentType();
        result = result * PRIME + ($paymentType == null ? 43 : $paymentType.hashCode());
        final Object $postage = this.getPostage();
        result = result * PRIME + ($postage == null ? 43 : $postage.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $paymentTime = this.getPaidTime();
        result = result * PRIME + ($paymentTime == null ? 43 : $paymentTime.hashCode());
        final Object $sendTime = this.getSentTime();
        result = result * PRIME + ($sendTime == null ? 43 : $sendTime.hashCode());
        final Object $endTime = this.getEndedTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $closeTime = this.getClosedTime();
        result = result * PRIME + ($closeTime == null ? 43 : $closeTime.hashCode());
        final Object $createTime = this.getCreatedTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $orderItemVoList = this.getOrderItemVoList();
        result = result * PRIME + ($orderItemVoList == null ? 43 : $orderItemVoList.hashCode());
        final Object $shippingId = this.getShippingId();
        result = result * PRIME + ($shippingId == null ? 43 : $shippingId.hashCode());
        final Object $shippingVo = this.getShippingVo();
        result = result * PRIME + ($shippingVo == null ? 43 : $shippingVo.hashCode());
        return result;
    }

    public String toString() {
        return "OrderVo(orderNo=" + this.getOrderNo() + ", payment=" + this.getPaymentAmount() + ", paymentType=" + this.getPaymentType() + ", postage=" + this.getPostage() + ", status=" + this.getStatus() + ", paymentTime=" + this.getPaidTime() + ", sendTime=" + this.getSentTime() + ", endTime=" + this.getEndedTime() + ", closeTime=" + this.getClosedTime() + ", createTime=" + this.getCreatedTime() + ", orderItemVoList=" + this.getOrderItemVoList() + ", shippingId=" + this.getShippingId() + ", shippingVo=" + this.getShippingVo() + ")";
    }
}
