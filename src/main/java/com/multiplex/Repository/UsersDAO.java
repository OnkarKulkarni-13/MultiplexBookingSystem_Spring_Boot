package com.multiplex.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.Model.Users;

public interface UsersDAO extends JpaRepository<Users, Integer> {

}
