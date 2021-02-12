package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.Null;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner start(OperationRepository operationRepository,CompteRepository compteRepository){
        return args -> {
            operationRepository.save(new Operation(null,"12/12/12",1231,"Debit"));
            operationRepository.save(new Operation(null,"11/12/12",1231,"Credit"));
            operationRepository.save(new Operation(null,"20/12/12",3632,"Debit"));
            operationRepository.save(new Operation(null,"30/12/12",5788,"Credit"));
            operationRepository.findAll().forEach(System.out::println);

            compteRepository.save(new Compte(null,12333,"12/12/12","Courant","Active"));
            compteRepository.save(new Compte(null,12308,"09/12/12","Epargne","Suspended"));
            compteRepository.save(new Compte(null,45623,"22/12/12","Courant","Active"));
            compteRepository.save(new Compte(null,35236,"10/12/12","Epargne","Suspended"));
            compteRepository.findAll().forEach(System.out::println);
        };
    }





}
