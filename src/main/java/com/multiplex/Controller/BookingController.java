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
import com.multiplex.Model.Booking;
import com.multiplex.Service.IBookingService;

@RestController
public class BookingController {
	@Autowired
	IBookingService service;

	@PostMapping("/Booking")
	public ResponseEntity<Booking> createBooking(@Validated @RequestBody Booking booking) {
		System.out.println("Rest");
		Booking mv = service.addBooking(booking);
		return new ResponseEntity<Booking>(mv, HttpStatus.OK);
	}

	@GetMapping("/Booking/{bookingId}")
	public ResponseEntity<List<Booking>> getBookingId(@PathVariable int bookingId) {
		Optional<Booking> booking = service.findByBookingId(bookingId);

		if (booking.isPresent()) {
			return new ResponseEntity(booking.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Record not found...");
		}
	}


}
