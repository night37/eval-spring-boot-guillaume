package com.adrar.evalspring.exception.produit;

public class ProduitPrixNeedToBeGreaterThanZeroException extends RuntimeException{

    public ProduitPrixNeedToBeGreaterThanZeroException(String message) {
        super(message);
    }
}
