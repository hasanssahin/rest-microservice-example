package com.hasansahin.productservice.client;

import com.hasansahin.productservice.config.DiscountServiceClientConfiguration;
import com.hasansahin.productservice.request.DiscountRequest;
import com.hasansahin.productservice.response.AppliedDiscountResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@FeignClient(name = "discount-service",path = "api/discounts",url = "http://localhost:8083")
public interface DiscountServiceClient {
    @PostMapping
    ResponseEntity<AppliedDiscountResponse> discount(@RequestBody DiscountRequest discountRequest);
}
