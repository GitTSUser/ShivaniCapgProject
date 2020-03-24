package com.capgemini.hcs.bean;

import java.time.LocalDateTime;

public class Appointment {
	private User user;
	private int appId;
	LocalDateTime dateTime;
	private boolean approved;
	private Test test;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public LocalDateTime getDate() {
		return dateTime;
	}

	public void setDate(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public Appointment(User user, int appId, Test test, LocalDateTime dateTime, boolean approved) {
		this.user = user;
		this.test = test;
		this.appId = appId;
		this.dateTime = dateTime;
		this.approved = approved;
	}

	public Test getTest() {
		return test;
	}

}
