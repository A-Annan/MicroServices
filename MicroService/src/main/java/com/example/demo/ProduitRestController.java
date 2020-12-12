package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RepositoryRestController
public class ProduitRestController {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(path = "/produits")
    public List<Produit> list() {
        return produitRepository.findAll();
    }

    @GetMapping(path = "/produits/{id}")
    public Produit getOne(@PathVariable Long idProduit) {
        return produitRepository.findById(idProduit).get();
    }

    @PostMapping(path = "/produits")
    public Produit save(@RequestBody Produit produit) {
        return produitRepository.save(produit);
    }

    @PutMapping(path = "/produits/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
        produit.setId(id);
        return produitRepository.save(produit);
    }

    @DeleteMapping(path = "/produits/{id}")
    public void delete(@PathVariable Long id) {
        produitRepository.deleteById(id);
    }

}
