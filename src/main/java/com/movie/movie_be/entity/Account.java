package com.movie.movie_be.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    private long id;
    private String username;
    private String password;
    private String fullName;

}
