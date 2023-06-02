package com.movie.movie_be.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MovieDTO {
    private long id;
    private String name;
    private String image;
    private String actor;
    private int year;
}