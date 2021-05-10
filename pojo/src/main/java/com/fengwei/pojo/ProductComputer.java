package com.fengwei.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "product_computer")
public class ProductComputer {
    @Id
    private Integer id;

    private String name;

    private String subtitle;

    /**
     * 0-台式；1-笔记
     */
    private Boolean type;

    private String brand;

    private String series;

    private String model;

    private String color;

    @Column(name = "cpu_type")
    private String cpuType;

    @Column(name = "cpu_speed")
    private Integer cpuSpeed;

    @Column(name = "turbo_frequency")
    private Integer turboFrequency;

    @Column(name = "number_of_cores")
    private Integer numberOfCores;

    @Column(name = "screen_size")
    private Integer screenSize;

    private String resolution;

    @Column(name = "operating_system")
    private String operatingSystem;

    @Column(name = "video_memory")
    private Integer videoMemory;

    private Integer storage;

    @Column(name = "memory_capacity")
    private Integer memoryCapacity;

    @Column(name = "memory_speed")
    private Integer memorySpeed;

    private Integer battery;

    private String dimension;

    private Integer weight;

    @Column(name = "main_image")
    private String mainImage;

    private BigDecimal price;

    private Integer stock;

    /**
     * 商品状态.1-在售 2-下架 3-删除
     */
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
     * 获取0-台式；1-笔记
     *
     * @return type - 0-台式；1-笔记
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置0-台式；1-笔记
     *
     * @param type 0-台式；1-笔记
     */
    public void setType(Boolean type) {
        this.type = type;
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
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return cpu_type
     */
    public String getCpuType() {
        return cpuType;
    }

    /**
     * @param cpuType
     */
    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    /**
     * @return cpu_speed
     */
    public Integer getCpuSpeed() {
        return cpuSpeed;
    }

    /**
     * @param cpuSpeed
     */
    public void setCpuSpeed(Integer cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    /**
     * @return turbo_frequency
     */
    public Integer getTurboFrequency() {
        return turboFrequency;
    }

    /**
     * @param turboFrequency
     */
    public void setTurboFrequency(Integer turboFrequency) {
        this.turboFrequency = turboFrequency;
    }

    /**
     * @return number_of_cores
     */
    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    /**
     * @param numberOfCores
     */
    public void setNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    /**
     * @return screen_size
     */
    public Integer getScreenSize() {
        return screenSize;
    }

    /**
     * @param screenSize
     */
    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * @param resolution
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * @return operating_system
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * @param operatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * @return video_memory
     */
    public Integer getVideoMemory() {
        return videoMemory;
    }

    /**
     * @param videoMemory
     */
    public void setVideoMemory(Integer videoMemory) {
        this.videoMemory = videoMemory;
    }

    /**
     * @return storage
     */
    public Integer getStorage() {
        return storage;
    }

    /**
     * @param storage
     */
    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    /**
     * @return memory_capacity
     */
    public Integer getMemoryCapacity() {
        return memoryCapacity;
    }

    /**
     * @param memoryCapacity
     */
    public void setMemoryCapacity(Integer memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    /**
     * @return memory_speed
     */
    public Integer getMemorySpeed() {
        return memorySpeed;
    }

    /**
     * @param memorySpeed
     */
    public void setMemorySpeed(Integer memorySpeed) {
        this.memorySpeed = memorySpeed;
    }

    /**
     * @return battery
     */
    public Integer getBattery() {
        return battery;
    }

    /**
     * @param battery
     */
    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
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
     * 获取商品状态.1-在售 2-下架 3-删除
     *
     * @return status - 商品状态.1-在售 2-下架 3-删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置商品状态.1-在售 2-下架 3-删除
     *
     * @param status 商品状态.1-在售 2-下架 3-删除
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