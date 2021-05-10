package com.fengwei.pojo.vo;

import java.util.List;
import java.util.Objects;

public class CategoryVo {

    private Integer id;

    private Integer parentId;

    private String name;

    private Integer sortOrder;

    private List<CategoryVo> subCategories;

    public CategoryVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSortOrder() {
        return this.sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public List<CategoryVo> getSubCategories() {
        return this.subCategories;
    }

    public void setSubCategories(List<CategoryVo> subCategories) {
        this.subCategories = subCategories;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CategoryVo)) return false;
        final CategoryVo other = (CategoryVo) o;
        if (!other.canEqual(this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (!Objects.equals(this$id,other$id)) return false;
        final Object this$parentId = this.getParentId();
        final Object other$parentId = other.getParentId();
        if (!Objects.equals(this$parentId,other$parentId)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (!Objects.equals(this$name,other$name)) return false;
        final Object this$sortOrder = this.getSortOrder();
        final Object other$sortOrder = other.getSortOrder();
        if (!Objects.equals(this$sortOrder,other$sortOrder)) return false;
        final Object this$subCategories = this.getSubCategories();
        final Object other$subCategories = other.getSubCategories();
        return Objects.equals(this$subCategories,other$subCategories);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CategoryVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $parentId = this.getParentId();
        result = result * PRIME + ($parentId == null ? 43 : $parentId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $sortOrder = this.getSortOrder();
        result = result * PRIME + ($sortOrder == null ? 43 : $sortOrder.hashCode());
        final Object $subCategories = this.getSubCategories();
        result = result * PRIME + ($subCategories == null ? 43 : $subCategories.hashCode());
        return result;
    }

    public String toString() {
        return "CategoryVo(id=" + this.getId() + ", parentId=" + this.getParentId() + ", name=" + this.getName() + ", sortOrder=" + this.getSortOrder() + ", subCategories=" + this.getSubCategories() + ")";
    }
}
