package com.movie.movie_be.repository;

import com.movie.movie_be.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findMovieById(long id); // auto generate function when declaring
}
