package com.example.entrevueSpringBoot.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String titre;
    private String description;
    @OneToMany(mappedBy = "film")
    private List<Acteur> acteurs;

}
