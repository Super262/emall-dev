package com.fengwei.pojo.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class OrderItemVo {

    private Long orderNo;

    private Integer productId;

    private String productName;

    private String productImage;

    private BigDecimal currentUnitPrice;

    private Integer quantity;

    private BigDecimal totalPrice;

    private Date createTime;

    public OrderItemVo() {
    }

    public Long getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return this.productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public BigDecimal getCurrentUnitPrice() {
        return this.currentUnitPrice;
    }

    public void setCurrentUnitPrice(BigDecimal currentUnitPrice) {
        this.currentUnitPrice = currentUnitPrice;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderItemVo)) return false;
        final OrderItemVo other = (OrderItemVo) o;
        if (!other.canEqual(this)) return false;
        final Object this$orderNo = this.getOrderNo();
        final Object other$orderNo = other.getOrderNo();
        if (!Objects.equals(this$orderNo,other$orderNo)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (!Objects.equals(this$productId,other$productId)) return false;
        final Object this$productName = this.getProductName();
        final Object other$productName = other.getProductName();
        if (!Objects.equals(this$productName,other$productName))
            return false;
        final Object this$productImage = this.getProductImage();
        final Object other$productImage = other.getProductImage();
        if (!Objects.equals(this$productImage,other$productImage))
            return false;
        final Object this$currentUnitPrice = this.getCurrentUnitPrice();
        final Object other$currentUnitPrice = other.getCurrentUnitPrice();
        if (!Objects.equals(this$currentUnitPrice,other$currentUnitPrice))
            return false;
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        if (!Objects.equals(this$quantity,other$quantity)) return false;
        final Object this$totalPrice = this.getTotalPrice();
        final Object other$totalPrice = other.getTotalPrice();
        if (!Objects.equals(this$totalPrice,other$totalPrice))
            return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        return Objects.equals(this$createTime,other$createTime);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderItemVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderNo = this.getOrderNo();
        result = result * PRIME + ($orderNo == null ? 43 : $orderNo.hashCode());
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $productName = this.getProductName();
        result = result * PRIME + ($productName == null ? 43 : $productName.hashCode());
        final Object $productImage = this.getProductImage();
        result = result * PRIME + ($productImage == null ? 43 : $productImage.hashCode());
        final Object $currentUnitPrice = this.getCurrentUnitPrice();
        result = result * PRIME + ($currentUnitPrice == null ? 43 : $currentUnitPrice.hashCode());
        final Object $quantity = this.getQuantity();
        result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
        final Object $totalPrice = this.getTotalPrice();
        result = result * PRIME + ($totalPrice == null ? 43 : $totalPrice.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "OrderItemVo(orderNo=" + this.getOrderNo() + ", productId=" + this.getProductId() + ", productName=" + this.getProductName() + ", productImage=" + this.getProductImage() + ", currentUnitPrice=" + this.getCurrentUnitPrice() + ", quantity=" + this.getQuantity() + ", totalPrice=" + this.getTotalPrice() + ", createTime=" + this.getCreateTime() + ")";
    }
}
