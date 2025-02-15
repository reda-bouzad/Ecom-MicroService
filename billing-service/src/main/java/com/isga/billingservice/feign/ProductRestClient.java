package com.isga.billingservice.feign;

import com.isga.billingservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service")
public interface ProductRestClient {
    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable String id);
    @GetMapping("/products")
    PagedModel<Product> getAllProducts();
}