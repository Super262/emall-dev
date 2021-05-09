package com.lly835.bestpay.model.wxpay.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by steven ma
 * 2019-03-15 11:49
 */
@Root(name = "xml", strict = false)
public class WxDownloadBillRequest {

    //公众账号ID
    @Element(name = "appid")
    private String appid;

    //商户号
    @Element(name = "mch_id")
    private String mchId;

    //随机字符串
    @Element(name = "nonce_str")
    private String nonceStr;

    //签名
    @Element(name = "sign")
    private String sign;

    //对账单日期
    @Element(name = "bill_date")
    private String billDate;

    //账单类型
    @Element(name = "bill_type", required = false)
    private String billType = "ALL";

    public WxDownloadBillRequest() {
    }

    public String getAppid() {
        return this.appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMchId() {
        return this.mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getBillDate() {
        return this.billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getBillType() {
        return this.billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxDownloadBillRequest)) return false;
        final WxDownloadBillRequest other = (WxDownloadBillRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$appid = this.getAppid();
        final Object other$appid = other.getAppid();
        if (this$appid == null ? other$appid != null : !this$appid.equals(other$appid)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (this$mchId == null ? other$mchId != null : !this$mchId.equals(other$mchId)) return false;
        final Object this$nonceStr = this.getNonceStr();
        final Object other$nonceStr = other.getNonceStr();
        if (this$nonceStr == null ? other$nonceStr != null : !this$nonceStr.equals(other$nonceStr)) return false;
        final Object this$sign = this.getSign();
        final Object other$sign = other.getSign();
        if (this$sign == null ? other$sign != null : !this$sign.equals(other$sign)) return false;
        final Object this$billDate = this.getBillDate();
        final Object other$billDate = other.getBillDate();
        if (this$billDate == null ? other$billDate != null : !this$billDate.equals(other$billDate)) return false;
        final Object this$billType = this.getBillType();
        final Object other$billType = other.getBillType();
        if (this$billType == null ? other$billType != null : !this$billType.equals(other$billType)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxDownloadBillRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appid = this.getAppid();
        result = result * PRIME + ($appid == null ? 43 : $appid.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $nonceStr = this.getNonceStr();
        result = result * PRIME + ($nonceStr == null ? 43 : $nonceStr.hashCode());
        final Object $sign = this.getSign();
        result = result * PRIME + ($sign == null ? 43 : $sign.hashCode());
        final Object $billDate = this.getBillDate();
        result = result * PRIME + ($billDate == null ? 43 : $billDate.hashCode());
        final Object $billType = this.getBillType();
        result = result * PRIME + ($billType == null ? 43 : $billType.hashCode());
        return result;
    }

    public String toString() {
        return "WxDownloadBillRequest(appid=" + this.getAppid() + ", mchId=" + this.getMchId() + ", nonceStr=" + this.getNonceStr() + ", sign=" + this.getSign() + ", billDate=" + this.getBillDate() + ", billType=" + this.getBillType() + ")";
    }

//    //压缩账单
//    @Element(name = "tar_type", required = false)
//    private String tarType = "GZIP";

}
