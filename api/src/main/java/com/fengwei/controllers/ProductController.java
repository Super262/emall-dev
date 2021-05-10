package com.fengwei.controllers;

import com.fengwei.pojo.Product;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.IProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public ResponseVo<PageInfo> list(@RequestParam(required = false) String category,@RequestParam(required = false, defaultValue = "1") Integer pageNum,@RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return productService.getListOfProducts(category,pageNum,pageSize);
    }

    @GetMapping("/products/{productId}")
    public ResponseVo<Product> detail(@PathVariable String productId) {
        return productService.getDetailOfProduct(productId);
    }
}