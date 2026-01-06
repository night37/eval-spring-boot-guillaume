package com.adrar.evalspring.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
    @NotEmpty
    @Length(min = 2, message = "Le nom doit contenir au minimum deux caractères.")
    private String nom;

    @Column(nullable = false)
    @NotNull
    @Positive(message = "Le prix doit être au dessus de zéro.")
    private float prix;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

}
