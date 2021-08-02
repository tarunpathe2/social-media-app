package com.boot.rest.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Post {

	@Id
	@GeneratedValue
	private long postid;
	private String postname;
	private String details;
	private Date postCreatedDate;
	private Date postUpdatedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

	public Post(long postid, String postname, String details, Date postCreatedDate, Date postUpdatedDate, User user) {
		super();
		this.postid = postid;
		this.postname = postname;
		this.details = details;
		this.postCreatedDate = postCreatedDate;
		this.postUpdatedDate = postUpdatedDate;
		this.user = user;
	}

	public Post() {
		super();
	}

	public long getPostid() {
		return postid;
	}

	public void setPostid(long postid) {
		this.postid = postid;
	}

	public String getPostname() {
		return postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getPostCreatedDate() {
		return postCreatedDate;
	}

	public void setPostCreatedDate(Date postCreatedDate) {
		this.postCreatedDate = postCreatedDate;
	}

	public Date getPostUpdatedDate() {
		return postUpdatedDate;
	}

	public void setPostUpdatedDate(Date postUpdatedDate) {
		this.postUpdatedDate = postUpdatedDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Post [postid=" + postid + ", postname=" + postname + ", details=" + details + ", postCreatedDate="
				+ postCreatedDate + ", postUpdatedDate=" + postUpdatedDate + "]";
	}
	
	
	
	
}
