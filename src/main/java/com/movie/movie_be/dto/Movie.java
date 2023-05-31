package com.movie.movie_be.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String name;
    private String image;
    private String actor;
}