package com.multiplex.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.Model.Booking;
import com.multiplex.Repository.BookingDAO;

@Service
public class BookingService implements IBookingService{
	@Autowired
	BookingDAO dao;

	public Booking addBooking(Booking booking) {
		Booking mv = dao.save(booking);
		return mv;

	}

	@Override
	public Optional<Booking> findByBookingId(int bookingId) {
		return dao.findById(bookingId);
	}



}
