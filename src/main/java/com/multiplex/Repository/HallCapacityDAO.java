package com.multiplex.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.Model.HallCapacity;

public interface HallCapacityDAO extends JpaRepository<HallCapacity, Integer>  {

}
