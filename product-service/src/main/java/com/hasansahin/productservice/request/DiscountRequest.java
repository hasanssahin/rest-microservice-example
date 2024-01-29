package com.hasansahin.productservice.request;

import jakarta.validation.constraints.NotBlank;

public record DiscountRequest(@NotBlank String code, Float price, @NotBlank String categoryUuid) {
}
