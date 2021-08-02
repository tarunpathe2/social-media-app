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

import com.boot.rest.service.PostService;
import com.boot.rest.service.UserService;
import com.boot.rest.user.Post;
import com.boot.rest.user.User;

@RestController
public class PostController {
	
	@Autowired
	private PostService service;
	
	@GetMapping("/users/{id}/posts")
	public List<Post> getAllPosts(long userId)
	{
		return service.getAllPosts(userId);
	}
	
	@GetMapping("/users/{id}/posts/{postid}")
	public Optional<Post> getUser(@PathVariable long postid)
	{
		return service.getPost(postid);
	}
	
	@PostMapping("/users/{id}/posts")
	public void addPosts(@RequestBody Post post)
	{
		service.addPost(post);
	}
	
	@DeleteMapping("/users/{id}/posts/{postid}")
	public void deleteUser(@PathVariable long postid)
	{
		 service.deletePost(postid);
	}


}
