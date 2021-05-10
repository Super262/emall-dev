package com.fengwei.service.impl;

import com.fengwei.mapper.*;
import com.fengwei.pojo.*;
import com.fengwei.service.IProductMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
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
        return 0;
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
        return 0;
    }

    @Override
    public Product selectByPrimaryKey(String id) {
        String[] idParts = id.split("#");
        String category = idParts[0];
        Integer trueId = Integer.parseInt(idParts[1]);
        Product result = null;
        switch (category) {
            case "computer": {
                ProductComputer p = productComputerMapper.selectByPrimaryKey(trueId);
                result = new Product(p);
                break;
            }
            case "cpu": {
                ProductCpu p = productCpuMapper.selectByPrimaryKey(trueId);
                result = new Product(p);
                break;
            }
            case "memory": {
                ProductMemory p = productMemoryMapper.selectByPrimaryKey(trueId);
                result = new Product(p);
                break;
            }
            case "gpu": {
                ProductGpu p = productGpuMapper.selectByPrimaryKey(trueId);
                result = new Product(p);
                break;
            }
            case "ssd": {
                ProductSsd p = productSsdMapper.selectByPrimaryKey(trueId);
                result = new Product(p);
                break;
            }
            case "hdd": {
                ProductHdd p = productHddMapper.selectByPrimaryKey(trueId);
                result = new Product(p);
                break;
            }
            case "powerSupply": {
                ProductPowerSupply p = productPowerSupplyMapper.selectByPrimaryKey(trueId);
                result = new Product(p);
                break;
            }
            case "monitor": {
                ProductMonitor p = productMonitorMapper.selectByPrimaryKey(trueId);
                result = new Product(p);
                break;
            }
        }
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        String category = record.getId().split("#")[0];
        switch (category) {
            case "computer": {
                return productComputerMapper.updateByPrimaryKeySelective((ProductComputer) record.getRawData());
            }
            case "cpu": {
                return productCpuMapper.updateByPrimaryKeySelective((ProductCpu) record.getRawData());
            }
            case "memory": {
                return productMemoryMapper.updateByPrimaryKeySelective((ProductMemory) record.getRawData());
            }
            case "gpu": {
                return productGpuMapper.updateByPrimaryKeySelective((ProductGpu) record.getRawData());
            }
            case "ssd": {
                return productSsdMapper.updateByPrimaryKeySelective((ProductSsd) record.getRawData());
            }
            case "hdd": {
                return productHddMapper.updateByPrimaryKeySelective((ProductHdd) record.getRawData());
            }
            case "powerSupply": {
                return productPowerSupplyMapper.updateByPrimaryKeySelective((ProductPowerSupply) record.getRawData());
            }
            case "monitor": {
                return productMonitorMapper.updateByPrimaryKeySelective((ProductMonitor) record.getRawData());
            }
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        String category = record.getId().split("#")[0];
        switch (category) {
            case "computer": {
                return productComputerMapper.updateByPrimaryKey((ProductComputer) record.getRawData());
            }
            case "cpu": {
                return productCpuMapper.updateByPrimaryKey((ProductCpu) record.getRawData());
            }
            case "memory": {
                return productMemoryMapper.updateByPrimaryKey((ProductMemory) record.getRawData());
            }
            case "gpu": {
                return productGpuMapper.updateByPrimaryKey((ProductGpu) record.getRawData());
            }
            case "ssd": {
                return productSsdMapper.updateByPrimaryKey((ProductSsd) record.getRawData());
            }
            case "hdd": {
                return productHddMapper.updateByPrimaryKey((ProductHdd) record.getRawData());
            }
            case "powerSupply": {
                return productPowerSupplyMapper.updateByPrimaryKey((ProductPowerSupply) record.getRawData());
            }
            case "monitor": {
                return productMonitorMapper.updateByPrimaryKey((ProductMonitor) record.getRawData());
            }
        }
        return 0;
    }

    @Override
    public List<Product> selectByCategory(String category) {
        List<Product> results = new LinkedList<>();
        switch (category) {
            case "computer": {
                for (ProductComputer p : productComputerMapper.selectAll()) {
                    results.add(new Product(p));
                }
                break;
            }
            case "cpu": {
                for (ProductCpu p : productCpuMapper.selectAll()) {
                    results.add(new Product(p));
                }
                break;
            }
            case "memory": {
                for (ProductMemory p : productMemoryMapper.selectAll()) {
                    results.add(new Product(p));
                }
                break;
            }
            case "gpu": {
                for (ProductGpu p : productGpuMapper.selectAll()) {
                    results.add(new Product(p));
                }
                break;
            }
            case "ssd": {
                for (ProductSsd p : productSsdMapper.selectAll()) {
                    results.add(new Product(p));
                }
                break;
            }
            case "hdd": {
                for (ProductHdd p : productHddMapper.selectAll()) {
                    results.add(new Product(p));
                }
                break;
            }
            case "powerSupply": {
                for (ProductPowerSupply p : productPowerSupplyMapper.selectAll()) {
                    results.add(new Product(p));
                }
                break;
            }
            case "monitor": {
                for (ProductMonitor p : productMonitorMapper.selectAll()) {
                    results.add(new Product(p));
                }
                break;
            }
        }
        return results;
    }

    @Override
    public List<Product> selectByProductIdSet(Set<String> productIdSet) {
        List<Product> results = new LinkedList<>();
        for (String id : productIdSet) {
            Product item = this.selectByPrimaryKey(id);
            if (item != null) {
                results.add(item);
            }
        }
        return results;
    }
}
