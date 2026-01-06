package com.adrar.evalspring.controller;

import com.adrar.evalspring.exception.produit.ProduitNameNeedToBeGreaterThanTwoException;
import com.adrar.evalspring.exception.produit.ProduitNotExistException;
import com.adrar.evalspring.exception.produit.ProduitPrixNeedToBeGreaterThanZeroException;
import com.adrar.evalspring.exception.produit.ProduitsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionProduitController {

    @ExceptionHandler(ProduitNameNeedToBeGreaterThanTwoException.class)
    public ResponseEntity<Map<String, String>> handleProduitNameNeedToBeGreaterThanTwoException(RuntimeException ex)
    {
        Map<String,String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }

    @ExceptionHandler(ProduitNotExistException.class)
    public ResponseEntity<Map<String, String>> handleProduitNotExistException(RuntimeException ex)
    {
        Map<String,String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
    @ExceptionHandler(ProduitPrixNeedToBeGreaterThanZeroException.class)
    public ResponseEntity<Map<String, String>> handleProduitPrixNeedToBeGreaterThanZeroException(RuntimeException ex)
    {
        Map<String,String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
    @ExceptionHandler(ProduitsNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleProduitsNotFoundException(RuntimeException ex)
    {
        Map<String,String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
}