package com.boot.rest.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.rest.user.Post;
import com.boot.rest.user.User;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	public List<Post> findByUserId(long userId);

}
