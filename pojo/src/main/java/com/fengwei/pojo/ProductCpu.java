package com.fengwei.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "product_cpu")
public class ProductCpu {
    @Id
    private Integer id;

    private String brand;

    private String series;

    private String name;

    private String model;

    @Column(name = "cpu_socket_type")
    private String cpuSocketType;

    @Column(name = "core_name")
    private String coreName;

    @Column(name = "cores_count")
    private Integer coresCount;

    @Column(name = "threads_count")
    private Integer threadsCount;

    @Column(name = "operating_frequency")
    private Integer operatingFrequency;

    @Column(name = "max_turbo_frequency")
    private Integer maxTurboFrequency;

    @Column(name = "l1_cache")
    private Integer l1Cache;

    @Column(name = "l2_cache")
    private Integer l2Cache;

    @Column(name = "l3_cache")
    private Integer l3Cache;

    /**
     * 纳米数
     */
    @Column(name = "manufacturing_tech")
    private Integer manufacturingTech;

    /**
     * DDR1~4
     */
    @Column(name = "memory_types")
    private Integer memoryTypes;

    @Column(name = "memory_channel")
    private Integer memoryChannel;

    /**
     * 0-无；1-有
     */
    @Column(name = "integrated_graphics")
    private Boolean integratedGraphics;

    @Column(name = "graphics_card_name")
    private String graphicsCardName;

    @Column(name = "graphics_base_frequency")
    private Integer graphicsBaseFrequency;

    @Column(name = "graphics_max_dynamic_frequency")
    private Integer graphicsMaxDynamicFrequency;

    @Column(name = "pci_express_revision")
    private Integer pciExpressRevision;

    @Column(name = "max_number_of_pci_express_lanes")
    private Integer maxNumberOfPciExpressLanes;

    @Column(name = "thermal_design_power")
    private Integer thermalDesignPower;

    /**
     * 0-无；1-有
     */
    @Column(name = "cooling_device")
    private Boolean coolingDevice;

    @Column(name = "virtualization_technology_support")
    private Integer virtualizationTechnologySupport;

    @Column(name = "hyper_threading_support")
    private Integer hyperThreadingSupport;

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
     * @return cpu_socket_type
     */
    public String getCpuSocketType() {
        return cpuSocketType;
    }

    /**
     * @param cpuSocketType
     */
    public void setCpuSocketType(String cpuSocketType) {
        this.cpuSocketType = cpuSocketType;
    }

    /**
     * @return core_name
     */
    public String getCoreName() {
        return coreName;
    }

    /**
     * @param coreName
     */
    public void setCoreName(String coreName) {
        this.coreName = coreName;
    }

    /**
     * @return cores_count
     */
    public Integer getCoresCount() {
        return coresCount;
    }

    /**
     * @param coresCount
     */
    public void setCoresCount(Integer coresCount) {
        this.coresCount = coresCount;
    }

    /**
     * @return threads_count
     */
    public Integer getThreadsCount() {
        return threadsCount;
    }

    /**
     * @param threadsCount
     */
    public void setThreadsCount(Integer threadsCount) {
        this.threadsCount = threadsCount;
    }

    /**
     * @return operating_frequency
     */
    public Integer getOperatingFrequency() {
        return operatingFrequency;
    }

    /**
     * @param operatingFrequency
     */
    public void setOperatingFrequency(Integer operatingFrequency) {
        this.operatingFrequency = operatingFrequency;
    }

    /**
     * @return max_turbo_frequency
     */
    public Integer getMaxTurboFrequency() {
        return maxTurboFrequency;
    }

    /**
     * @param maxTurboFrequency
     */
    public void setMaxTurboFrequency(Integer maxTurboFrequency) {
        this.maxTurboFrequency = maxTurboFrequency;
    }

    /**
     * @return l1_cache
     */
    public Integer getL1Cache() {
        return l1Cache;
    }

    /**
     * @param l1Cache
     */
    public void setL1Cache(Integer l1Cache) {
        this.l1Cache = l1Cache;
    }

    /**
     * @return l2_cache
     */
    public Integer getL2Cache() {
        return l2Cache;
    }

    /**
     * @param l2Cache
     */
    public void setL2Cache(Integer l2Cache) {
        this.l2Cache = l2Cache;
    }

    /**
     * @return l3_cache
     */
    public Integer getL3Cache() {
        return l3Cache;
    }

    /**
     * @param l3Cache
     */
    public void setL3Cache(Integer l3Cache) {
        this.l3Cache = l3Cache;
    }

    /**
     * 获取纳米数
     *
     * @return manufacturing_tech - 纳米数
     */
    public Integer getManufacturingTech() {
        return manufacturingTech;
    }

    /**
     * 设置纳米数
     *
     * @param manufacturingTech 纳米数
     */
    public void setManufacturingTech(Integer manufacturingTech) {
        this.manufacturingTech = manufacturingTech;
    }

    /**
     * 获取DDR1~4
     *
     * @return memory_types - DDR1~4
     */
    public Integer getMemoryTypes() {
        return memoryTypes;
    }

    /**
     * 设置DDR1~4
     *
     * @param memoryTypes DDR1~4
     */
    public void setMemoryTypes(Integer memoryTypes) {
        this.memoryTypes = memoryTypes;
    }

    /**
     * @return memory_channel
     */
    public Integer getMemoryChannel() {
        return memoryChannel;
    }

    /**
     * @param memoryChannel
     */
    public void setMemoryChannel(Integer memoryChannel) {
        this.memoryChannel = memoryChannel;
    }

    /**
     * 获取0-无；1-有
     *
     * @return integrated_graphics - 0-无；1-有
     */
    public Boolean getIntegratedGraphics() {
        return integratedGraphics;
    }

    /**
     * 设置0-无；1-有
     *
     * @param integratedGraphics 0-无；1-有
     */
    public void setIntegratedGraphics(Boolean integratedGraphics) {
        this.integratedGraphics = integratedGraphics;
    }

    /**
     * @return graphics_card_name
     */
    public String getGraphicsCardName() {
        return graphicsCardName;
    }

    /**
     * @param graphicsCardName
     */
    public void setGraphicsCardName(String graphicsCardName) {
        this.graphicsCardName = graphicsCardName;
    }

    /**
     * @return graphics_base_frequency
     */
    public Integer getGraphicsBaseFrequency() {
        return graphicsBaseFrequency;
    }

    /**
     * @param graphicsBaseFrequency
     */
    public void setGraphicsBaseFrequency(Integer graphicsBaseFrequency) {
        this.graphicsBaseFrequency = graphicsBaseFrequency;
    }

    /**
     * @return graphics_max_dynamic_frequency
     */
    public Integer getGraphicsMaxDynamicFrequency() {
        return graphicsMaxDynamicFrequency;
    }

    /**
     * @param graphicsMaxDynamicFrequency
     */
    public void setGraphicsMaxDynamicFrequency(Integer graphicsMaxDynamicFrequency) {
        this.graphicsMaxDynamicFrequency = graphicsMaxDynamicFrequency;
    }

    /**
     * @return pci_express_revision
     */
    public Integer getPciExpressRevision() {
        return pciExpressRevision;
    }

    /**
     * @param pciExpressRevision
     */
    public void setPciExpressRevision(Integer pciExpressRevision) {
        this.pciExpressRevision = pciExpressRevision;
    }

    /**
     * @return max_number_of_pci_express_lanes
     */
    public Integer getMaxNumberOfPciExpressLanes() {
        return maxNumberOfPciExpressLanes;
    }

    /**
     * @param maxNumberOfPciExpressLanes
     */
    public void setMaxNumberOfPciExpressLanes(Integer maxNumberOfPciExpressLanes) {
        this.maxNumberOfPciExpressLanes = maxNumberOfPciExpressLanes;
    }

    /**
     * @return thermal_design_power
     */
    public Integer getThermalDesignPower() {
        return thermalDesignPower;
    }

    /**
     * @param thermalDesignPower
     */
    public void setThermalDesignPower(Integer thermalDesignPower) {
        this.thermalDesignPower = thermalDesignPower;
    }

    /**
     * 获取0-无；1-有
     *
     * @return cooling_device - 0-无；1-有
     */
    public Boolean getCoolingDevice() {
        return coolingDevice;
    }

    /**
     * 设置0-无；1-有
     *
     * @param coolingDevice 0-无；1-有
     */
    public void setCoolingDevice(Boolean coolingDevice) {
        this.coolingDevice = coolingDevice;
    }

    /**
     * @return virtualization_technology_support
     */
    public Integer getVirtualizationTechnologySupport() {
        return virtualizationTechnologySupport;
    }

    /**
     * @param virtualizationTechnologySupport
     */
    public void setVirtualizationTechnologySupport(Integer virtualizationTechnologySupport) {
        this.virtualizationTechnologySupport = virtualizationTechnologySupport;
    }

    /**
     * @return hyper_threading_support
     */
    public Integer getHyperThreadingSupport() {
        return hyperThreadingSupport;
    }

    /**
     * @param hyperThreadingSupport
     */
    public void setHyperThreadingSupport(Integer hyperThreadingSupport) {
        this.hyperThreadingSupport = hyperThreadingSupport;
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