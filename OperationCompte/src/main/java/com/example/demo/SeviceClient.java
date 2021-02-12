package com.example.demo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Client")
public interface SeviceClient {
    @GetMapping("/customer-service/{id}")
    Client findCustomerById(@PathVariable("id") Long id);
}
