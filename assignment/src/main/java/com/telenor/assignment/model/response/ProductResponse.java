package com.telenor.assignment.model.response;

public class ProductResponse {

    private String type;

    private String properties;

    private double price;

    private String store_address;

    public ProductResponse() {
    }

    public ProductResponse(String type, String properties, double price, String store_address) {
        this.type = type;
        this.properties = properties;
        this.price = price;
        this.store_address = store_address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStore_address() {
        return store_address;
    }

    public void setStore_address(String store_address) {
        this.store_address = store_address;
    }
}
