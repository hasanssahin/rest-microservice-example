package com.hasansahin.productservice.controller;

import com.hasansahin.productservice.request.CategoryCreateRequest;
import com.hasansahin.productservice.response.CategoryCreateResponse;
import com.hasansahin.productservice.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryCreateResponse> saveCategory(@Valid @RequestBody CategoryCreateRequest categoryCreateRequest){
        return ResponseEntity.ok(categoryService.saveCategory(categoryCreateRequest));
    }

    @GetMapping
    public ResponseEntity<CategoryCreateResponse> getCategoryByUuid(@RequestParam String uuid){
        return ResponseEntity.ok(categoryService.getCategoryByUuid(uuid));
    }
}
