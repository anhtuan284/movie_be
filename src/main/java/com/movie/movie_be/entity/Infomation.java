package com.movie.movie_be.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Infomation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String avtURL;

    @OneToMany(mappedBy = "director")
    @JsonIgnore
    List<Movie> movies_director;

    @ManyToMany(mappedBy = "actors")
    @JsonIgnore
    List<Movie> movies_actor;
}
