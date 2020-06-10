package com.telenor.assignment.service;

import com.telenor.assignment.model.request.ProductRequest;
import com.telenor.assignment.model.response.ProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductResponse> getProduct(ProductRequest productRequest);

    ProductResponse getProductById(int id);
}
