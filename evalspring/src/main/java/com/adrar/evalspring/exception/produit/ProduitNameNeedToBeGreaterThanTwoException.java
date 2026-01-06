package com.adrar.evalspring.exception.produit;

public class ProduitNameNeedToBeGreaterThanTwoException extends RuntimeException{

    public ProduitNameNeedToBeGreaterThanTwoException(String message) {
        super(message);
    }
}
