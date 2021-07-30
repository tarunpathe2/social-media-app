package com.boot.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.rest.user.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
