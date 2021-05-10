package com.fengwei.forms;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 添加商品
 */
public class CartAddForm {

    @NotNull
    private String productId;

    private Boolean selected = true;

    public CartAddForm() {
    }

    public @NotNull String getProductId() {
        return this.productId;
    }

    public void setProductId(@NotNull String productId) {
        this.productId = productId;
    }

    public Boolean getSelected() {
        return this.selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

}
