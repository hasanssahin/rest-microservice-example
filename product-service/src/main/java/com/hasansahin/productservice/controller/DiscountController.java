package com.hasansahin.productservice.controller;

import com.hasansahin.productservice.request.DiscountRequest;
import com.hasansahin.productservice.response.AppliedDiscountResponse;
import com.hasansahin.productservice.service.DiscountService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/discounts")
@RequiredArgsConstructor
public class DiscountController {
    private final DiscountService discountService;
    @PostMapping
    public ResponseEntity<AppliedDiscountResponse> discount(@Valid @RequestBody DiscountRequest discountRequest){
        return ResponseEntity.ok(discountService.discount(discountRequest));
    }
}
