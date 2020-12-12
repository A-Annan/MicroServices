package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner start(customerRpository customerRpository){
        return args -> {
            customerRpository.save(new customer(null,"annan","mail@mail.com"));
            customerRpository.save(new customer(null,"ayoub","ayoub@mail.com"));
            customerRpository.save(new customer(null,"hiba","hiba@mail.com"));
            customerRpository.findAll().forEach(System.out::println);
        };
    }
}
