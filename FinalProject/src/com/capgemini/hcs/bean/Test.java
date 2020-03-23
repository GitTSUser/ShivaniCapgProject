package com.capgemini.hcs.bean;

public class Test {
	static int tstart=1;
	
	//declaring private variable
	private String testName;
	private String testId="";
	
	//Getter and Setter methods to access private variable
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	public String getTestId() {
		return testId;
	}
	
	//Constructor of Test class
	public Test(String testName) {
		
	this.testId=Integer.toString(tstart++);
	this.testName=testName;
	}
	
	

	
}

