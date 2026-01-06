package com.adrar.evalspring.service;
import com.adrar.evalspring.exception.produit.ProduitNameNeedToBeGreaterThanTwoException;
import com.adrar.evalspring.exception.produit.ProduitNotExistException;
import com.adrar.evalspring.exception.produit.ProduitPrixNeedToBeGreaterThanZeroException;
import com.adrar.evalspring.exception.produit.ProduitsNotFoundException;
import com.adrar.evalspring.model.Produit;
import com.adrar.evalspring.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProduitService {

    private ProduitRepository produitRepository;


    public Produit ajouterUnProduit(Produit produit){

        if(produit.getPrix() <= 0) {
            throw new ProduitPrixNeedToBeGreaterThanZeroException("La valeur  : " + produit.getPrix() +" doit être supérieur à zéro.");
        }
        if(produit.getNom().length() <= 2 ) {
            throw new ProduitNameNeedToBeGreaterThanTwoException("Le nom  : " + produit.getNom() +" doit contenir au minimum deux caractères.");
        }
        return produitRepository.save(produit);
    }

    public List<Produit> afficherToutLesProduits()
    {
        if (produitRepository.count() == 0) {
            throw new ProduitsNotFoundException("La liste des produits est vide");
        }
        return (List<Produit>) produitRepository.findAll();
    }

    public Optional<Produit> afficherUnProduitAvecSonId(Integer id)
    {
        return Optional
                .of(produitRepository
                        .findById(id)
                        .orElseThrow(
                                ()-> new ProduitNotExistException("Le produit avec id :" + id +  " n'existe pas")
                        )
                );
    }
}
