package com.codecool.printershop.service;

import com.codecool.printershop.model.Product;
import com.codecool.printershop.model.ProductDataFromRequest;
import com.codecool.printershop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDataManager {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByFilter(String filter) {

        return productRepository.findAllByFilter(filter);
    }

    public void saveNewProduct(ProductDataFromRequest productDataFromRequest) {
        Product newProduct = Product.builder()
                .name(productDataFromRequest.getName())
                .filter(productDataFromRequest.getFilter())
                .price(productDataFromRequest.getPrice())
                .imgSrc(productDataFromRequest.getImgSrc())
                .build();
        productRepository.saveAndFlush(newProduct);
    }
}
