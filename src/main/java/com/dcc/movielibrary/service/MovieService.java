package com.dcc.movielibrary.service;
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
}
