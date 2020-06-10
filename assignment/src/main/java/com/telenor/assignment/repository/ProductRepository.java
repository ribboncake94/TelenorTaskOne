package com.telenor.assignment.repository;

import com.telenor.assignment.model.Product;
import com.telenor.assignment.model.ProductType;
import com.telenor.assignment.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findAll();

    Product findById(int id);

    List<Product> findByTypeAndStoredAddressEndingWithAndPriceLessThanEqualAndPriceGreaterThanEqualAndPropertyIn(ProductType pt, String ad, double maxPrice, double minPrice, List<Property> propertyList);
}
