package com.fengwei.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "product_gpu")
public class ProductGpu {
    @Id
    private String id;

    private String brand;

    private String model;

    private String interfaces;

    @Column(name = "chipset_manufacturer")
    private String chipsetManufacturer;

    private String gpu;

    @Column(name = "core_clock")
    private Integer coreClock;

    @Column(name = "memory_clock")
    private Integer memoryClock;

    @Column(name = "memory_size")
    private Integer memorySize;

    @Column(name = "memory_interface")
    private Integer memoryInterface;

    @Column(name = "memory_type")
    private String memoryType;

    private Integer length;

    private Integer tdp;

    @Column(name = "main_image")
    private String mainImage;

    private Long price;

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
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
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
     * @return chipset_manufacturer
     */
    public String getChipsetManufacturer() {
        return chipsetManufacturer;
    }

    /**
     * @param chipsetManufacturer
     */
    public void setChipsetManufacturer(String chipsetManufacturer) {
        this.chipsetManufacturer = chipsetManufacturer;
    }

    /**
     * @return gpu
     */
    public String getGpu() {
        return gpu;
    }

    /**
     * @param gpu
     */
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    /**
     * @return core_clock
     */
    public Integer getCoreClock() {
        return coreClock;
    }

    /**
     * @param coreClock
     */
    public void setCoreClock(Integer coreClock) {
        this.coreClock = coreClock;
    }

    /**
     * @return memory_clock
     */
    public Integer getMemoryClock() {
        return memoryClock;
    }

    /**
     * @param memoryClock
     */
    public void setMemoryClock(Integer memoryClock) {
        this.memoryClock = memoryClock;
    }

    /**
     * @return memory_size
     */
    public Integer getMemorySize() {
        return memorySize;
    }

    /**
     * @param memorySize
     */
    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * @return memory_interface
     */
    public Integer getMemoryInterface() {
        return memoryInterface;
    }

    /**
     * @param memoryInterface
     */
    public void setMemoryInterface(Integer memoryInterface) {
        this.memoryInterface = memoryInterface;
    }

    /**
     * @return memory_type
     */
    public String getMemoryType() {
        return memoryType;
    }

    /**
     * @param memoryType
     */
    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * @param length
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * @return tdp
     */
    public Integer getTdp() {
        return tdp;
    }

    /**
     * @param tdp
     */
    public void setTdp(Integer tdp) {
        this.tdp = tdp;
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