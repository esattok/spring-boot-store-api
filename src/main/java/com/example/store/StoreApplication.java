package com.example.store;

import com.example.store.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
       // ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        User user = User.builder()
                    .name("admin")
                   .email("john@example.com")
                   .password("admin")
                    .build();


        Category category = Category.builder().name("category").build();
        category.addProduct(Product.builder().name("product").price(BigDecimal.valueOf(100.50)).build());

        System.out.println(category);
    }

}
