package com.capgemini.hcs.exception;

public class CenterListException  extends Exception {
	//Exception is thrown when the center list is empty and no element means nothing can be removed.
	public CenterListException() {
		System.out.println("Center List Is Empty Please Add Center First!");
		
}
}