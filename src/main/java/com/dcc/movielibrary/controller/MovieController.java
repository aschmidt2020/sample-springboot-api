package com.dcc.movielibrary.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dcc.movielibrary.data.Movie;
import com.dcc.movielibrary.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	};
}
