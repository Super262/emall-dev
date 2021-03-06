package com.lly835.bestpay.model;

import java.util.Objects;

/**
 * 下载对账文件请求
 */
public class DownloadBillRequest {

    //对账日期
    private String billDate;

    public DownloadBillRequest() {
    }

    public String getBillDate() {
        return this.billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DownloadBillRequest)) return false;
        final DownloadBillRequest other = (DownloadBillRequest) o;
        if (!other.canEqual(this)) return false;
        final Object this$billDate = this.getBillDate();
        final Object other$billDate = other.getBillDate();
        return Objects.equals(this$billDate,other$billDate);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DownloadBillRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $billDate = this.getBillDate();
        result = result * PRIME + ($billDate == null ? 43 : $billDate.hashCode());
        return result;
    }

    public String toString() {
        return "DownloadBillRequest(billDate=" + this.getBillDate() + ")";
    }
}
