package com.telenor.assignment.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity()
@Table(name = "product_type")
public class ProductType implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "type")
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "ProductType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}

