package com.hasansahin.productservice.converter;


import com.hasansahin.productservice.model.Product;
import com.hasansahin.productservice.request.ProductCreateRequest;
import com.hasansahin.productservice.response.ProductCreateResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public Product convertProductCreateRequestToProduct(ProductCreateRequest productCreateRequest){
        return new Product(productCreateRequest.name(), productCreateRequest.description(), productCreateRequest.quantity(), productCreateRequest.price());
    }
    public ProductCreateResponse convertProductToProductCreateResponse(Product product){
        return new ProductCreateResponse(product.getName(), product.getDescription(), product.getQuantity(), product.getPrice(), product.getCategory().getName(), product.getUuid());
    }
}
