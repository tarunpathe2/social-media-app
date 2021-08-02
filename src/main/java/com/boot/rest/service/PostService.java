package com.boot.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.rest.Repository.PostRepository;
import com.boot.rest.user.Post;
import com.boot.rest.user.User;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepo;

	public List<Post> getAllPosts(long userId) {
		List<Post> posts = new ArrayList<>();
		postRepo.findByUserId(userId).forEach(posts::add);
		return posts;
	}

	public void addPost(Post post) {
		postRepo.save(post);
	}

	public Optional<Post> getPost(long postid) {
		return postRepo.findById(postid);
	}

	public void deletePost(long postid) {
		postRepo.deleteById(postid);
	}

}
