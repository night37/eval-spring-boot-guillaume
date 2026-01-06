package com.adrar.evalspring.exception.produit;

public class CategorieNotExistException extends RuntimeException{

    public CategorieNotExistException(String message) {
        super(message);
    }
}
