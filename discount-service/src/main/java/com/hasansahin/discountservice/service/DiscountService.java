package com.hasansahin.discountservice.service;

import com.hasansahin.discountservice.model.Category;
import com.hasansahin.discountservice.model.Discount;
import com.hasansahin.discountservice.repository.DiscountRepository;
import com.hasansahin.discountservice.request.DiscountRequest;
import com.hasansahin.discountservice.response.AppliedDiscountResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiscountService {
    private final DiscountRepository discountRepository;
    private final CategoryService categoryService;
    public AppliedDiscountResponse discount(DiscountRequest discountRequest){
        Category category=categoryService.getCategoryByUuid(discountRequest.categoryUuid());
        Discount discount=discountRepository.findByCodeAndCategoryExternalCategoryUuid(discountRequest.code(), category.getExternalCategoryUuid()).orElse(null);
        if(discount!=null){
            float newPrice= discountRequest.price()- discount.getDiscountPrice();
            return new AppliedDiscountResponse(discountRequest.code(), newPrice, discountRequest.price(), discount.getDiscountPrice(), true,"Discount applied successfully.");
        }else{
            return new AppliedDiscountResponse(discountRequest.code(), discountRequest.price(), discountRequest.price(), discount.getDiscountPrice(), true,"Discount applied successfully.");
        }
    }
}
