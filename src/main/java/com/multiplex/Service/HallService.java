package com.multiplex.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.Model.Hall;
import com.multiplex.Repository.HallDAO;

@Service
public class HallService implements IHallService{
	@Autowired
	HallDAO dao;

	public Hall addHall(Hall hall) {
		Hall mv = dao.save(hall);
		return mv;

	}

	@Override
	public Optional<Hall> findByHallId(int hallId) {
		// TODO Auto-generated method stub
		return dao.findById(hallId);
	}


}
