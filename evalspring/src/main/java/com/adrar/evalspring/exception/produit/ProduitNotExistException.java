package com.adrar.evalspring.exception.produit;

public class ProduitNotExistException extends RuntimeException{

    public ProduitNotExistException(String message) {
        super(message);
    }
}
