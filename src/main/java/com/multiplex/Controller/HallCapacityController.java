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
import com.multiplex.Model.HallCapacity;
import com.multiplex.Service.IHallCapacityService;

@RestController
public class HallCapacityController {
	@Autowired
	IHallCapacityService service;	

	@PostMapping("/HallCapacity") 
	public ResponseEntity<HallCapacity> createHallCapacity(@Validated @RequestBody HallCapacity hallCapacity) {
		System.out.println("Rest");
		HallCapacity mv = service.addHallCapacity(hallCapacity);
		return new ResponseEntity<HallCapacity>(mv, HttpStatus.OK);
	}

	@GetMapping("/HallCapacity/{hallId}")
	public ResponseEntity<List<HallCapacity>> getHallCapacityId(@PathVariable int hallId) {
		Optional<HallCapacity> hallCapacity = service.findByHallCapacityId(hallId);

		if (hallCapacity.isPresent()) {
			return new ResponseEntity(hallCapacity.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Record not found...");
		}
	}
}



