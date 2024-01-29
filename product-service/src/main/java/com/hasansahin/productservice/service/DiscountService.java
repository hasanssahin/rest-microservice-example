package com.hasansahin.productservice.service;

import com.hasansahin.productservice.client.DiscountServiceClient;
import com.hasansahin.productservice.request.DiscountRequest;
import com.hasansahin.productservice.response.AppliedDiscountResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiscountService {

    private final DiscountServiceClient discountServiceClient;

    public AppliedDiscountResponse discount(DiscountRequest discountRequest){
        AppliedDiscountResponse appliedDiscountResponse=discountServiceClient.discount(discountRequest).getBody();
        System.out.println(appliedDiscountResponse);
        return appliedDiscountResponse;

    }

}
