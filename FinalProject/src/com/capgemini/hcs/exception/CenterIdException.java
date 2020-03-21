package com.capgemini.hcs.exception;

public class CenterIdException extends Exception { 
	//if the Center Id does not matches the Center Id present in the list it throws exception.
	public CenterIdException() {
		System.out.println("Center Id is not legal");
		}
}