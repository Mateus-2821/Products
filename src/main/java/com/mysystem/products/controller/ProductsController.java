package com.mysystem.products.controller;

import com.mysystem.products.dto.ProductRequest;
import com.mysystem.products.dto.ProductResponse;
import com.mysystem.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping
    private ProductResponse searchProduct(@PathVariable String name){
        return productService.getProduct();
    }

    @PostMapping
    private ProductResponse insertProduct(@RequestBody ProductRequest productRequest){
        return productService.insertProduct();
    }

    //TODO update de produto
//    private Product updateProduct(@RequestBody Product product){
//        return productService.getProduct();
//    }

    //TODO delete de produto
//    private Product updateProduct(@RequestBody Product product){
//        return productService.getProduct();
//    }
}
