package com.movie.movie_be.repository;

import com.movie.movie_be.entity.Infomation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Infomation, Long> {
}
