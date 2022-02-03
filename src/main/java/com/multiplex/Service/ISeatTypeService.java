package com.multiplex.Service;

import java.util.Optional;

import com.multiplex.Model.SeatType;

public interface ISeatTypeService {
	public SeatType addSeatType(SeatType seatType);

	public Optional<SeatType> findBySeatTypeId(int seatTypeId);




}
