package com.example.demo.service.impl;

import com.example.demo.dto.ProductListDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService {
    @Override
    public ProductListDto getAllProduct() {
//        ProductDto productDto = new ProductDto();
        ProductListDto productListDto =new ProductListDto();
        List<ProductDto> productDtosList=new ArrayList<>();

        ProductDto productDto1= new ProductDto();
        productDto1.setProId(1);
        productDto1.setProName("Mobile");
        productDto1.setDescription("Iphone");
        productDto1.setPrice(50000.20f);

        ProductDto productDto2= new ProductDto();
        productDto2.setProId(2);
        productDto2.setProName("Laptop");
        productDto2.setDescription("Hp Victus");
        productDto2.setPrice(70000.00f);


        ProductDto productDto3= new ProductDto();
        productDto3.setProId(3);
        productDto3.setProName("HeadSet");
        productDto3.setDescription("Boats");
        productDto3.setPrice(500.20f);

        ProductDto productDto4= new ProductDto();
        productDto4.setProId(4);
        productDto4.setProName("Charger");
        productDto4.setDescription("Realmi");
        productDto4.setPrice(300.20f);

        ProductDto productDto5= new ProductDto();
        productDto5.setProId(4);
        productDto5.setProName("Keyboard");
        productDto5.setDescription("Zebronix");
        productDto5.setPrice(250.20f);

        productDtosList.add(productDto1);
        productDtosList.add(productDto2);
        productDtosList.add(productDto3);
        productDtosList.add(productDto4);
        productDtosList.add(productDto5);


        productListDto.setProducts(productDtosList);
        return productListDto;


    }
}
