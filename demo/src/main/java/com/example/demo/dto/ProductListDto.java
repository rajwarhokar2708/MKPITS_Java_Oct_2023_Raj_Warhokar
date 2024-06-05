package com.example.demo.dto;

import java.util.List;

public class ProductListDto {
    private List<ProductDto> products;

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> productDtosList) {
        this.products =productDtosList;
    }
}
