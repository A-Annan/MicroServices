package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    CommandLineRunner start(PRoductRpository pRoductRpository){
        return args -> {
            pRoductRpository.save(new Product(null,"airpods",1600));
            pRoductRpository.save(new Product(null,"ipad",8000));
            pRoductRpository.save(new Product(null,"mac",12000));
        };
    }
}
