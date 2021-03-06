package com.fengwei.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "product_ssd")
public class ProductSsd {
    @Id
    private Integer id;

    private String name;

    private String subtitle;

    private String brand;

    private String series;

    private String model;

    @Column(name = "form_factor")
    private BigDecimal formFactor;

    private Integer capacity;

    @Column(name = "memory_components")
    private String memoryComponents;

    private String interfaces;

    private Integer cache;

    @Column(name = "max_read")
    private Integer maxRead;

    @Column(name = "max_write")
    private Integer maxWrite;

    private BigDecimal height;

    private BigDecimal width;

    private BigDecimal depth;

    @Column(name = "main_image")
    private String mainImage;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    private String features;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * @param subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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
     * @return form_factor
     */
    public BigDecimal getFormFactor() {
        return formFactor;
    }

    /**
     * @param formFactor
     */
    public void setFormFactor(BigDecimal formFactor) {
        this.formFactor = formFactor;
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
     * @return memory_components
     */
    public String getMemoryComponents() {
        return memoryComponents;
    }

    /**
     * @param memoryComponents
     */
    public void setMemoryComponents(String memoryComponents) {
        this.memoryComponents = memoryComponents;
    }

    /**
     * @return interfaces
     */
    public String getInterfaces() {
        return interfaces;
    }

    /**
     * @param interfaces
     */
    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    /**
     * @return cache
     */
    public Integer getCache() {
        return cache;
    }

    /**
     * @param cache
     */
    public void setCache(Integer cache) {
        this.cache = cache;
    }

    /**
     * @return max_read
     */
    public Integer getMaxRead() {
        return maxRead;
    }

    /**
     * @param maxRead
     */
    public void setMaxRead(Integer maxRead) {
        this.maxRead = maxRead;
    }

    /**
     * @return max_write
     */
    public Integer getMaxWrite() {
        return maxWrite;
    }

    /**
     * @param maxWrite
     */
    public void setMaxWrite(Integer maxWrite) {
        this.maxWrite = maxWrite;
    }

    /**
     * @return height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * @return width
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * @param width
     */
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    /**
     * @return depth
     */
    public BigDecimal getDepth() {
        return depth;
    }

    /**
     * @param depth
     */
    public void setDepth(BigDecimal depth) {
        this.depth = depth;
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