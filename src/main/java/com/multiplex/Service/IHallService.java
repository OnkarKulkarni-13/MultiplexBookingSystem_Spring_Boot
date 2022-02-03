package com.multiplex.Service;

import java.util.Optional;

import com.multiplex.Model.Hall;

public interface IHallService {
	public Hall addHall(Hall hall);

	public Optional<Hall> findByHallId(int hallId);

}



