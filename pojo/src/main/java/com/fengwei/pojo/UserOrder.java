package com.fengwei.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "user_order")
public class UserOrder {
    /**
     * 订单id
     */
    @Id
    private Integer id;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private Long orderNo;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "shipping_id")
    private Integer shippingId;

    /**
     * 实际付款金额,单位是元,保留两位小数
     */
    @Column(name = "payment_amount")
    private BigDecimal paymentAmount;

    /**
     * 支付类型,1-在线支付
     */
    @Column(name = "payment_type")
    private Integer paymentType;

    /**
     * 运费,单位是元
     */
    private Integer postage;

    /**
     * 订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     */
    private Integer status;

    /**
     * 支付时间
     */
    @Column(name = "paid_time")
    private Date paidTime;

    /**
     * 发货时间
     */
    @Column(name = "sent_time")
    private Date sentTime;

    /**
     * 交易完成时间
     */
    @Column(name = "ended_time")
    private Date endedTime;

    /**
     * 交易关闭时间
     */
    @Column(name = "closed_time")
    private Date closedTime;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取订单id
     *
     * @return id - 订单id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置订单id
     *
     * @param id 订单id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单号
     *
     * @return order_no - 订单号
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return shipping_id
     */
    public Integer getShippingId() {
        return shippingId;
    }

    /**
     * @param shippingId
     */
    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    /**
     * 获取实际付款金额,单位是元,保留两位小数
     *
     * @return payment_amount - 实际付款金额,单位是元,保留两位小数
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * 设置实际付款金额,单位是元,保留两位小数
     *
     * @param paymentAmount 实际付款金额,单位是元,保留两位小数
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * 获取支付类型,1-在线支付
     *
     * @return payment_type - 支付类型,1-在线支付
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * 设置支付类型,1-在线支付
     *
     * @param paymentType 支付类型,1-在线支付
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取运费,单位是元
     *
     * @return postage - 运费,单位是元
     */
    public Integer getPostage() {
        return postage;
    }

    /**
     * 设置运费,单位是元
     *
     * @param postage 运费,单位是元
     */
    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    /**
     * 获取订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     *
     * @return status - 订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     *
     * @param status 订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取支付时间
     *
     * @return paid_time - 支付时间
     */
    public Date getPaidTime() {
        return paidTime;
    }

    /**
     * 设置支付时间
     *
     * @param paidTime 支付时间
     */
    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    /**
     * 获取发货时间
     *
     * @return sent_time - 发货时间
     */
    public Date getSentTime() {
        return sentTime;
    }

    /**
     * 设置发货时间
     *
     * @param sentTime 发货时间
     */
    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    /**
     * 获取交易完成时间
     *
     * @return ended_time - 交易完成时间
     */
    public Date getEndedTime() {
        return endedTime;
    }

    /**
     * 设置交易完成时间
     *
     * @param endedTime 交易完成时间
     */
    public void setEndedTime(Date endedTime) {
        this.endedTime = endedTime;
    }

    /**
     * 获取交易关闭时间
     *
     * @return closed_time - 交易关闭时间
     */
    public Date getClosedTime() {
        return closedTime;
    }

    /**
     * 设置交易关闭时间
     *
     * @param closedTime 交易关闭时间
     */
    public void setClosedTime(Date closedTime) {
        this.closedTime = closedTime;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}