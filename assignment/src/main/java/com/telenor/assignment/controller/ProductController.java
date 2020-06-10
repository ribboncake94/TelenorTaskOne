package com.telenor.assignment.controller;


import com.telenor.assignment.model.request.ProductRequest;
import com.telenor.assignment.model.response.ProductResponse;
import com.telenor.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET, produces = "application/json")
    public List<ProductResponse> getProduct(@RequestParam(value = "type", required = false, defaultValue = "") String type,
                                            @RequestParam(value = "max_price", required = false, defaultValue = "1000000") double maxPrice,
                                            @RequestParam(value = "min_price", required = false, defaultValue = "0") double minPrice,
                                            @RequestParam(value = "city", required = false, defaultValue = "") String city,
                                            @RequestParam(value = "property", required = false, defaultValue = "") String property,
                                            @RequestParam(value = "property:color",required = false, defaultValue = "") String color,
                                            @RequestParam(value = "property:gb_limit_min",required = false, defaultValue = "0") int gbLimitMin,
                                            @RequestParam(value = "property:gb_limit_max",required = false, defaultValue = "100000") int gbLimitMax) {
        ProductRequest productRequest = new ProductRequest();
        productRequest.setCity(city);
        productRequest.setType(type);
        productRequest.setMaxPrice(maxPrice);
        productRequest.setMinPrice(minPrice);
        if(property.equals("color")){
        productRequest.setProperty(property);
        productRequest.setColor(color);
        }else if(property.equals("gb_limit")){
        productRequest.setProperty(property);
        productRequest.setGbLimitMax(gbLimitMax);
        productRequest.setGbLimitMin(gbLimitMin);
        }else {
            productRequest.setGbLimitMax(gbLimitMax);
            productRequest.setGbLimitMin(gbLimitMin);
            productRequest.setColor(color);
        }
        return productService.getProduct(productRequest);
    }

    @RequestMapping(value = "/product_id", method = RequestMethod.GET, produces = "application/json")
    public ProductResponse getProductById(int id) {
        return productService.getProductById(id);
    }
}
