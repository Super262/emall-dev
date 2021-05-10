package com.fengwei.pojo.vo;


import com.fengwei.pojo.UserShipping;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class OrderVo {

    private Long orderNo;

    private BigDecimal payment;

    private Integer paymentType;

    private Integer postage;

    private Integer status;

    private Date paymentTime;

    private Date sendTime;

    private Date endTime;

    private Date closeTime;

    private Date createTime;

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

    public BigDecimal getPayment() {
        return this.payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
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

    public Date getPaymentTime() {
        return this.paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return this.closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        final Object this$payment = this.getPayment();
        final Object other$payment = other.getPayment();
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
        final Object this$paymentTime = this.getPaymentTime();
        final Object other$paymentTime = other.getPaymentTime();
        if (!Objects.equals(this$paymentTime,other$paymentTime))
            return false;
        final Object this$sendTime = this.getSendTime();
        final Object other$sendTime = other.getSendTime();
        if (!Objects.equals(this$sendTime,other$sendTime)) return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (!Objects.equals(this$endTime,other$endTime)) return false;
        final Object this$closeTime = this.getCloseTime();
        final Object other$closeTime = other.getCloseTime();
        if (!Objects.equals(this$closeTime,other$closeTime)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
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
        final Object $payment = this.getPayment();
        result = result * PRIME + ($payment == null ? 43 : $payment.hashCode());
        final Object $paymentType = this.getPaymentType();
        result = result * PRIME + ($paymentType == null ? 43 : $paymentType.hashCode());
        final Object $postage = this.getPostage();
        result = result * PRIME + ($postage == null ? 43 : $postage.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $paymentTime = this.getPaymentTime();
        result = result * PRIME + ($paymentTime == null ? 43 : $paymentTime.hashCode());
        final Object $sendTime = this.getSendTime();
        result = result * PRIME + ($sendTime == null ? 43 : $sendTime.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $closeTime = this.getCloseTime();
        result = result * PRIME + ($closeTime == null ? 43 : $closeTime.hashCode());
        final Object $createTime = this.getCreateTime();
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
        return "OrderVo(orderNo=" + this.getOrderNo() + ", payment=" + this.getPayment() + ", paymentType=" + this.getPaymentType() + ", postage=" + this.getPostage() + ", status=" + this.getStatus() + ", paymentTime=" + this.getPaymentTime() + ", sendTime=" + this.getSendTime() + ", endTime=" + this.getEndTime() + ", closeTime=" + this.getCloseTime() + ", createTime=" + this.getCreateTime() + ", orderItemVoList=" + this.getOrderItemVoList() + ", shippingId=" + this.getShippingId() + ", shippingVo=" + this.getShippingVo() + ")";
    }
}
