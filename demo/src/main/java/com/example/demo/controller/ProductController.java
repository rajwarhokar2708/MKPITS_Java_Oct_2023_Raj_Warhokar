//package com.example.demo.controller;
//
//import com.example.demo.dto.ProductListDto;
//import com.example.demo.service.impl.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ProductController {
//
//    @Autowired
//    ProductService productService = new ProductService();
//
//    @RequestMapping("/v1/product")
//    public ResponseEntity<Object> getProduct() {
//        ProductListDto productDto = productService.getAllProduct();
//        return ResponseEntity.ok(productDto);
//
//    }
//
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    }
//}
