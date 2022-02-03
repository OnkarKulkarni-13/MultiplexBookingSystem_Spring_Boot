package com.multiplex.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiplex.Exception.RecordNotFoundException;
import com.multiplex.Model.Movies;
import com.multiplex.Service.IMoviesService;

@RestController
public class MoviesController {

	@Autowired
	IMoviesService service;

	@PostMapping("/Movie")
	public ResponseEntity<Movies> createMovie(@Validated @RequestBody Movies movies) {
		System.out.println("Rest");
		Movies mv = service.addMovie(movies);
		return new ResponseEntity<Movies>(mv, HttpStatus.OK);
	}

	@GetMapping("/Movie/{id}")
	public ResponseEntity<List<Movies>> getMovieId(@PathVariable int movieId) {
		Optional<Movies> movies = service.findByMovieId(movieId);

		if (movies.isPresent()) {
			return new ResponseEntity(movies.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Record not found...");
		}
	}



}
