package com.hasansahin.productservice.request;

import jakarta.validation.constraints.NotBlank;

public record CategoryCreateRequest(@NotBlank(message = "Category name cannot be blank")String name) {
}
