package com.boot.rest.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private long id;
	private String email;
	private String name;
	private Date DOB;
	private String address;
	
	@OneToMany(mappedBy = "user")
	private List<Post> posts;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public User(long id, String email, String name, Date dOB, String address) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		DOB = dOB;
		this.address = address;
		
	}
	protected User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", DOB=" + DOB + ", address=" + address + "]";
	}
	
	

}
