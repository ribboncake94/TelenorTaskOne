package com.telenor.assignment.repository;

import com.telenor.assignment.model.Property;
import com.telenor.assignment.model.PropertyCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PropertyRepository extends JpaRepository<Property,Integer> {

    List<Property> findByPropCatId(PropertyCategory pc);

    List<Property> findAll();

    List<Property> findByPropCatIdAndPropertyIsGreaterThanEqualAndPropertyIsLessThanEqual(PropertyCategory pc,String minGB , String maxGB);

    List<Property> findByPropCatIdAndProperty(PropertyCategory pc,String color);
}
