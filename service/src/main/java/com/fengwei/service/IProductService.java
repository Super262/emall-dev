package com.fengwei.service;

import com.fengwei.pojo.Product;
import com.fengwei.pojo.vo.ResponseVo;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

public interface IProductService {

    ResponseVo<PageInfo> getListOfProducts(String category,Integer pageNum,Integer pageSize);

    ResponseVo<Product> getDetailOfProduct(String productId);
}
