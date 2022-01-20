package com.mysystem.products.service;

import com.mysystem.products.dto.ProductResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public ProductResponse getProduct(){
        //TODO receber parametro de busca
        //TODO realizar a busca no banco
        return ProductResponse.builder().build();
    }

    public ProductResponse insertProduct() {
        //TODO corpo de requisição
        //TODO criar entidade do banco
        //TODO realizar o insert

        return ProductResponse.builder().build();
    }
}
