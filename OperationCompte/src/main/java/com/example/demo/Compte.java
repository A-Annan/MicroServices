package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.*;
import java.util.Collection;



class Client {
    String code;
    String addresse;
    String mail;
}

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    String code;
    double solde;
    String date_creation;
    //type (COURANT ou EPARGNE)
    String type;
    //etat (ACTIVE, SUSPENDED)
    String etat;
    @OneToMany(mappedBy = "operation")
    private Collection<Operation> operations;
    @Transient private Client client;
    private Long clientId;

}

interface CompteRepository extends JpaRepository<Compte, String>{
    Compte findByCode();
}





