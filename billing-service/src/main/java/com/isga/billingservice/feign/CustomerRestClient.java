package com.isga.billingservice.feign;

import com.isga.billingservice.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer-service")
public interface CustomerRestClient {
    @GetMapping("/customers/{id}")
    Customer getCustomerById(@PathVariable Long id);

    @GetMapping("/customers")
    PagedModel<Customer> getAllCustomers();

}
