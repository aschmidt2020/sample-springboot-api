package com.dcc.movielibrary.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dcc.movielibrary.data.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	//JpaRepository contains all basic CRUD functionality - findAll(), findById(), deleteById(), .save()
	
	//custom functions
	public List<Movie> findAllByName(String name);
	public List<Movie> findAllByGenre(String genre);
}
