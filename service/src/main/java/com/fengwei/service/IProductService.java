package com.fengwei.service;

import com.fengwei.pojo.vo.ProductDetailVo;
import com.fengwei.pojo.vo.ResponseVo;
import com.github.pagehelper.PageInfo;

public interface IProductService {

    ResponseVo<PageInfo> getListOfProducts(Integer categoryId,Integer pageNum,Integer pageSize);

    ResponseVo<ProductDetailVo> getDetailOfProduct(Integer productId);
}
