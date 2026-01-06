package com.adrar.evalspring.service;
import com.adrar.evalspring.exception.categorie.CategorieLibeleNeedToBeGreaterThanTwoException;
import com.adrar.evalspring.exception.categorie.CategorieNotExistException;
import com.adrar.evalspring.exception.categorie.CategoriesNotFoundException;
import com.adrar.evalspring.model.Categorie;
import com.adrar.evalspring.repository.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategorieService {

    private CategorieRepository categorieRepository;


    public Categorie ajouterUneCategorie(Categorie categorie){

        if(categorie.getLibele().length() <= 2 ) {
            throw new CategorieLibeleNeedToBeGreaterThanTwoException("Le libele  : " + categorie.getLibele() +" doit contenir au minimum deux caractères.");
        }
        return categorieRepository.save(categorie);
    }

    public List<Categorie> afficherTouteLesCategories()
    {
        if (categorieRepository.count() == 0) {
            throw new CategoriesNotFoundException("La liste des catégorie est vide");
        }
        return (List<Categorie>) categorieRepository.findAll();
    }

    public Optional<Categorie> afficherUneCategorieAvecSonId(Integer id)
    {
        return Optional
                .of(categorieRepository
                        .findById(id)
                        .orElseThrow(
                                ()-> new CategorieNotExistException("La catégorie avec id :" + id +  " n'existe pas")
                        )
                );
    }
}
