package com.adrar.evalspring.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="produit")
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @Length(min = 2, message = "Le nom doit contenir entre 2 et 50 caractères.")
    @NotEmpty
    private String nom;

    @Column(nullable = false)
    @NotEmpty
    @Positive(message = "Le prix doit être au dessus de zéro.")
    private float prix;

}
