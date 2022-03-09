package com.dcc.movielibrary.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dcc.movielibrary.data.Movie;
import com.dcc.movielibrary.service.MovieService;

//flow request --> controller --> service --> repository --> data

@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	};
	
	@GetMapping("/movies")
	public List<Movie> findAllMovies() {
		return movieService.getAllMovies();
	}
	
	@GetMapping("/movie/{id}")
	public Movie findMovie(@PathVariable Integer id) {
		return movieService.getMovieById(id);
	};
	
	@PutMapping("/updateMovie/{id}")
	public Movie updateMovie(@PathVariable Integer id, @RequestBody Movie movie) {
		return movieService.updateMovie(id, movie);
	};
	
	@DeleteMapping("/deleteMovie/{id}")
	public Movie deleteMovie(@PathVariable Integer id) {
		return movieService.deleteMovie(id);
	};
	
}
