package com.fengwei.service.impl;

import com.fengwei.enums.ProductStatusEnum;
import com.fengwei.enums.ResponseEnum;
import com.fengwei.pojo.Product;
import com.fengwei.pojo.vo.ProductVo;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.IProductMapperService;
import com.fengwei.service.IProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private IProductMapperService productMapperService;

    @Override
    public ResponseVo<PageInfo> getListOfProducts(String category,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Product> productList = productMapperService.selectByCategory(category);
        List<ProductVo> productVoList = productList.stream().map(e -> {
            ProductVo productVo = new ProductVo();
            BeanUtils.copyProperties(e,productVo);
            return productVo;
        }).collect(Collectors.toList());

        PageInfo pageInfo = new PageInfo<>(productList);
        pageInfo.setList(productVoList);
        return ResponseVo.success(pageInfo);
    }

    @Override
    public ResponseVo<Product> getDetailOfProduct(String productId) {
        Product product = productMapperService.selectByPrimaryKey(productId);
        //只对确定性条件判断
        if (product.getStatus().equals(ProductStatusEnum.OFF_SALE.getCode()) || product.getStatus().equals(ProductStatusEnum.DELETE.getCode())) {
            return ResponseVo.error(ResponseEnum.PRODUCT_OFF_SALE_OR_DELETE);
        }
        product.setStock(product.getStock() > 100 ? 100 : product.getStock());
        return ResponseVo.success(product);
    }
}
