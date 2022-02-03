package com.multiplex.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.Model.Users;
import com.multiplex.Repository.UsersDAO;

@Service
public class UsersService implements IUsersService {
	@Autowired
	UsersDAO dao;

	public Users addUser(Users users) {
		Users mv = dao.save(users);
		return mv;

	}

	@Override
	public Optional<Users> findByUserId(int userId) {
		// TODO Auto-generated method stub
		return dao.findById(userId);
	}


}
