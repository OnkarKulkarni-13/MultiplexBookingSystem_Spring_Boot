package com.multiplex.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.Model.Shows;
import com.multiplex.Repository.ShowsDAO;

@Service
public class ShowsService  implements IShowsService{
	@Autowired
	ShowsDAO dao;

	public Shows addShows(Shows shows) {
		Shows mv = dao.save(shows);
		return mv;

	}

	@Override
	public Optional<Shows> findByShowsId(int showId) {
		// TODO Auto-generated method stub
		return dao.findById(showId);
	}


}
