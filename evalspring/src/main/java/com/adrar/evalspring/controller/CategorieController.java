package com.adrar.evalspring.controller;


import com.adrar.evalspring.model.Categorie;
import com.adrar.evalspring.service.CategorieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor

public class CategorieController {


    private CategorieService categorieService;

    @GetMapping("/categories")
    @ResponseStatus(HttpStatus.OK)
    public List<Categorie> afficherTouteLesCategories()
    {

        return  categorieService.afficherTouteLesCategories();
    }

    @GetMapping("/categorie/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Categorie> afficherCategorie(@PathVariable Integer id)
    {
        return categorieService.afficherUneCategorieAvecSonId(id);
    }

    @PostMapping("/categorie")
    @ResponseStatus(HttpStatus.CREATED)
    public Categorie creeUneCategorie(@RequestBody Categorie categorie)
    {

        return categorieService.ajouterUneCategorie(categorie);
    }



}
