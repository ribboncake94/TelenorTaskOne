package com.telenor.assignment.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity()
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "type")
    private ProductType type;

    @OneToOne
    @JoinColumn(name = "properties")
    private Property property;

    @Column(name = "price")
    private Double price;

    @Column(name = "storedAddress")
    private String storedAddress;

    public Product() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStoredAddress() {
        return storedAddress;
    }

    public void setStoredAddress(String storedAddress) {
        this.storedAddress = storedAddress;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type=" + type +
                ", property=" + property +
                ", price=" + price +
                ", storedAddress='" + storedAddress + '\'' +
                '}';
    }
}
