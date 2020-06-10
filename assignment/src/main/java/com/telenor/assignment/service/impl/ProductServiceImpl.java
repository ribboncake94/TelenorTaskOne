package com.telenor.assignment.service.impl;

import com.telenor.assignment.model.Product;
import com.telenor.assignment.model.ProductType;
import com.telenor.assignment.model.Property;
import com.telenor.assignment.model.PropertyCategory;
import com.telenor.assignment.model.request.ProductRequest;
import com.telenor.assignment.model.response.ProductResponse;
import com.telenor.assignment.repository.ProductRepository;
import com.telenor.assignment.repository.ProductTypeRepository;
import com.telenor.assignment.repository.PropertyCategoryRepository;
import com.telenor.assignment.repository.PropertyRepository;
import com.telenor.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private ProductTypeRepository productTypeRepository;
    private PropertyCategoryRepository propertyCategoryRepository;
    private PropertyRepository propertyRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductTypeRepository productTypeRepository, PropertyCategoryRepository propertyCategoryRepository, PropertyRepository propertyRepository) {
        this.productRepository = productRepository;
        this.productTypeRepository = productTypeRepository;
        this.propertyCategoryRepository = propertyCategoryRepository;
        this.propertyRepository = propertyRepository;

    }

    @Override
    public List<ProductResponse> getProduct(ProductRequest productRequest) {


        ProductType pt = this.productTypeRepository.findByType(productRequest.getType());

        PropertyCategory pc = this.propertyCategoryRepository.findByCategory(productRequest.getProperty());

        List<Property> propertyList;
        if (pc != null && productRequest.getColor() != null) {
            propertyList = this.propertyRepository.findByPropCatIdAndProperty(pc, productRequest.getColor());
        } else if (pc != null && (productRequest.getGbLimitMax() != 0 || productRequest.getGbLimitMin() != 0)) {
            propertyList = this.propertyRepository.findByPropCatIdAndPropertyIsGreaterThanEqualAndPropertyIsLessThanEqual(pc, String.valueOf(productRequest.getGbLimitMin()), String.valueOf(productRequest.getGbLimitMax()));
        } else {
            propertyList = this.propertyRepository.findAll();
        }
        List<Product> products = this.productRepository.findByTypeAndStoredAddressEndingWithAndPriceLessThanEqualAndPriceGreaterThanEqualAndPropertyIn(pt, productRequest.getCity(), productRequest.getMaxPrice(), productRequest.getMinPrice(), propertyList);
        List<ProductResponse> productResponseList = new ArrayList<>();
        for (Product product :
                products) {
            ProductResponse productResponse = new ProductResponse();
            productResponse.setPrice(product.getPrice());
            productResponse.setProperties(product.getProperty().getPropCatId().getCategory() + ":" + product.getProperty().getProperty());
            productResponse.setType(product.getType().getType());
            productResponse.setStore_address(product.getStoredAddress());
            productResponseList.add(productResponse);
        }

        return productResponseList;
    }

    @Override
    public ProductResponse getProductById(int id) {
        Product product = this.productRepository.findById(id);
        ProductResponse productResponse = new ProductResponse();
        productResponse.setPrice(product.getPrice());
        productResponse.setProperties(product.getProperty().getPropCatId().getCategory() + ":" + product.getProperty().getProperty());
        productResponse.setType(product.getType().getType());
        productResponse.setStore_address(product.getStoredAddress());
        return productResponse;
    }
}
