package com.movie.movie_be.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.swing.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String image;
    private int year;

    @ManyToOne
    @JoinColumn(name = "Director_ID")
    Infomation director;

    @ManyToMany()
    List<Infomation> actors;
}