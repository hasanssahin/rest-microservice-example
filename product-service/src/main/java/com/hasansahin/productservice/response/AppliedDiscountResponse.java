package com.hasansahin.productservice.response;

public record AppliedDiscountResponse(String code,Float newPrice, Float oldPrice, Float appliedDiscount,Boolean result,String message) {
}