package com.fengwei.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "product_memory")
public class ProductMemory {
    @Id
    private Integer id;

    private String brand;

    private String series;

    private String model;

    private Integer capacity;

    private String type;

    private Integer speed;

    @Column(name = "cas_latency")
    private Integer casLatency;

    private String timing;

    private Long voltage;

    /**
     * 0-无；1-有
     */
    @Column(name = "heat_spreader")
    private Boolean heatSpreader;

    @Column(name = "main_image")
    private String mainImage;

    private Long price;

    private Integer stock;

    private Integer status;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

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
     * @return series
     */
    public String getSeries() {
        return series;
    }

    /**
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
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
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * @param capacity
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * @param speed
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * @return cas_latency
     */
    public Integer getCasLatency() {
        return casLatency;
    }

    /**
     * @param casLatency
     */
    public void setCasLatency(Integer casLatency) {
        this.casLatency = casLatency;
    }

    /**
     * @return timing
     */
    public String getTiming() {
        return timing;
    }

    /**
     * @param timing
     */
    public void setTiming(String timing) {
        this.timing = timing;
    }

    /**
     * @return voltage
     */
    public Long getVoltage() {
        return voltage;
    }

    /**
     * @param voltage
     */
    public void setVoltage(Long voltage) {
        this.voltage = voltage;
    }

    /**
     * 获取0-无；1-有
     *
     * @return heat_spreader - 0-无；1-有
     */
    public Boolean getHeatSpreader() {
        return heatSpreader;
    }

    /**
     * 设置0-无；1-有
     *
     * @param heatSpreader 0-无；1-有
     */
    public void setHeatSpreader(Boolean heatSpreader) {
        this.heatSpreader = heatSpreader;
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
    public Long getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Long price) {
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