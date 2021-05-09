package com.lly835.bestpay.model.wxpay.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by lly835@163.com
 * 2018-05-17 11:32
 */
@Root(name = "xml", strict = false)
public class WxPaySandboxKeyResponse {

    @Element(name = "return_code")
    private String returnCode;

    @Element(name = "return_msg", required = false)
    private String returnMsg;

    @Element(name = "mch_id", required = false)
    private String mchId;

    @Element(name = "sandbox_signkey", required = false)
    private String sandboxSignkey;

    public WxPaySandboxKeyResponse() {
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public String getMchId() {
        return this.mchId;
    }

    public String getSandboxSignkey() {
        return this.sandboxSignkey;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public void setSandboxSignkey(String sandboxSignkey) {
        this.sandboxSignkey = sandboxSignkey;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxPaySandboxKeyResponse)) return false;
        final WxPaySandboxKeyResponse other = (WxPaySandboxKeyResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$returnCode = this.getReturnCode();
        final Object other$returnCode = other.getReturnCode();
        if (this$returnCode == null ? other$returnCode != null : !this$returnCode.equals(other$returnCode))
            return false;
        final Object this$returnMsg = this.getReturnMsg();
        final Object other$returnMsg = other.getReturnMsg();
        if (this$returnMsg == null ? other$returnMsg != null : !this$returnMsg.equals(other$returnMsg)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (this$mchId == null ? other$mchId != null : !this$mchId.equals(other$mchId)) return false;
        final Object this$sandboxSignkey = this.getSandboxSignkey();
        final Object other$sandboxSignkey = other.getSandboxSignkey();
        if (this$sandboxSignkey == null ? other$sandboxSignkey != null : !this$sandboxSignkey.equals(other$sandboxSignkey))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxPaySandboxKeyResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $returnCode = this.getReturnCode();
        result = result * PRIME + ($returnCode == null ? 43 : $returnCode.hashCode());
        final Object $returnMsg = this.getReturnMsg();
        result = result * PRIME + ($returnMsg == null ? 43 : $returnMsg.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $sandboxSignkey = this.getSandboxSignkey();
        result = result * PRIME + ($sandboxSignkey == null ? 43 : $sandboxSignkey.hashCode());
        return result;
    }

    public String toString() {
        return "WxPaySandboxKeyResponse(returnCode=" + this.getReturnCode() + ", returnMsg=" + this.getReturnMsg() + ", mchId=" + this.getMchId() + ", sandboxSignkey=" + this.getSandboxSignkey() + ")";
    }
}
