package com.fengwei.pojo;

import java.util.Objects;

public class CartItem {

    private Integer productId;

    private Integer quantity;

    private Boolean productSelected;

    public CartItem() {
    }

    public CartItem(Integer productId,Integer quantity,Boolean productSelected) {
        this.productId = productId;
        this.quantity = quantity;
        this.productSelected = productSelected;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getProductSelected() {
        return this.productSelected;
    }

    public void setProductSelected(Boolean productSelected) {
        this.productSelected = productSelected;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartItem)) return false;
        final CartItem other = (CartItem) o;
        if (!other.canEqual(this)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (!Objects.equals(this$productId,other$productId)) return false;
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        if (!Objects.equals(this$quantity,other$quantity)) return false;
        final Object this$productSelected = this.getProductSelected();
        final Object other$productSelected = other.getProductSelected();
        return Objects.equals(this$productSelected,other$productSelected);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $quantity = this.getQuantity();
        result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
        final Object $productSelected = this.getProductSelected();
        result = result * PRIME + ($productSelected == null ? 43 : $productSelected.hashCode());
        return result;
    }

    public String toString() {
        return "CartItem(productId=" + this.getProductId() + ", quantity=" + this.getQuantity() + ", productSelected=" + this.getProductSelected() + ")";
    }
}
