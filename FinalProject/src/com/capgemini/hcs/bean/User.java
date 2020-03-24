package com.capgemini.hcs.bean;

public class User {
	private String username;

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public User(String username) {
		this.username = username;

	}

}
