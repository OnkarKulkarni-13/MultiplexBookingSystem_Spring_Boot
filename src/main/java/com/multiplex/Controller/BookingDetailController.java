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
import com.multiplex.Model.BookingDetail;
import com.multiplex.Service.IBookingDetailService;

@RestController
public class BookingDetailController {
	@Autowired
	IBookingDetailService service;

	@PostMapping("/BookingDetail")
	public ResponseEntity<BookingDetail> createBookingDetail(@Validated @RequestBody BookingDetail bookingDetail) {
		System.out.println("Rest");
		BookingDetail mv = service.addBookingDetail(bookingDetail);
		return new ResponseEntity<BookingDetail>(mv, HttpStatus.OK);
	}

	@GetMapping("/BookingDetail/{id}")
	public ResponseEntity<List<BookingDetail>> getBookingDetailId(@PathVariable int bookingDetailId) {
		Optional<BookingDetail> bookingDetail = service.findByBookingDetailId(bookingDetailId);

		if (bookingDetail.isPresent()) {
			return new ResponseEntity(bookingDetail.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Record not found...");
		}
	}



}
