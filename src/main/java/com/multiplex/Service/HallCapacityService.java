package com.multiplex.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.Model.HallCapacity;
import com.multiplex.Repository.HallCapacityDAO;

@Service
public class HallCapacityService implements IHallCapacityService {
	@Autowired
	HallCapacityDAO dao;

	public HallCapacity addHallCapacity(HallCapacity hallCapacity) {
		HallCapacity mv = dao.save(hallCapacity);
		return mv;
		
	}

	@Override
	public Optional<HallCapacity> findByHallCapacityId(int hallId) {
		// TODO Auto-generated method stub
		return dao.findById(hallId);
	}


}
