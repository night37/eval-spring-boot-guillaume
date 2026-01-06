package com.adrar.evalspring.controller;


import com.adrar.evalspring.model.Produit;
import com.adrar.evalspring.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor

public class ProduitController {


    private ProduitService produitService;
    private Produit produit;

    @GetMapping("/produits")
    @ResponseStatus(HttpStatus.OK)
    public List<Produit> afficherToutLesProduits()
    {
        return  produitService.afficherToutLesProduits();
    }

    @GetMapping("/produit/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Produit> afficherProduit(@PathVariable Integer id)
    {
        return produitService.afficherUnProduitAvecSonId(id);
    }

    @PostMapping("/produit")
    @ResponseStatus(HttpStatus.CREATED)
    public Produit creeUnProduit(@RequestBody Produit produit)
    {
        return produitService.ajouterUnProduit(produit);
    }



}
