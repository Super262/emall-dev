package com.fengwei.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "product_monitor")
public class ProductMonitor {
    @Id
    private Integer id;

    private String brand;

    private String model;

    @Column(name = "cabinet_color")
    private String cabinetColor;

    private String usage;

    @Column(name = "screen_size")
    private BigDecimal screenSize;

    private Integer widescreen;

    @Column(name = "recommended_resolution")
    private String recommendedResolution;

    @Column(name = "refresh_rate")
    private BigDecimal refreshRate;

    @Column(name = "viewing_angle")
    private String viewingAngle;

    @Column(name = "pixel_pitch")
    private String pixelPitch;

    @Column(name = "display_colors")
    private String displayColors;

    private Integer brightness;

    @Column(name = "contrast_ratio")
    private String contrastRatio;

    @Column(name = "aspect_ratio")
    private String aspectRatio;

    @Column(name = "response_time")
    private Integer responseTime;

    private String panel;

    @Column(name = "power_supply")
    private String powerSupply;

    @Column(name = "power_consumption")
    private String powerConsumption;

    @Column(name = "stand_adjustments")
    private String standAdjustments;

    private String features;

    private String dimensions;

    private Integer weight;

    @Column(name = "main_image")
    private String mainImage;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    private String connectors;

    @Column(name = "sub_images")
    private String subImages;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return cabinet_color
     */
    public String getCabinetColor() {
        return cabinetColor;
    }

    /**
     * @param cabinetColor
     */
    public void setCabinetColor(String cabinetColor) {
        this.cabinetColor = cabinetColor;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return usage;
    }

    /**
     * @param usage
     */
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * @return screen_size
     */
    public BigDecimal getScreenSize() {
        return screenSize;
    }

    /**
     * @param screenSize
     */
    public void setScreenSize(BigDecimal screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * @return widescreen
     */
    public Integer getWidescreen() {
        return widescreen;
    }

    /**
     * @param widescreen
     */
    public void setWidescreen(Integer widescreen) {
        this.widescreen = widescreen;
    }

    /**
     * @return recommended_resolution
     */
    public String getRecommendedResolution() {
        return recommendedResolution;
    }

    /**
     * @param recommendedResolution
     */
    public void setRecommendedResolution(String recommendedResolution) {
        this.recommendedResolution = recommendedResolution;
    }

    /**
     * @return refresh_rate
     */
    public BigDecimal getRefreshRate() {
        return refreshRate;
    }

    /**
     * @param refreshRate
     */
    public void setRefreshRate(BigDecimal refreshRate) {
        this.refreshRate = refreshRate;
    }

    /**
     * @return viewing_angle
     */
    public String getViewingAngle() {
        return viewingAngle;
    }

    /**
     * @param viewingAngle
     */
    public void setViewingAngle(String viewingAngle) {
        this.viewingAngle = viewingAngle;
    }

    /**
     * @return pixel_pitch
     */
    public String getPixelPitch() {
        return pixelPitch;
    }

    /**
     * @param pixelPitch
     */
    public void setPixelPitch(String pixelPitch) {
        this.pixelPitch = pixelPitch;
    }

    /**
     * @return display_colors
     */
    public String getDisplayColors() {
        return displayColors;
    }

    /**
     * @param displayColors
     */
    public void setDisplayColors(String displayColors) {
        this.displayColors = displayColors;
    }

    /**
     * @return brightness
     */
    public Integer getBrightness() {
        return brightness;
    }

    /**
     * @param brightness
     */
    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    /**
     * @return contrast_ratio
     */
    public String getContrastRatio() {
        return contrastRatio;
    }

    /**
     * @param contrastRatio
     */
    public void setContrastRatio(String contrastRatio) {
        this.contrastRatio = contrastRatio;
    }

    /**
     * @return aspect_ratio
     */
    public String getAspectRatio() {
        return aspectRatio;
    }

    /**
     * @param aspectRatio
     */
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * @return response_time
     */
    public Integer getResponseTime() {
        return responseTime;
    }

    /**
     * @param responseTime
     */
    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * @return panel
     */
    public String getPanel() {
        return panel;
    }

    /**
     * @param panel
     */
    public void setPanel(String panel) {
        this.panel = panel;
    }

    /**
     * @return power_supply
     */
    public String getPowerSupply() {
        return powerSupply;
    }

    /**
     * @param powerSupply
     */
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    /**
     * @return power_consumption
     */
    public String getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * @param powerConsumption
     */
    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * @return stand_adjustments
     */
    public String getStandAdjustments() {
        return standAdjustments;
    }

    /**
     * @param standAdjustments
     */
    public void setStandAdjustments(String standAdjustments) {
        this.standAdjustments = standAdjustments;
    }

    /**
     * @return features
     */
    public String getFeatures() {
        return features;
    }

    /**
     * @param features
     */
    public void setFeatures(String features) {
        this.features = features;
    }

    /**
     * @return dimensions
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * @return main_image
     */
    public String getMainImage() {
        return mainImage;
    }

    /**
     * @param mainImage
     */
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return updated_time
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * @param updatedTime
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * @return connectors
     */
    public String getConnectors() {
        return connectors;
    }

    /**
     * @param connectors
     */
    public void setConnectors(String connectors) {
        this.connectors = connectors;
    }

    /**
     * @return sub_images
     */
    public String getSubImages() {
        return subImages;
    }

    /**
     * @param subImages
     */
    public void setSubImages(String subImages) {
        this.subImages = subImages;
    }
}