package com.dcc.movielibrary.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dcc.movielibrary.data.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	//JpaRepository contains all basic CRUD functionality
}
