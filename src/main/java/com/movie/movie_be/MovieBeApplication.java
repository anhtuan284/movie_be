package com.movie.movie_be;

import java.util.List;

import com.movie.movie_be.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MovieBeApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(MovieBeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM Movie";
		List<MovieDTO> movies = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(MovieDTO.class));
		movies.forEach(System.out::println);
		System.out.println("Hello");
	}
}
