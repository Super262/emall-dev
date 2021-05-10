package com.fengwei.service.impl;

import com.fengwei.mapper.*;
import com.fengwei.pojo.*;
import com.fengwei.service.IProductMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ProductMapperServiceImpl implements IProductMapperService {

    @Autowired
    private ProductComputerMapper productComputerMapper;

    @Autowired
    private ProductCpuMapper productCpuMapper;

    @Autowired
    private ProductGpuMapper productGpuMapper;

    @Autowired
    private ProductHddMapper productHddMapper;

    @Autowired
    private ProductMemoryMapper productMemoryMapper;

    @Autowired
    private ProductMonitorMapper productMonitorMapper;

    @Autowired
    private ProductPowerSupplyMapper productPowerSupplyMapper;

    @Autowired
    private ProductSsdMapper productSsdMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        String[] idParts = id.split("#");
        String category = idParts[0];
        Integer trueId = Integer.parseInt(idParts[1]);
        switch (category) {
            case "computer": {
                return productComputerMapper.deleteByPrimaryKey(trueId);
            }
            case "cpu": {
                return productCpuMapper.deleteByPrimaryKey(trueId);
            }
            case "memory": {
                return productMemoryMapper.deleteByPrimaryKey(trueId);
            }
            case "gpu": {
                return productGpuMapper.deleteByPrimaryKey(trueId);
            }
            case "ssd": {
                return productSsdMapper.deleteByPrimaryKey(trueId);
            }
            case "hdd": {
                return productHddMapper.deleteByPrimaryKey(trueId);
            }
            case "powerSupply": {
                return productPowerSupplyMapper.deleteByPrimaryKey(trueId);
            }
            case "monitor": {
                return productMonitorMapper.deleteByPrimaryKey(trueId);
            }
        }
        return 0;
    }

    @Override
    public int insert(Product record) {
        String category = record.getId().split("#")[0];
        switch (category) {
            case "computer": {
                return productComputerMapper.insert((ProductComputer) record.getRawData());
            }
            case "cpu": {
                return productCpuMapper.insert((ProductCpu) record.getRawData());
            }
            case "memory": {
                return productMemoryMapper.insert((ProductMemory) record.getRawData());
            }
            case "gpu": {
                return productGpuMapper.insert((ProductGpu) record.getRawData());
            }
            case "ssd": {
                return productSsdMapper.insert((ProductSsd) record.getRawData());
            }
            case "hdd": {
                return productHddMapper.insert((ProductHdd) record.getRawData());
            }
            case "powerSupply": {
                return productPowerSupplyMapper.insert((ProductPowerSupply) record.getRawData());
            }
            case "monitor": {
                return productMonitorMapper.insert((ProductMonitor) record.getRawData());
            }
        }
        return -1;
    }

    @Override
    public int insertSelective(Product record) {
        String category = record.getId().split("#")[0];
        switch (category) {
            case "computer": {
                return productComputerMapper.insertSelective((ProductComputer) record.getRawData());
            }
            case "cpu": {
                return productCpuMapper.insertSelective((ProductCpu) record.getRawData());
            }
            case "memory": {
                return productMemoryMapper.insertSelective((ProductMemory) record.getRawData());
            }
            case "gpu": {
                return productGpuMapper.insertSelective((ProductGpu) record.getRawData());
            }
            case "ssd": {
                return productSsdMapper.insertSelective((ProductSsd) record.getRawData());
            }
            case "hdd": {
                return productHddMapper.insertSelective((ProductHdd) record.getRawData());
            }
            case "powerSupply": {
                return productPowerSupplyMapper.insertSelective((ProductPowerSupply) record.getRawData());
            }
            case "monitor": {
                return productMonitorMapper.insertSelective((ProductMonitor) record.getRawData());
            }
        }
        return -1;
    }

    @Override
    public Product selectByPrimaryKey(String id) {
        String[] idParts = id.split("#");
        String category = idParts[0];
        Integer trueId = Integer.parseInt(idParts[1]);
        Product result = new Product();
        result.setId(id);
        switch (category) {
            case "computer": {
                ProductComputer p = productComputerMapper.selectByPrimaryKey(trueId);
                result.setName(p.getName());
                result.setSubtitle(p.getSubtitle());
                result.setMainImage(p.getMainImage());
                result.setSubImages(p.getSubImages());
                result.setPrice(p.getPrice());
                result.setStock(p.getStock());
                result.setStatus(p.getStatus());
                result.setCreatedTime(p.getCreatedTime());
                result.setUpdatedTime(p.getUpdatedTime());
                result.setRawData(p);
                break;
            }
            case "cpu": {
                break;
            }
            case "memory": {
                break;
            }
            case "gpu": {
                break;
            }
            case "ssd": {
                break;
            }
            case "hdd": {

            }
            case "powerSupply": {

            }
            case "monitor": {

            }
            default: {
                return null;
            }
        }
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        return 0;
    }

    @Override
    public List<Product> selectByProductIdSet(Set<String> productIdSet) {
        return null;
    }
}
