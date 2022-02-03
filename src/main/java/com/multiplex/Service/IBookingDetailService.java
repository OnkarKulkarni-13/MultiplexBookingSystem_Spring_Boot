package com.multiplex.Service;

import java.util.Optional;

import com.multiplex.Model.BookingDetail;

public interface IBookingDetailService {
	public BookingDetail addBookingDetail(BookingDetail bookingDetail);

	public Optional<BookingDetail> findByBookingDetailId(int bookingDetailId);


}
