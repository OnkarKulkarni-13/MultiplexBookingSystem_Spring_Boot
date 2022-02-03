package com.multiplex.Service;

import java.util.Optional;

import com.multiplex.Model.Shows;

public interface IShowsService {
	public Shows addShows(Shows shows);

	public Optional<Shows> findByShowsId(int showId);




}
