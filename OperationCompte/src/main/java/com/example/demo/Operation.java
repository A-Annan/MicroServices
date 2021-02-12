package com.example.demo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.*;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Operation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numero;
    String date;
    double montant;
//    type (DEBIT ou CREDIT)
    String type;
    @ManyToOne @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Compte compte;
}

@RepositoryRestResource
interface OperationRepository extends JpaRepository<Operation, Long>{}
