package com.multiplex.Service;

import java.util.Optional;

import com.multiplex.Model.Movies;

public interface IMoviesService {
	public Movies addMovie(Movies movies);

	public Optional<Movies> findByMovieId(int movieId);



}
