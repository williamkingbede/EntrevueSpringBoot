package com.example.entrevueSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Acteur {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "film_id", referencedColumnName = "id")
    @JsonIgnore
    private Film film;
}
