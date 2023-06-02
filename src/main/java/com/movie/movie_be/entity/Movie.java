package com.movie.movie_be.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private long id;
    private String name;
    private String image;
    private String actor;
    private int year;
}