package com.codecool.printershop.service;

import com.codecool.printershop.model.Product;
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
}
