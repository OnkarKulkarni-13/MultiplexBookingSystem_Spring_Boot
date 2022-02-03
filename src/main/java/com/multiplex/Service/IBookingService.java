package com.multiplex.Service;

import java.util.Optional;

import com.multiplex.Model.Booking;

public interface IBookingService {
	public Booking addBooking(Booking booking);

	public Optional<Booking> findByBookingId(int bookingId);



}
