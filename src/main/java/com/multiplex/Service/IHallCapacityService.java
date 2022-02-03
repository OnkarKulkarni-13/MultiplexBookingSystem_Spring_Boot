package com.multiplex.Service;

import java.util.Optional;

import com.multiplex.Model.HallCapacity;

public interface IHallCapacityService {
	public HallCapacity addHallCapacity(HallCapacity hallCapacity);

	public Optional<HallCapacity> findByHallCapacityId(int hallId);
	


}
