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
import com.multiplex.Model.Shows;
import com.multiplex.Service.IShowsService;

@RestController
public class ShowsController {

	@Autowired
	IShowsService service;

	@PostMapping("/Shows")
	public ResponseEntity<Shows> createShows(@Validated @RequestBody Shows shows) {
		System.out.println("Rest");
		Shows mv = service.addShows(shows);
		return new ResponseEntity<Shows>(mv, HttpStatus.OK);
	}

	@GetMapping("/Shows/{id}")
	public ResponseEntity<List<Shows>> getShowsId(@PathVariable int showId) {
		Optional<Shows> shows = service.findByShowsId(showId);

		if (shows.isPresent()) {
			return new ResponseEntity(shows.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Record not found...");
		}
	}



}
