package com.telenor.assignment.repository;

import com.telenor.assignment.model.Product;
import com.telenor.assignment.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {

    ProductType findByType(String type);
}
