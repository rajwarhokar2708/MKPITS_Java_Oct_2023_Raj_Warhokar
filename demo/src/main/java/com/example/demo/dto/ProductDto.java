package com.example.demo.dto;

import java.util.List;

public class ProductDto {
    private int proId;
    private String proName;
    private String description;
    private float price;
//    private List<ProductDto> product;

    public ProductDto() {
    }

    public ProductDto(int proId, String proName, String description, float price) {
        this.proId = proId;
        this.proName = proName;
        this.description = description;
        this.price = price;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

//    public List<ProductDto> getProduct() {
//        return product;
//    }
//
//    public void setProduct(List<ProductDto> product) {
//        this.product = product;
//    }
}
