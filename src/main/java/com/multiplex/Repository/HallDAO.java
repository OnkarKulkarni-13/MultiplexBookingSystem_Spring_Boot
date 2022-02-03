package com.multiplex.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.Model.Hall;

public interface HallDAO extends JpaRepository<Hall, Integer> {

}
