package com.codecool.printershop.controller;

import com.codecool.printershop.model.Product;
import com.codecool.printershop.model.ProductDataFromRequest;
import com.codecool.printershop.service.ProductDataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductDataManager productDataManager;

    @GetMapping("/all-product")
    List<Product> getAllProducts(){
      return productDataManager.getAllProducts();
    };

    @GetMapping("/products/{filter}")
    List<Product> getProductsByFilterAndOrder(@PathVariable("filter")String filter){
        return productDataManager.getProductsByFilter(filter);
    }

    @PostMapping("/upload-product")
    void uploadNewProduct(@RequestBody ProductDataFromRequest productDataFromRequest){}

}
