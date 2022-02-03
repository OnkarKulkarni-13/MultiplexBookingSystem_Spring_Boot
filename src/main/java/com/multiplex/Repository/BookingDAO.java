package com.multiplex.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.Model.Booking;

public interface BookingDAO extends JpaRepository<Booking, Integer>{

}
