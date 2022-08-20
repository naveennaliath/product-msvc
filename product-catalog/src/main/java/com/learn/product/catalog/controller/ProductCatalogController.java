package com.learn.product.catalog.controller;

import com.learn.product.catalog.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/product-catalog")
public class ProductCatalogController {

    @GetMapping("/getCatalog")
    public ProductDto getCart() {
        log.info("Inside ProductCatalog:getCart");

        return ProductDto.builder().productName("New Product").build();
    }
}
