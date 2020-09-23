package com.codecool.printershop.controller;

import com.codecool.printershop.service.ProductDataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class RatingController {

    @Autowired
    ProductDataManager productDataManager;

    @PostMapping("/like")
    void modifyLike(@RequestBody HashMap<String,Long> likeData){
        Long userId = likeData.get("userId");
        Long productId = likeData.get("productId");
        productDataManager.modifyLike(userId,productId);
    }
}
