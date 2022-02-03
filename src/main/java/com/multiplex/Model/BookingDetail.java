package com.multiplex.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookingdetail")
public class BookingDetail {
	

	@Id
	@Column(name = "noOfSeats")
	private int noOfSeats;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingId")
	private Booking booking;

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "BookingDetail [noOfSeats=" + noOfSeats + "]";
	}



}
