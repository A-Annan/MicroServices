package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "CompteOperation")
public class CompteRestService {
    @Autowired
    private CompteRepository compteRepository;

    @Autowired
    private OperationRepository operationRepository;


    @PostMapping("/operations")
    private Compte ajouterCompte(@RequestBody Compte cp){
        return compteRepository.save(cp);
    }

    @PostMapping("/comptes/{code}")
    private Compte versementMontant(@PathVariable(value = "code") Long code, @RequestBody double montant){
        compteRepository.findByCode();
    }

}
