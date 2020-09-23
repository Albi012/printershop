package com.codecool.printershop.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ProductDataFromRequest {
    String name;
    String price;
    List<String> filter;
    String imgSrc;
}
