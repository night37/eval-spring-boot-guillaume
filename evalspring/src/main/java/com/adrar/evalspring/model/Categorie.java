package com.adrar.evalspring.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="categorie")
@Data
public class Categorie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @NotEmpty
    @Length(min = 2, message = "Le libele doit contenir au minimum deux caractères.")
    private String libele;

}
