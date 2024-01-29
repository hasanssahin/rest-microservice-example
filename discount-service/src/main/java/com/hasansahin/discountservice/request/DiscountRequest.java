package com.hasansahin.discountservice.request;

import jakarta.validation.constraints.NotBlank;

public record DiscountRequest(@NotBlank String code, @NotBlank Float price, @NotBlank String categoryUuid) {
}
