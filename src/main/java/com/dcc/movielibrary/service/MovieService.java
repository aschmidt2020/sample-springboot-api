package com.dcc.movielibrary.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dcc.movielibrary.data.Movie;
import com.dcc.movielibrary.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	};
	
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	};

	public Movie getMovieById(Integer id) {
		return movieRepository.findById(id).orElse(null);
	};
	
	public Movie updateMovie(Integer id, Movie movie) {
		Movie selectedMovie = movieRepository.findById(id).orElse(null);
		if(selectedMovie != null) {			
			selectedMovie.setName(movie.getName());
			selectedMovie.setGenre(movie.getGenre());
			selectedMovie.setDirector(movie.getDirector());
			return movieRepository.save(selectedMovie);
		}
		else {
			return null;
		}
	};
	
	public Movie deleteMovie(Integer id) {
		Movie selectedMovie = movieRepository.findById(id).orElse(null);
		if(selectedMovie != null) {
			movieRepository.deleteById(id);
			//cannot return void result from .deleteById() so returned movie that was deleted
			return selectedMovie;
		}
		else {
			return null;
		}
	};
	
	public List<Movie> findAllByName (String name) {
		return movieRepository.findAllByName(name);
	};
	
	public List<Movie> findAllByGenre (String genre) {
		return movieRepository.findAllByGenre(genre);
	};
	
	
	
	
}
