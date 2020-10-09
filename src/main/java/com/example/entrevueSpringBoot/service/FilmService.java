package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.model.Acteur;
import com.example.entrevueSpringBoot.repository.ActeurRepository;
import lombok.AllArgsConstructor;
import com.example.entrevueSpringBoot.model.Film;
import org.springframework.stereotype.Service;
import com.example.entrevueSpringBoot.repository.FilmRepository;

@Service
@AllArgsConstructor
public class FilmService {

    private FilmRepository filmRepository;
    private ActeurRepository acteurRepository;

    public Film getFilmById(long filmId){
        return filmRepository.findById(filmId).orElseThrow(() -> new IllegalStateException("Film with id '" + filmId + "' not found!"));
    }

    public Film createFilm(Film film) {
        Film savedFilm = filmRepository.save(film);
        for(Acteur acteur : savedFilm.getActeurs()){
            acteur.setFilm(film);
            acteurRepository.save(acteur);
        }
        return savedFilm;
    }
}
