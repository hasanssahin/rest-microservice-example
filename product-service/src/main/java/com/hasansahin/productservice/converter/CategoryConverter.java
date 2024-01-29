package com.hasansahin.productservice.converter;

import com.hasansahin.productservice.model.Category;
import com.hasansahin.productservice.request.CategoryCreateRequest;
import com.hasansahin.productservice.response.CategoryCreateResponse;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {
    public Category convertCategoryCreateRequestToCategory(CategoryCreateRequest categoryCreateRequest){
        return new Category(categoryCreateRequest.name());
    }
    public CategoryCreateResponse convertCategoryToCategoryCreateResponse(Category category){
        return new CategoryCreateResponse(category.getName(), category.getUuid());
    }
}
