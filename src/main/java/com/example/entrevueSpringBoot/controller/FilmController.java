package com.example.entrevueSpringBoot.controller;

import lombok.AllArgsConstructor;
import com.example.entrevueSpringBoot.model.Film;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.entrevueSpringBoot.service.FilmService;

@RestController
@RequestMapping("/api/film")
@AllArgsConstructor
public class FilmController {

    private FilmService filmService;

    @GetMapping(path = "/{filmId}")
    public Film findFilmById(@PathVariable long filmId){
        return filmService.getFilmById(filmId);
    }

    @PostMapping
    public ResponseEntity<Film> createPost(@RequestBody Film film) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(filmService.createFilm(film));
    }


}
