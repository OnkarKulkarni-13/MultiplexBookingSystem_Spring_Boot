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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookingId")
	private int bookingId;

	@Column(name = "bookedDate")
	@Temporal(TemporalType.DATE)
	private Date bookedDate;

	@Column(name = "showDate")
	@Temporal(TemporalType.DATE)
	private Date showDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Users users;

	@OneToOne(mappedBy = "booking")
	private BookingDetail bookingDetail;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "showId")
	private Shows shows;

	public Shows getShows() {
		return shows;
	}

	public void setShows(Shows shows) {
		this.shows = shows;
	}

	public BookingDetail getBookingDetail() {
		return bookingDetail;
	}

	public void setBookingDetail(BookingDetail bookingDetail) {
		this.bookingDetail = bookingDetail;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookedDate=" + bookedDate + ", showDate=" + showDate + "]";
	}


}
