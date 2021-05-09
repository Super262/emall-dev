package com.lly835.bestpay.config;

import org.apache.http.ssl.SSLContexts;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import javax.net.ssl.SSLContext;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.util.Objects;

public class WxPayConfig extends PayConfig {

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 公众号appSecret
     */
    private String appSecret;

    /**
     * 小程序appId
     */
    private String miniAppId;

    /**
     * app应用appid
     */
    private String appAppId;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /**
     * 证书内容
     */
    private SSLContext sslContext;

    public WxPayConfig() {
    }

    /**
     * 初始化证书
     */
    public void initSSLContext() {
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(this.keyPath);
        } catch (IOException e) {
            throw new RuntimeException("读取微信商户证书文件出错",e);
        }

        try {
            KeyStore keystore = KeyStore.getInstance("PKCS12");
            char[] partnerId2charArray = mchId.toCharArray();
            keystore.load(inputStream,partnerId2charArray);
            this.sslContext = SSLContexts.custom().loadKeyMaterial(keystore,partnerId2charArray).build();
        } catch (Exception e) {
            throw new RuntimeException("证书文件有问题，请核实！",e);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getMiniAppId() {
        return this.miniAppId;
    }

    public void setMiniAppId(String miniAppId) {
        this.miniAppId = miniAppId;
    }

    public String getAppAppId() {
        return this.appAppId;
    }

    public void setAppAppId(String appAppId) {
        this.appAppId = appAppId;
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

    public String getKeyPath() {
        return this.keyPath;
    }

    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    public SSLContext getSslContext() {
        return this.sslContext;
    }

    public void setSslContext(SSLContext sslContext) {
        this.sslContext = sslContext;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WxPayConfig)) return false;
        final WxPayConfig other = (WxPayConfig) o;
        if (!other.canEqual(this)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (!Objects.equals(this$appId,other$appId)) return false;
        final Object this$appSecret = this.getAppSecret();
        final Object other$appSecret = other.getAppSecret();
        if (!Objects.equals(this$appSecret,other$appSecret)) return false;
        final Object this$miniAppId = this.getMiniAppId();
        final Object other$miniAppId = other.getMiniAppId();
        if (!Objects.equals(this$miniAppId,other$miniAppId)) return false;
        final Object this$appAppId = this.getAppAppId();
        final Object other$appAppId = other.getAppAppId();
        if (!Objects.equals(this$appAppId,other$appAppId)) return false;
        final Object this$mchId = this.getMchId();
        final Object other$mchId = other.getMchId();
        if (!Objects.equals(this$mchId,other$mchId)) return false;
        final Object this$mchKey = this.getMchKey();
        final Object other$mchKey = other.getMchKey();
        if (!Objects.equals(this$mchKey,other$mchKey)) return false;
        final Object this$keyPath = this.getKeyPath();
        final Object other$keyPath = other.getKeyPath();
        if (!Objects.equals(this$keyPath,other$keyPath)) return false;
        final Object this$sslContext = this.getSslContext();
        final Object other$sslContext = other.getSslContext();
        return Objects.equals(this$sslContext,other$sslContext);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WxPayConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $appSecret = this.getAppSecret();
        result = result * PRIME + ($appSecret == null ? 43 : $appSecret.hashCode());
        final Object $miniAppId = this.getMiniAppId();
        result = result * PRIME + ($miniAppId == null ? 43 : $miniAppId.hashCode());
        final Object $appAppId = this.getAppAppId();
        result = result * PRIME + ($appAppId == null ? 43 : $appAppId.hashCode());
        final Object $mchId = this.getMchId();
        result = result * PRIME + ($mchId == null ? 43 : $mchId.hashCode());
        final Object $mchKey = this.getMchKey();
        result = result * PRIME + ($mchKey == null ? 43 : $mchKey.hashCode());
        final Object $keyPath = this.getKeyPath();
        result = result * PRIME + ($keyPath == null ? 43 : $keyPath.hashCode());
        final Object $sslContext = this.getSslContext();
        result = result * PRIME + ($sslContext == null ? 43 : $sslContext.hashCode());
        return result;
    }

    public String toString() {
        return "WxPayConfig(appId=" + this.getAppId() + ", appSecret=" + this.getAppSecret() + ", miniAppId=" + this.getMiniAppId() + ", appAppId=" + this.getAppAppId() + ", mchId=" + this.getMchId() + ", mchKey=" + this.getMchKey() + ", keyPath=" + this.getKeyPath() + ", sslContext=" + this.getSslContext() + ")";
    }
}
