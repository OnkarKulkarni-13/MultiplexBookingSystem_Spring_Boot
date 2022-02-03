package com.multiplex.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.Model.Shows;

public interface ShowsDAO extends JpaRepository<Shows, Integer> {

}
