package com.multiplex.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.Model.BookingDetail;
import com.multiplex.Repository.BookingDetailDAO;

@Service
public class BookingDetailService implements IBookingDetailService{
	@Autowired
	BookingDetailDAO dao;

	public BookingDetail addBookingDetail(BookingDetail bookingDetail) {
		BookingDetail mv = dao.save(bookingDetail);
		return mv;

	}

	@Override
	public Optional<BookingDetail> findByBookingDetailId(int bookingDetailId) {
		return dao.findById(bookingDetailId);
	}



}
