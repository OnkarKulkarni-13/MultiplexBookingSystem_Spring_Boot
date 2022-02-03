package com.multiplex.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.Model.SeatType;

public interface SeatTypeDAO extends JpaRepository<SeatType, Integer>{

}
