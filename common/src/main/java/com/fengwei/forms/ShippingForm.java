package com.fengwei.forms;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class ShippingForm {

    @NotBlank
    private String receiverName;

    @NotBlank
    private String receiverPhone;

    @NotBlank
    private String receiverMobile;

    @NotBlank
    private String receiverProvince;

    @NotBlank
    private String receiverCity;

    @NotBlank
    private String receiverDistrict;

    @NotBlank
    private String receiverAddress;

    @NotBlank
    private String receiverZip;

    public ShippingForm() {
    }

    public @NotBlank String getReceiverName() {
        return this.receiverName;
    }

    public void setReceiverName(@NotBlank String receiverName) {
        this.receiverName = receiverName;
    }

    public @NotBlank String getReceiverPhone() {
        return this.receiverPhone;
    }

    public void setReceiverPhone(@NotBlank String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public @NotBlank String getReceiverMobile() {
        return this.receiverMobile;
    }

    public void setReceiverMobile(@NotBlank String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public @NotBlank String getReceiverProvince() {
        return this.receiverProvince;
    }

    public void setReceiverProvince(@NotBlank String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public @NotBlank String getReceiverCity() {
        return this.receiverCity;
    }

    public void setReceiverCity(@NotBlank String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public @NotBlank String getReceiverDistrict() {
        return this.receiverDistrict;
    }

    public void setReceiverDistrict(@NotBlank String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public @NotBlank String getReceiverAddress() {
        return this.receiverAddress;
    }

    public void setReceiverAddress(@NotBlank String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public @NotBlank String getReceiverZip() {
        return this.receiverZip;
    }

    public void setReceiverZip(@NotBlank String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ShippingForm)) return false;
        final ShippingForm other = (ShippingForm) o;
        if (!other.canEqual(this)) return false;
        final Object this$receiverName = this.getReceiverName();
        final Object other$receiverName = other.getReceiverName();
        if (!Objects.equals(this$receiverName,other$receiverName))
            return false;
        final Object this$receiverPhone = this.getReceiverPhone();
        final Object other$receiverPhone = other.getReceiverPhone();
        if (!Objects.equals(this$receiverPhone,other$receiverPhone))
            return false;
        final Object this$receiverMobile = this.getReceiverMobile();
        final Object other$receiverMobile = other.getReceiverMobile();
        if (!Objects.equals(this$receiverMobile,other$receiverMobile))
            return false;
        final Object this$receiverProvince = this.getReceiverProvince();
        final Object other$receiverProvince = other.getReceiverProvince();
        if (!Objects.equals(this$receiverProvince,other$receiverProvince))
            return false;
        final Object this$receiverCity = this.getReceiverCity();
        final Object other$receiverCity = other.getReceiverCity();
        if (!Objects.equals(this$receiverCity,other$receiverCity))
            return false;
        final Object this$receiverDistrict = this.getReceiverDistrict();
        final Object other$receiverDistrict = other.getReceiverDistrict();
        if (!Objects.equals(this$receiverDistrict,other$receiverDistrict))
            return false;
        final Object this$receiverAddress = this.getReceiverAddress();
        final Object other$receiverAddress = other.getReceiverAddress();
        if (!Objects.equals(this$receiverAddress,other$receiverAddress))
            return false;
        final Object this$receiverZip = this.getReceiverZip();
        final Object other$receiverZip = other.getReceiverZip();
        return Objects.equals(this$receiverZip,other$receiverZip);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ShippingForm;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $receiverName = this.getReceiverName();
        result = result * PRIME + ($receiverName == null ? 43 : $receiverName.hashCode());
        final Object $receiverPhone = this.getReceiverPhone();
        result = result * PRIME + ($receiverPhone == null ? 43 : $receiverPhone.hashCode());
        final Object $receiverMobile = this.getReceiverMobile();
        result = result * PRIME + ($receiverMobile == null ? 43 : $receiverMobile.hashCode());
        final Object $receiverProvince = this.getReceiverProvince();
        result = result * PRIME + ($receiverProvince == null ? 43 : $receiverProvince.hashCode());
        final Object $receiverCity = this.getReceiverCity();
        result = result * PRIME + ($receiverCity == null ? 43 : $receiverCity.hashCode());
        final Object $receiverDistrict = this.getReceiverDistrict();
        result = result * PRIME + ($receiverDistrict == null ? 43 : $receiverDistrict.hashCode());
        final Object $receiverAddress = this.getReceiverAddress();
        result = result * PRIME + ($receiverAddress == null ? 43 : $receiverAddress.hashCode());
        final Object $receiverZip = this.getReceiverZip();
        result = result * PRIME + ($receiverZip == null ? 43 : $receiverZip.hashCode());
        return result;
    }

    public String toString() {
        return "ShippingForm(receiverName=" + this.getReceiverName() + ", receiverPhone=" + this.getReceiverPhone() + ", receiverMobile=" + this.getReceiverMobile() + ", receiverProvince=" + this.getReceiverProvince() + ", receiverCity=" + this.getReceiverCity() + ", receiverDistrict=" + this.getReceiverDistrict() + ", receiverAddress=" + this.getReceiverAddress() + ", receiverZip=" + this.getReceiverZip() + ")";
    }
}
