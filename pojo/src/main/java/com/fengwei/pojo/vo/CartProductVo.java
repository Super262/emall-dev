package com.fengwei.pojo.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class CartProductVo {

    private String productId;

    /**
     * 购买的数量
     */
    private Integer quantity;

    private String productName;

    private String productSubtitle;

    private String productMainImage;

    private BigDecimal productPrice;

    private Integer productStatus;

    /**
     * 等于 quantity * productPrice
     */
    private BigDecimal productTotalPrice;

    private Integer productStock;

    /**
     * 商品是否选中
     */
    private Boolean productSelected;

    public CartProductVo(String productId,Integer quantity,String productName,String productSubtitle,String productMainImage,BigDecimal productPrice,Integer productStatus,BigDecimal productTotalPrice,Integer productStock,Boolean productSelected) {
        this.productId = productId;
        this.quantity = quantity;
        this.productName = productName;
        this.productSubtitle = productSubtitle;
        this.productMainImage = productMainImage;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
        this.productTotalPrice = productTotalPrice;
        this.productStock = productStock;
        this.productSelected = productSelected;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSubtitle() {
        return this.productSubtitle;
    }

    public void setProductSubtitle(String productSubtitle) {
        this.productSubtitle = productSubtitle;
    }

    public String getProductMainImage() {
        return this.productMainImage;
    }

    public void setProductMainImage(String productMainImage) {
        this.productMainImage = productMainImage;
    }

    public BigDecimal getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStatus() {
        return this.productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public BigDecimal getProductTotalPrice() {
        return this.productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    public Integer getProductStock() {
        return this.productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Boolean getProductSelected() {
        return this.productSelected;
    }

    public void setProductSelected(Boolean productSelected) {
        this.productSelected = productSelected;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartProductVo)) return false;
        final CartProductVo other = (CartProductVo) o;
        if (!other.canEqual(this)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (!Objects.equals(this$productId,other$productId)) return false;
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        if (!Objects.equals(this$quantity,other$quantity)) return false;
        final Object this$productName = this.getProductName();
        final Object other$productName = other.getProductName();
        if (!Objects.equals(this$productName,other$productName)) return false;
        final Object this$productSubtitle = this.getProductSubtitle();
        final Object other$productSubtitle = other.getProductSubtitle();
        if (!Objects.equals(this$productSubtitle,other$productSubtitle)) return false;
        final Object this$productMainImage = this.getProductMainImage();
        final Object other$productMainImage = other.getProductMainImage();
        if (!Objects.equals(this$productMainImage,other$productMainImage)) return false;
        final Object this$productPrice = this.getProductPrice();
        final Object other$productPrice = other.getProductPrice();
        if (!Objects.equals(this$productPrice,other$productPrice)) return false;
        final Object this$productStatus = this.getProductStatus();
        final Object other$productStatus = other.getProductStatus();
        if (!Objects.equals(this$productStatus,other$productStatus)) return false;
        final Object this$productTotalPrice = this.getProductTotalPrice();
        final Object other$productTotalPrice = other.getProductTotalPrice();
        if (!Objects.equals(this$productTotalPrice,other$productTotalPrice)) return false;
        final Object this$productStock = this.getProductStock();
        final Object other$productStock = other.getProductStock();
        if (!Objects.equals(this$productStock,other$productStock)) return false;
        final Object this$productSelected = this.getProductSelected();
        final Object other$productSelected = other.getProductSelected();
        return Objects.equals(this$productSelected,other$productSelected);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartProductVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $quantity = this.getQuantity();
        result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
        final Object $productName = this.getProductName();
        result = result * PRIME + ($productName == null ? 43 : $productName.hashCode());
        final Object $productSubtitle = this.getProductSubtitle();
        result = result * PRIME + ($productSubtitle == null ? 43 : $productSubtitle.hashCode());
        final Object $productMainImage = this.getProductMainImage();
        result = result * PRIME + ($productMainImage == null ? 43 : $productMainImage.hashCode());
        final Object $productPrice = this.getProductPrice();
        result = result * PRIME + ($productPrice == null ? 43 : $productPrice.hashCode());
        final Object $productStatus = this.getProductStatus();
        result = result * PRIME + ($productStatus == null ? 43 : $productStatus.hashCode());
        final Object $productTotalPrice = this.getProductTotalPrice();
        result = result * PRIME + ($productTotalPrice == null ? 43 : $productTotalPrice.hashCode());
        final Object $productStock = this.getProductStock();
        result = result * PRIME + ($productStock == null ? 43 : $productStock.hashCode());
        final Object $productSelected = this.getProductSelected();
        result = result * PRIME + ($productSelected == null ? 43 : $productSelected.hashCode());
        return result;
    }

    public String toString() {
        return "CartProductVo(productId=" + this.getProductId() + ", quantity=" + this.getQuantity() + ", productName=" + this.getProductName() + ", productSubtitle=" + this.getProductSubtitle() + ", productMainImage=" + this.getProductMainImage() + ", productPrice=" + this.getProductPrice() + ", productStatus=" + this.getProductStatus() + ", productTotalPrice=" + this.getProductTotalPrice() + ", productStock=" + this.getProductStock() + ", productSelected=" + this.getProductSelected() + ")";
    }
}
