package com.fengwei.pojo.vo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * 购物车
 */
public class CartVo {

    private List<CartProductVo> cartProductVoList;

    private Boolean selectedAll;

    private BigDecimal cartTotalPrice;

    private Integer cartTotalQuantity;

    public CartVo() {
    }

    public List<CartProductVo> getCartProductVoList() {
        return this.cartProductVoList;
    }

    public void setCartProductVoList(List<CartProductVo> cartProductVoList) {
        this.cartProductVoList = cartProductVoList;
    }

    public Boolean getSelectedAll() {
        return this.selectedAll;
    }

    public void setSelectedAll(Boolean selectedAll) {
        this.selectedAll = selectedAll;
    }

    public BigDecimal getCartTotalPrice() {
        return this.cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public Integer getCartTotalQuantity() {
        return this.cartTotalQuantity;
    }

    public void setCartTotalQuantity(Integer cartTotalQuantity) {
        this.cartTotalQuantity = cartTotalQuantity;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartVo)) return false;
        final CartVo other = (CartVo) o;
        if (!other.canEqual(this)) return false;
        final Object this$cartProductVoList = this.getCartProductVoList();
        final Object other$cartProductVoList = other.getCartProductVoList();
        if (!Objects.equals(this$cartProductVoList,other$cartProductVoList))
            return false;
        final Object this$selectedAll = this.getSelectedAll();
        final Object other$selectedAll = other.getSelectedAll();
        if (!Objects.equals(this$selectedAll,other$selectedAll))
            return false;
        final Object this$cartTotalPrice = this.getCartTotalPrice();
        final Object other$cartTotalPrice = other.getCartTotalPrice();
        if (!Objects.equals(this$cartTotalPrice,other$cartTotalPrice))
            return false;
        final Object this$cartTotalQuantity = this.getCartTotalQuantity();
        final Object other$cartTotalQuantity = other.getCartTotalQuantity();
        return Objects.equals(this$cartTotalQuantity,other$cartTotalQuantity);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cartProductVoList = this.getCartProductVoList();
        result = result * PRIME + ($cartProductVoList == null ? 43 : $cartProductVoList.hashCode());
        final Object $selectedAll = this.getSelectedAll();
        result = result * PRIME + ($selectedAll == null ? 43 : $selectedAll.hashCode());
        final Object $cartTotalPrice = this.getCartTotalPrice();
        result = result * PRIME + ($cartTotalPrice == null ? 43 : $cartTotalPrice.hashCode());
        final Object $cartTotalQuantity = this.getCartTotalQuantity();
        result = result * PRIME + ($cartTotalQuantity == null ? 43 : $cartTotalQuantity.hashCode());
        return result;
    }

    public String toString() {
        return "CartVo(cartProductVoList=" + this.getCartProductVoList() + ", selectedAll=" + this.getSelectedAll() + ", cartTotalPrice=" + this.getCartTotalPrice() + ", cartTotalQuantity=" + this.getCartTotalQuantity() + ")";
    }
}
