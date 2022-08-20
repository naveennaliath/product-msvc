package com.learn.shoppingcart.controller;

import com.learn.shoppingcart.dto.ProductDto;
import com.learn.shoppingcart.proxy.ProductCatalogProxy;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    Logger logger =
            LoggerFactory.getLogger(ShoppingCartController.class);

    @Autowired
    private ProductCatalogProxy productCatalogProxy;

    @GetMapping("/getCart")
    public ResponseEntity<ProductDto> getCart() {
        logger.info("Inside getCart");
        ProductDto productDto = productCatalogProxy.getCatalog();
        return new ResponseEntity<ProductDto>(productDto, HttpStatus.OK);
    }
}
