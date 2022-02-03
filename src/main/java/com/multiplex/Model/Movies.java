package com.multiplex.Model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movies{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movieId")
	private int movieId;

	@Column(name = "movieName", length = 200)
	private String movieName;

	@OneToMany(mappedBy = "movies")
	private List<Shows> shows;

	public List<Shows> getShows() {
		return shows;
	}

	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", shows=" + shows + "]";
	}


}
