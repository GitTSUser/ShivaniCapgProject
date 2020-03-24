package com.capgemini.hcs.service.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTestCases {
	ServiceTesting hsService;

	@Before
	public void setUp() {
		hsService = new ServiceTesting();
		// object creation of class which includes the methods of testing
	}

	// Test Cases
	@Test // testcase1
	public void centerNameTest() { // checking the name and the initial letter of the name (capital letter)
		Assert.assertEquals(true, hsService.validCenterName("Kmc"));
	}

	@Test // testcase2
	public void checkIdExist() {
		Assert.assertEquals(true, hsService.checkId("2"));
	}

	@After
	public void cleanUp() {
		hsService = null;
	}
}
