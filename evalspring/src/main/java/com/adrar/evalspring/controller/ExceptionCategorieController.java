package com.adrar.evalspring.controller;


import com.adrar.evalspring.exception.categorie.CategorieLibeleNeedToBeGreaterThanTwoException;
import com.adrar.evalspring.exception.categorie.CategorieNotExistException;
import com.adrar.evalspring.exception.categorie.CategoriesNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class AdviceCategorieController {

    @ExceptionHandler(CategoriesNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleCategoriesNotFoundException(RuntimeException ex)
    {
        Map<String,String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }

    @ExceptionHandler(CategorieNotExistException.class)
    public ResponseEntity<Map<String, String>> handleCategorieNotExistException(RuntimeException ex)
    {
        Map<String,String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
    @ExceptionHandler(CategorieLibeleNeedToBeGreaterThanTwoException.class)
    public ResponseEntity<Map<String, String>> handleCategorieLibeleNeedToBeGreaterThanTwoException(RuntimeException ex)
    {
        Map<String,String> response = new HashMap<>();
        response.put("Error", ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
}