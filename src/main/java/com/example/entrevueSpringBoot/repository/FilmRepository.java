package com.example.entrevueSpringBoot.repository;

import com.example.entrevueSpringBoot.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

}
