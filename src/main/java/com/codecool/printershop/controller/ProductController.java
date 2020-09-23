package com.codecool.printershop.controller;

import com.codecool.printershop.model.Product;
import com.codecool.printershop.service.ProductDataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductDataManager productDataManager;

    @GetMapping("/all-product")
    List<Product> getAllProducts(){
      return productDataManager.getAllProducts();
    };

}
