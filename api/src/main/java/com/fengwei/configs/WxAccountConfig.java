package com.fengwei.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@ConfigurationProperties(prefix = "wx")
public class WxAccountConfig {

    private String appId;

    private String mchId;

    private String mchKey;

    private String notifyUrl;

    private String returnUrl;

    public WxAccountConfig() {
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return this.mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getMchKey() {
        return this.mchKey;
    }

    public void setMchKey(String mchKey) {
        this.mchKey = mchKey;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxAccountConfig)) return false;
        final WxAccountConfig other = (WxAccountConfig) o;
        if (!other.canEqual(this)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (!Objects.equals(this$appId,other$appId)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (!Objects.equals(this$mchId,other$mchId)) return false;
        final Object this$mchKey = this.getMchKey();
        final Object other$mchKey = other.getMchKey();
        if (!Objects.equals(this$mchKey,other$mchKey)) return false;
        final Object this$notifyUrl = this.getNotifyUrl();
        final Object other$notifyUrl = other.getNotifyUrl();
        if (!Objects.equals(this$notifyUrl,other$notifyUrl)) return false;
        final Object this$returnUrl = this.getReturnUrl();
        final Object other$returnUrl = other.getReturnUrl();
        return Objects.equals(this$returnUrl,other$returnUrl);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxAccountConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $mchKey = this.getMchKey();
        result = result * PRIME + ($mchKey == null ? 43 : $mchKey.hashCode());
        final Object $notifyUrl = this.getNotifyUrl();
        result = result * PRIME + ($notifyUrl == null ? 43 : $notifyUrl.hashCode());
        final Object $returnUrl = this.getReturnUrl();
        result = result * PRIME + ($returnUrl == null ? 43 : $returnUrl.hashCode());
        return result;
    }

    public String toString() {
        return "WxAccountConfig(appId=" + this.getAppId() + ", mchId=" + this.getMchId() + ", mchKey=" + this.getMchKey() + ", notifyUrl=" + this.getNotifyUrl() + ", returnUrl=" + this.getReturnUrl() + ")";
    }
}
