package com.telenor.assignment.model.request;

public class ProductRequest {

    private String type;

    private double minPrice;

    private double maxPrice;

    private String city;

    private int gbLimitMin;

    private int gbLimitMax;

    private String color;

    private String property;


    public ProductRequest() {
    }

    public ProductRequest(String type, double minPrice, double max_price, String city) {
        this.type = type;
        this.minPrice = minPrice;
        this.maxPrice = max_price;
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getGbLimitMin() {
        return gbLimitMin;
    }

    public void setGbLimitMin(int gbLimitMin) {
        this.gbLimitMin = gbLimitMin;
    }

    public int getGbLimitMax() {
        return gbLimitMax;
    }

    public void setGbLimitMax(int gbLimitMax) {
        this.gbLimitMax = gbLimitMax;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
