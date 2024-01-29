package com.hasansahin.discountservice.controller;

import com.hasansahin.discountservice.request.DiscountRequest;
import com.hasansahin.discountservice.response.AppliedDiscountResponse;
import com.hasansahin.discountservice.service.DiscountService;
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
    ResponseEntity<AppliedDiscountResponse> discount(@RequestBody DiscountRequest discountRequest){
        return ResponseEntity.ok(discountService.discount(discountRequest));
    }
}
