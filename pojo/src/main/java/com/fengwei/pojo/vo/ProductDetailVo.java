package com.fengwei.pojo.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class ProductDetailVo {

    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String mainImage;

    private String subImages;

    private String detail;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public ProductDetailVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMainImage() {
        return this.mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getSubImages() {
        return this.subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductDetailVo)) return false;
        final ProductDetailVo other = (ProductDetailVo) o;
        if (!other.canEqual(this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (!Objects.equals(this$id,other$id)) return false;
        final Object this$categoryId = this.getCategoryId();
        final Object other$categoryId = other.getCategoryId();
        if (!Objects.equals(this$categoryId,other$categoryId))
            return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (!Objects.equals(this$name,other$name)) return false;
        final Object this$subtitle = this.getSubtitle();
        final Object other$subtitle = other.getSubtitle();
        if (!Objects.equals(this$subtitle,other$subtitle)) return false;
        final Object this$mainImage = this.getMainImage();
        final Object other$mainImage = other.getMainImage();
        if (!Objects.equals(this$mainImage,other$mainImage)) return false;
        final Object this$subImages = this.getSubImages();
        final Object other$subImages = other.getSubImages();
        if (!Objects.equals(this$subImages,other$subImages)) return false;
        final Object this$detail = this.getDetail();
        final Object other$detail = other.getDetail();
        if (!Objects.equals(this$detail,other$detail)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (!Objects.equals(this$price,other$price)) return false;
        final Object this$stock = this.getStock();
        final Object other$stock = other.getStock();
        if (!Objects.equals(this$stock,other$stock)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (!Objects.equals(this$status,other$status)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (!Objects.equals(this$createTime,other$createTime))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        return Objects.equals(this$updateTime,other$updateTime);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductDetailVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $categoryId = this.getCategoryId();
        result = result * PRIME + ($categoryId == null ? 43 : $categoryId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $subtitle = this.getSubtitle();
        result = result * PRIME + ($subtitle == null ? 43 : $subtitle.hashCode());
        final Object $mainImage = this.getMainImage();
        result = result * PRIME + ($mainImage == null ? 43 : $mainImage.hashCode());
        final Object $subImages = this.getSubImages();
        result = result * PRIME + ($subImages == null ? 43 : $subImages.hashCode());
        final Object $detail = this.getDetail();
        result = result * PRIME + ($detail == null ? 43 : $detail.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $stock = this.getStock();
        result = result * PRIME + ($stock == null ? 43 : $stock.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "ProductDetailVo(id=" + this.getId() + ", categoryId=" + this.getCategoryId() + ", name=" + this.getName() + ", subtitle=" + this.getSubtitle() + ", mainImage=" + this.getMainImage() + ", subImages=" + this.getSubImages() + ", detail=" + this.getDetail() + ", price=" + this.getPrice() + ", stock=" + this.getStock() + ", status=" + this.getStatus() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}
