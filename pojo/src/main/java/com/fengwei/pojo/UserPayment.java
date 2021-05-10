package com.fengwei.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "user_payment")
public class UserPayment {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private Long orderNo;

    /**
     * 支付平台:1-支付宝,2-微信
     */
    @Column(name = "payment_platform")
    private Integer paymentPlatform;

    /**
     * 支付流水号
     */
    @Column(name = "platform_number")
    private String platformNumber;

    /**
     * 支付状态
     */
    @Column(name = "platform_status")
    private String platformStatus;

    /**
     * 支付金额
     */
    @Column(name = "payment_amount")
    private BigDecimal paymentAmount;

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

    public UserPayment(Long orderNo,Integer paymentPlatform,String platformStatus,BigDecimal paymentAmount) {
        this.orderNo = orderNo;
        this.paymentPlatform = paymentPlatform;
        this.platformStatus = platformStatus;
        this.paymentAmount = paymentAmount;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取支付平台:1-支付宝,2-微信
     *
     * @return payment_platform - 支付平台:1-支付宝,2-微信
     */
    public Integer getPaymentPlatform() {
        return paymentPlatform;
    }

    /**
     * 设置支付平台:1-支付宝,2-微信
     *
     * @param paymentPlatform 支付平台:1-支付宝,2-微信
     */
    public void setPaymentPlatform(Integer paymentPlatform) {
        this.paymentPlatform = paymentPlatform;
    }

    /**
     * 获取支付流水号
     *
     * @return platform_number - 支付流水号
     */
    public String getPlatformNumber() {
        return platformNumber;
    }

    /**
     * 设置支付流水号
     *
     * @param platformNumber 支付流水号
     */
    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber;
    }

    /**
     * 获取支付状态
     *
     * @return platform_status - 支付状态
     */
    public String getPlatformStatus() {
        return platformStatus;
    }

    /**
     * 设置支付状态
     *
     * @param platformStatus 支付状态
     */
    public void setPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus;
    }

    /**
     * 获取支付金额
     *
     * @return payment_amount - 支付金额
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * 设置支付金额
     *
     * @param paymentAmount 支付金额
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
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