package com.multiplex.Model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seattype")
public class SeatType  {
	
	@Id
	@Column(name = "seatTypeId")
	private int seatTypeId;
	@Column(name = "seatTypeDesc")
	private String seatTypeDesc;
	@Column(name = "seatFare")
	private float seatFare;

	public int getSeatTypeId() {
		return seatTypeId;
	}

	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}

	public String getSeatTypeDesc() {
		return seatTypeDesc;
	}

	public void setSeatTypeDesc(String seatTypeDesc) {
		this.seatTypeDesc = seatTypeDesc;
	}

	public float getSeatFare() {
		return seatFare;
	}

	public void setSeatFare(float seatFare) {
		this.seatFare = seatFare;
	}

	@Override
	public String toString() {
		return "SeatType [seatTypeId=" + seatTypeId + ", seatTypeDesc=" + seatTypeDesc + ", seatFare=" + seatFare + "]";
	}



}
