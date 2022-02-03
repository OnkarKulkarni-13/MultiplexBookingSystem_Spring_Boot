package com.multiplex.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hall")
public class Hall {
	
	@Id
	@Column(name = "hallId")
	private int hallId;
	@Column(name = "hallDesc")
	private String hallDesc;
	@Column(name = "totalCapacity")
	private int totalCapacity;

	@OneToOne(mappedBy = "hall")
	private HallCapacity hallCapacity;

	@OneToMany(mappedBy = "hall")
	private List<Shows> shows;

	public int getHallId() {
		return hallId;
	}

	public void setHallId(int hallId) {
		this.hallId = hallId;
	}

	public String getHallDesc() {
		return hallDesc;
	}

	public void setHallDesc(String hallDesc) {
		this.hallDesc = hallDesc;
	}

	public int getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public HallCapacity getHallCapacity() {
		return hallCapacity;
	}

	public void setHallCapacity(HallCapacity hallCapacity) {
		this.hallCapacity = hallCapacity;
	}

	public List<Shows> getShows() {
		return shows;
	}

	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}

	@Override
	public String toString() {
		return "Hall [hallId=" + hallId + ", hallDesc=" + hallDesc + ", totalCapacity=" + totalCapacity
				+ ", hallCapacity=" + hallCapacity + ", shows=" + shows + "]";
	}



}
