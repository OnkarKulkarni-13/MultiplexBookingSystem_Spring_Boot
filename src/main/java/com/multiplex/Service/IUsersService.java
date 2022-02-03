package com.multiplex.Service;

import java.util.Optional;

import com.multiplex.Model.Users;

public interface IUsersService {
	public Users addUser(Users users);

	public Optional<Users> findByUserId(int userId);



}
