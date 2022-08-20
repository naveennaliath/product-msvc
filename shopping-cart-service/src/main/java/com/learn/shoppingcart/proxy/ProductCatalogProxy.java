package com.learn.shoppingcart.proxy;

import com.learn.shoppingcart.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="product-catalog", url = "${PRODUCT_CATALOG__SERVICE_HOST:http://localhost}:8000")
@Component
public interface ProductCatalogProxy {

    @GetMapping("/product-catalog/getCatalog")
    public ProductDto getCatalog();

}
