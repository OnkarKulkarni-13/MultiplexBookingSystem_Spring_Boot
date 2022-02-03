package com.multiplex.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.Model.Movies;

public interface MoviesDAO extends JpaRepository<Movies, Integer> {

}
