package com.fengwei.pojo.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductVo {

    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String mainImage;

    private Integer status;

    private BigDecimal price;

    public ProductVo() {
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

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductVo)) return false;
        final ProductVo other = (ProductVo) o;
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
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (!Objects.equals(this$status,other$status)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        return Objects.equals(this$price,other$price);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductVo;
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
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        return result;
    }

    public String toString() {
        return "ProductVo(id=" + this.getId() + ", categoryId=" + this.getCategoryId() + ", name=" + this.getName() + ", subtitle=" + this.getSubtitle() + ", mainImage=" + this.getMainImage() + ", status=" + this.getStatus() + ", price=" + this.getPrice() + ")";
    }
}
