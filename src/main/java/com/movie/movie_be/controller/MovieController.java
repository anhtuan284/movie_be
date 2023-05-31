package com.movie.movie_be.controller;

import com.movie.movie_be.dto.Movie;
import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = {"http://localhost:5173/"}) //chỉ cho phép các Request từ domain này
public class MovieController {
    //method
    //set
    @GetMapping("/movie") // annotation, zô dường dan nay -> tra ve json
    public ResponseEntity getMovie() {
        ArrayList movies = new ArrayList();
        Movie mv1 = new Movie("phimhay", "anh1", "Hoa");
        Movie mv2 = new Movie("cone", "anh2", "Da");
        Movie mv3 = new Movie("naoei", "anh3", "Tuan");
        movies.add(mv1);
        movies.add(mv2);
        movies.add(mv3);

        return ResponseEntity.ok(movies);
    }

}
