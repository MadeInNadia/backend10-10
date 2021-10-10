package com.nadia.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nadia.users.entity.models.Users;
import com.nadia.users.entity.services.UsersService;

@RestController
public class UsersController {

	
	
	
	@Autowired
	UsersService usersService;
	
	@GetMapping("/users")
	public List<Users> getAllUsers(){
		return usersService.getAll();
	}
	
	@GetMapping("/users/{id}")
	public Users getOne(@PathVariable(value = "id") long id) {
		return usersService.get(id);
	}
	
	@PostMapping("/users")
	public void add(Users users) {
		usersService.post(users);
	}
	
	@PutMapping("/users/{id}")
	public void update(Users users, @PathVariable(value = "id") long id) {
		usersService.put(users, id);
	}
	
	@DeleteMapping("/users/{id}")
	public void update(@PathVariable(value = "id") long id) {
		usersService.delete(id);
	}
}
