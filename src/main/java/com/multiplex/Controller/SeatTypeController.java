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
import com.multiplex.Model.SeatType;
import com.multiplex.Service.ISeatTypeService;

@RestController
public class SeatTypeController {
	@Autowired
	ISeatTypeService service;

	@PostMapping("/SeatType")
	public ResponseEntity<SeatType> createSeatType(@Validated @RequestBody SeatType seatType) {
		System.out.println("Rest");
		SeatType mv = service.addSeatType(seatType);
		return new ResponseEntity<SeatType>(mv, HttpStatus.OK);
	}

	@GetMapping("/SeatType/{id}")
	public ResponseEntity<List<SeatType>> getSeatTypeId(@PathVariable int seatTypeId) {
		Optional<SeatType> seatType = service.findBySeatTypeId(seatTypeId);

		if (seatType.isPresent()) {
			return new ResponseEntity(seatType.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Record not found...");
		}
	}


}
