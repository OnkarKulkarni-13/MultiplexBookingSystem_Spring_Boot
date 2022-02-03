package com.multiplex.Model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shows")
public class Shows  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "showId", length = 200, unique = true)
	private int showId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "movieId")
	private Movies movies;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hallId")
	private Hall hall;

	@OneToOne(mappedBy = "shows")
	private Booking booking;

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Column(name = "slotNo", length = 200)
	private int slotNo;

	@Column(name = "fromDate", length = 200)
	private Date fromDate;

	@Column(name = "toDate", length = 200)
	private Date toDate;

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "Shows [showId=" + showId + ", movies=" + movies + ", hall=" + hall + ", slotNo=" + slotNo
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}

	
	

}
