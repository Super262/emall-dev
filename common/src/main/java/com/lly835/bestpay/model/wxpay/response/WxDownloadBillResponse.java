package com.lly835.bestpay.model.wxpay.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;

/**
 * 下载对账文件返回-只有发生错误的时候才会返回
 */
@Root(name = "xml", strict = false)
public class WxDownloadBillResponse {

    @Element(name = "return_code")
    private String returnCode;

    @Element(name = "return_msg", required = false)
    private String returnMsg;

    @Element(name = "error_code")
    private String errorCode;

    public WxDownloadBillResponse() {
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxDownloadBillResponse)) return false;
        final WxDownloadBillResponse other = (WxDownloadBillResponse) o;
        if (!other.canEqual(this)) return false;
        final Object this$returnCode = this.getReturnCode();
        final Object other$returnCode = other.getReturnCode();
        if (!Objects.equals(this$returnCode,other$returnCode)) return false;
        final Object this$returnMsg = this.getReturnMsg();
        final Object other$returnMsg = other.getReturnMsg();
        if (!Objects.equals(this$returnMsg,other$returnMsg)) return false;
        final Object this$errorCode = this.getErrorCode();
        final Object other$errorCode = other.getErrorCode();
        return Objects.equals(this$errorCode,other$errorCode);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxDownloadBillResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $returnCode = this.getReturnCode();
        result = result * PRIME + ($returnCode == null ? 43 : $returnCode.hashCode());
        final Object $returnMsg = this.getReturnMsg();
        result = result * PRIME + ($returnMsg == null ? 43 : $returnMsg.hashCode());
        final Object $errorCode = this.getErrorCode();
        result = result * PRIME + ($errorCode == null ? 43 : $errorCode.hashCode());
        return result;
    }

    public String toString() {
        return "WxDownloadBillResponse(returnCode=" + this.getReturnCode() + ", returnMsg=" + this.getReturnMsg() + ", errorCode=" + this.getErrorCode() + ")";
    }
}
