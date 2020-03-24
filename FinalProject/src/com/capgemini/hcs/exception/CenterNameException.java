package com.capgemini.hcs.exception;

public class CenterNameException extends Exception {
	// if the center name is blank, then it throws the exception.
	public CenterNameException(String centerName) {
		if (centerName.length() == 0) {
			System.out.println("Center Name Shouldn't be Blank.");
		}
	}
}