package com.multiplex.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.Model.BookingDetail;

public interface BookingDetailDAO extends JpaRepository<BookingDetail, Integer>{

}
