package com.fengwei.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@ConfigurationProperties(prefix = "alipay")
public class AlipayAccountConfig {

    private String appId;

    private String privateKey;

    private String publicKey;

    private String notifyUrl;

    private String returnUrl;

    public AlipayAccountConfig() {
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
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
        if (!(o instanceof AlipayAccountConfig)) return false;
        final AlipayAccountConfig other = (AlipayAccountConfig) o;
        if (!other.canEqual(this)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (!Objects.equals(this$appId,other$appId)) return false;
        final Object this$privateKey = this.getPrivateKey();
        final Object other$privateKey = other.getPrivateKey();
        if (!Objects.equals(this$privateKey,other$privateKey))
            return false;
        final Object this$publicKey = this.getPublicKey();
        final Object other$publicKey = other.getPublicKey();
        if (!Objects.equals(this$publicKey,other$publicKey)) return false;
        final Object this$notifyUrl = this.getNotifyUrl();
        final Object other$notifyUrl = other.getNotifyUrl();
        if (!Objects.equals(this$notifyUrl,other$notifyUrl)) return false;
        final Object this$returnUrl = this.getReturnUrl();
        final Object other$returnUrl = other.getReturnUrl();
        return Objects.equals(this$returnUrl,other$returnUrl);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AlipayAccountConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $privateKey = this.getPrivateKey();
        result = result * PRIME + ($privateKey == null ? 43 : $privateKey.hashCode());
        final Object $publicKey = this.getPublicKey();
        result = result * PRIME + ($publicKey == null ? 43 : $publicKey.hashCode());
        final Object $notifyUrl = this.getNotifyUrl();
        result = result * PRIME + ($notifyUrl == null ? 43 : $notifyUrl.hashCode());
        final Object $returnUrl = this.getReturnUrl();
        result = result * PRIME + ($returnUrl == null ? 43 : $returnUrl.hashCode());
        return result;
    }

    public String toString() {
        return "AlipayAccountConfig(appId=" + this.getAppId() + ", privateKey=" + this.getPrivateKey() + ", publicKey=" + this.getPublicKey() + ", notifyUrl=" + this.getNotifyUrl() + ", returnUrl=" + this.getReturnUrl() + ")";
    }
}
