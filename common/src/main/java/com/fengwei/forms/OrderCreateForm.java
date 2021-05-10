package com.fengwei.forms;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class OrderCreateForm {

    @NotNull
    private Integer shippingId;

    public OrderCreateForm() {
    }

    public @NotNull Integer getShippingId() {
        return this.shippingId;
    }

    public void setShippingId(@NotNull Integer shippingId) {
        this.shippingId = shippingId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderCreateForm)) return false;
        final OrderCreateForm other = (OrderCreateForm) o;
        if (!other.canEqual(this)) return false;
        final Object this$shippingId = this.getShippingId();
        final Object other$shippingId = other.getShippingId();
        return Objects.equals(this$shippingId,other$shippingId);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderCreateForm;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $shippingId = this.getShippingId();
        result = result * PRIME + ($shippingId == null ? 43 : $shippingId.hashCode());
        return result;
    }

    public String toString() {
        return "OrderCreateForm(shippingId=" + this.getShippingId() + ")";
    }
}
