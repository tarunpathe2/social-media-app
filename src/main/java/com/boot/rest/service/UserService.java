package com.boot.rest.service;

import com.boot.rest.user.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.boot.rest.Repository.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers() {
		List<User> users=new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}
	
	public void addUser(User user) {
		userRepo.save(user);
	}
	
	public Optional<User> getUser(long id)
	{
		return userRepo.findById(id);	
	}
	
	
	public void deleteUser(long id)
	{
		userRepo.deleteById(id);
	}
	
}
