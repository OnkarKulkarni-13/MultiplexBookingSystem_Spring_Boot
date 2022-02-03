package com.multiplex.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hallcapacity")
public class HallCapacity {
	
	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "seatCount")
	private int seatCount;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "seatTypeId")
	private SeatType seatType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hallId")
	private Hall hall;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	@Override
	public String toString() {
		return "HallCapacity [id=" + id + ", hall=" + hall + ", seatCount=" + seatCount + "]";
	}


}
