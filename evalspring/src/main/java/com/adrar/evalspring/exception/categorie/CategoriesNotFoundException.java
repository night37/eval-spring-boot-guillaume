package com.adrar.evalspring.exception.produit;

public class CategoriesNotFoundException extends RuntimeException{

    public CategoriesNotFoundException(String message) {
        super(message);
    }
}
