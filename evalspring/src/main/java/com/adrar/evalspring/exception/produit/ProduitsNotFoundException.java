package com.adrar.evalspring.exception.produit;

public class ProduitsNotFoundException extends RuntimeException{

    public ProduitsNotFoundException(String message) {
        super(message);
    }
}
