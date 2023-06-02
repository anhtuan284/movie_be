package com.movie.movie_be.controller;

import java.util.ArrayList;
import java.util.List;

import com.movie.movie_be.entity.Movie;
import com.movie.movie_be.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = {"http://localhost:5173/"}) //chỉ cho phép các Request từ domain này
public class MovieController {
    @Autowired
    MovieService moviesService;

    @GetMapping("/movie") // annotation, zô dường dan nay -> tra ve json
    public ResponseEntity getMovies() {
        List<Movie> movies = moviesService.getMovies();
        return ResponseEntity.ok(movies);
    }

    @PostMapping("movie")
    public ResponseEntity postMovie(@RequestBody Movie movie) {
        Movie newMovie = moviesService.postMovie(movie);
        return ResponseEntity.ok(newMovie);
    }
    @GetMapping("/movie/{movieId}")
    public ResponseEntity getMovies(@PathVariable long movieId) {
        Movie movie = moviesService.getMovieById(movieId);
        return ResponseEntity.ok(movie);
    }
}