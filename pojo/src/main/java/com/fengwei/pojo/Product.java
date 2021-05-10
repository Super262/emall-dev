package com.fengwei.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private String id;   // category + "#" + true_id

    private String name;

    private String subtitle;

    private String mainImage;

    private String subImages;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    private Date createdTime;

    private Date updatedTime;

    private Object rawData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        updateRawData();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        updateRawData();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        updateRawData();
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
        updateRawData();
    }

    public String getSubImages() {
        return subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages;
        updateRawData();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
        updateRawData();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
        updateRawData();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        updateRawData();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        updateRawData();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
        updateRawData();
    }

    public Object getRawData() {
        return rawData;
    }

    public void setRawData(Object rawData) {
        this.rawData = rawData;
        updateRawData();
    }

    // 保持数据的一致性
    private void updateRawData() {
        String category = id.split("#")[0];
        switch (category) {
            case "computer": {
                ProductComputer p = (ProductComputer) rawData;
                p.setId(Integer.parseInt(id.split("#")[1]));
                p.setName(name);
                p.setSubtitle(subtitle);
                p.setMainImage(mainImage);
                p.setSubImages(subImages);
                p.setPrice(price);
                p.setStock(stock);
                p.setStatus(status);
                p.setCreatedTime(createdTime);
                p.setUpdatedTime(updatedTime);
                break;
            }
            case "cpu": {
                ProductCpu p = (ProductCpu) rawData;
                p.setId(Integer.parseInt(id.split("#")[1]));
                p.setName(name);
                p.setSubtitle(subtitle);
                p.setMainImage(mainImage);
                p.setSubImages(subImages);
                p.setPrice(price);
                p.setStock(stock);
                p.setStatus(status);
                p.setCreatedTime(createdTime);
                p.setUpdatedTime(updatedTime);
                break;
            }
            case "memory": {
                ProductMemory p = (ProductMemory) rawData;
                p.setId(Integer.parseInt(id.split("#")[1]));
                p.setName(name);
                p.setSubtitle(subtitle);
                p.setMainImage(mainImage);
                p.setSubImages(subImages);
                p.setPrice(price);
                p.setStock(stock);
                p.setStatus(status);
                p.setCreatedTime(createdTime);
                p.setUpdatedTime(updatedTime);
                break;
            }
            case "gpu": {
                ProductGpu p = (ProductGpu) rawData;
                p.setId(Integer.parseInt(id.split("#")[1]));
                p.setName(name);
                p.setSubtitle(subtitle);
                p.setMainImage(mainImage);
                p.setSubImages(subImages);
                p.setPrice(price);
                p.setStock(stock);
                p.setStatus(status);
                p.setCreatedTime(createdTime);
                p.setUpdatedTime(updatedTime);
                break;
            }
            case "ssd": {
                ProductSsd p = (ProductSsd) rawData;
                p.setId(Integer.parseInt(id.split("#")[1]));
                p.setName(name);
                p.setSubtitle(subtitle);
                p.setMainImage(mainImage);
                p.setSubImages(subImages);
                p.setPrice(price);
                p.setStock(stock);
                p.setStatus(status);
                p.setCreatedTime(createdTime);
                p.setUpdatedTime(updatedTime);
                break;
            }
            case "hdd": {
                ProductHdd p = (ProductHdd) rawData;
                p.setId(Integer.parseInt(id.split("#")[1]));
                p.setName(name);
                p.setSubtitle(subtitle);
                p.setMainImage(mainImage);
                p.setSubImages(subImages);
                p.setPrice(price);
                p.setStock(stock);
                p.setStatus(status);
                p.setCreatedTime(createdTime);
                p.setUpdatedTime(updatedTime);
                break;
            }
            case "powerSupply": {
                ProductPowerSupply p = (ProductPowerSupply) rawData;
                p.setId(Integer.parseInt(id.split("#")[1]));
                p.setName(name);
                p.setSubtitle(subtitle);
                p.setMainImage(mainImage);
                p.setSubImages(subImages);
                p.setPrice(price);
                p.setStock(stock);
                p.setStatus(status);
                p.setCreatedTime(createdTime);
                p.setUpdatedTime(updatedTime);
                break;
            }
            case "monitor": {
                ProductMonitor p = (ProductMonitor) rawData;
                p.setId(Integer.parseInt(id.split("#")[1]));
                p.setName(name);
                p.setSubtitle(subtitle);
                p.setMainImage(mainImage);
                p.setSubImages(subImages);
                p.setPrice(price);
                p.setStock(stock);
                p.setStatus(status);
                p.setCreatedTime(createdTime);
                p.setUpdatedTime(updatedTime);
                break;
            }
        }
    }
}

