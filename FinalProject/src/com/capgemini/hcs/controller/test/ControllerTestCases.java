package com.capgemini.hcs.controller.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ControllerTestCases {
	ControllerTesting hsController;
	
	@Before
	public void setUp() {
		hsController =new ControllerTesting();
		 //object creation of class which includes the methods of testing
	}
	//testcases
	@Test //testcase1
	public void testcheckChoice() {
		Assert.assertEquals(true,hsController.validChoice(1));
	}
	
	@Test //testcase2
	public void testcheckSubChoice() {
		Assert.assertEquals(true,hsController.validSubChoice(3));
	}
	
	@After
	public void cleanUp() {
		hsController = null;
	}
	
}
