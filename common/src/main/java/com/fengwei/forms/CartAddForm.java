package com.fengwei.forms;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 添加商品
 */
public class CartAddForm {

    @NotNull
    private Integer productId;

    private Boolean selected = true;

    public CartAddForm() {
    }

    public @NotNull Integer getProductId() {
        return this.productId;
    }

    public void setProductId(@NotNull Integer productId) {
        this.productId = productId;
    }

    public Boolean getSelected() {
        return this.selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartAddForm)) return false;
        final CartAddForm other = (CartAddForm) o;
        if (!other.canEqual(this)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (!Objects.equals(this$productId,other$productId)) return false;
        final Object this$selected = this.getSelected();
        final Object other$selected = other.getSelected();
        return Objects.equals(this$selected,other$selected);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartAddForm;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $selected = this.getSelected();
        result = result * PRIME + ($selected == null ? 43 : $selected.hashCode());
        return result;
    }

    public String toString() {
        return "CartAddForm(productId=" + this.getProductId() + ", selected=" + this.getSelected() + ")";
    }
}
