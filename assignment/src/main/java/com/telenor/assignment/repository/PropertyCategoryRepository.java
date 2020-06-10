package com.telenor.assignment.repository;

import com.telenor.assignment.model.ProductType;
import com.telenor.assignment.model.PropertyCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PropertyCategoryRepository extends JpaRepository<PropertyCategory,Integer> {

    PropertyCategory findByCategory(String category);
}
