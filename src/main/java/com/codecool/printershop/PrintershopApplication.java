package com.codecool.printershop;

import com.codecool.printershop.model.Product;
import com.codecool.printershop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PrintershopApplication {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(PrintershopApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return args -> {
            Product print1 = Product.builder()
                    .name("TestPrint")
                    .filter(List.of("TestFilter","TestFilter2"))
                    .price("2000")
                    .build();
            productRepository.saveAndFlush(print1);
            Product print2 = Product.builder()
                    .name("TestPrint2")
                    .filter(List.of("TestFilter3"))
                    .price("2000")
                    .build();
            productRepository.saveAndFlush(print2);
        };
    }
}
