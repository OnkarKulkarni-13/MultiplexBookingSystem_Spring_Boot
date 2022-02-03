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
import com.multiplex.Model.Hall;
import com.multiplex.Service.IHallService;

@RestController
public class HallController {
	@Autowired
	IHallService service;

	@PostMapping("/Hall")
	public ResponseEntity<Hall> createHall(@Validated @RequestBody Hall hall) {
		System.out.println("Rest");
		Hall mv = service.addHall(hall);
		return new ResponseEntity<Hall>(mv, HttpStatus.OK);
	}

	@GetMapping("/Hall/{id}")
	public ResponseEntity<List<Hall>> getHallId(@PathVariable int hallId) {
		Optional<Hall> hall = service.findByHallId(hallId);

		if (hall.isPresent()) {
			return new ResponseEntity(hall.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Record not found...");
		}
	}


}
