package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.config.Projection;


@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {

    @RestResource(path = "/byName")
    Page<Produit> findByNameContains(@Param("kw") String name, Pageable pageable);
}


@Projection(name = "p", types = Produit.class)
interface P1 {
    String getName();
}


@Projection(name = "p2", types = Produit.class)
interface P2 {
    String getName();
}

