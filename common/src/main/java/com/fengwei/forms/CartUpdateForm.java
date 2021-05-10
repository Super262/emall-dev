package com.fengwei.forms;


import java.util.Objects;

public class CartUpdateForm {

    private Integer quantity;

    private Boolean selected;

    public CartUpdateForm() {
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getSelected() {
        return this.selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartUpdateForm)) return false;
        final CartUpdateForm other = (CartUpdateForm) o;
        if (!other.canEqual(this)) return false;
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        if (!Objects.equals(this$quantity,other$quantity)) return false;
        final Object this$selected = this.getSelected();
        final Object other$selected = other.getSelected();
        return Objects.equals(this$selected,other$selected);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartUpdateForm;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $quantity = this.getQuantity();
        result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
        final Object $selected = this.getSelected();
        result = result * PRIME + ($selected == null ? 43 : $selected.hashCode());
        return result;
    }

    public String toString() {
        return "CartUpdateForm(quantity=" + this.getQuantity() + ", selected=" + this.getSelected() + ")";
    }
}
