package com.multiplex.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.Model.SeatType;
import com.multiplex.Repository.SeatTypeDAO;

@Service
public class SeatTypeService implements ISeatTypeService{
	@Autowired
	SeatTypeDAO dao;

	public SeatType addSeatType(SeatType seatType) {
		SeatType mv = dao.save(seatType);
		return mv;

	}

	@Override
	public Optional<SeatType> findBySeatTypeId(int seatTypeId) {
		// TODO Auto-generated method stub
		return dao.findById(seatTypeId);
	}


}
