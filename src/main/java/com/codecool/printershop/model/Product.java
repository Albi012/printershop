package com.codecool.printershop.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Product {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String price;
    String imgSrc;
    @ElementCollection
    List<String> filter;
    @OneToOne
    Rating rating;

}
