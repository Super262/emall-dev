package com.fengwei.service;

import com.fengwei.pojo.Product;

import java.util.List;
import java.util.Set;

public interface IProductMapperService {
    int deleteByPrimaryKey(String id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectByCategory(String category);

    List<Product> selectByProductIdSet(Set<String> productIdSet);
}
