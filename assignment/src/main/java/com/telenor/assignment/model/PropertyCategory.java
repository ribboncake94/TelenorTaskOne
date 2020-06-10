package com.telenor.assignment.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity()
@Table(name = "property_category")
public class PropertyCategory implements Serializable {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @Column(name = "category")
    private String category;

    public PropertyCategory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "PropertyCategory{" +
                "id=" + id +
                ", category='" + category + '\'' +
                '}';
    }
}
