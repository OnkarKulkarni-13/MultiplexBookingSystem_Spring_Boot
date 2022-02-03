package com.multiplex.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiplex.Exception.RecordNotFoundException;
import com.multiplex.Model.Users;
import com.multiplex.Service.IUsersService;

@RestController
public class UsersController {
	@Autowired
	IUsersService service;

	@PostMapping("/Users")
	public ResponseEntity<Users> createUser(@Validated @RequestBody Users users) {
		System.out.println("Rest");
		Users mv = service.addUser(users);
		return new ResponseEntity<Users>(mv, HttpStatus.OK);
	}

	@GetMapping("/Users/{id}")
	public ResponseEntity<List<Users>> getUserId(@PathVariable int userId) {
		Optional<Users> users = service.findByUserId(userId);

		if (users.isPresent()) {
			return new ResponseEntity(users.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Record not found...");
		}
	}



}
