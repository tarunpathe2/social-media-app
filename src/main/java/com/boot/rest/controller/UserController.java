package com.boot.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.rest.service.UserService;
import com.boot.rest.user.User;




@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/profile/users")
	public List<User> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	@GetMapping("/profile/users/{id}")
	public Optional<User> getUser(@PathVariable long id)
	{
		return service.getUser(id);
	}
	
	@PostMapping("/profile/users")
	public void addUser(@RequestBody User user)
	{
		service.addUser(user);
	}
	
	@DeleteMapping("/profile/users/{id}")
	public void deleteUser(@PathVariable long id)
	{
		 service.deleteUser(id);
	}

}
