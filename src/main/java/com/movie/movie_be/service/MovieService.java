package com.movie.movie_be.service;

import com.movie.movie_be.entity.Movie;
import com.movie.movie_be.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
    public Movie getMovieById(long id) {
        Movie mv = movieRepository.findMovieById(id);
        return mv;
    }
    public Movie postMovie(Movie movie) {
        Movie newMovie = movieRepository.save(movie);
        return newMovie;
    }
}
