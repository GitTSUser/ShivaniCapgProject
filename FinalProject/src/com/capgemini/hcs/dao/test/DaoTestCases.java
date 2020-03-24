package com.capgemini.hcs.dao.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.hcs.dao.test.DaoTesting;

public class DaoTestCases {

	DaoTesting hsDao;
	// Test Cases

	@Before
	public void setUp() {
		hsDao = new DaoTesting();
		// object creation of class which includes the methods of testing
	}

	@Test // testcase1
	public void testcenterNameTest() { // checking the name and the initial letter of the name (capital letter)
		Assert.assertEquals(true, hsDao.validCenterName("Kmc"));
	}

	@Test // testcase2
	public void testcenterNameSize() {// checking the size of the center name, checks if the size is not zero
		Assert.assertEquals(true, hsDao.validSize("kmc"));
	}

	@Test // testcase3
	public void testcheckCenterName() {// checking the name of the center does not starts with number
		Assert.assertEquals(false, hsDao.checkName("3Amc"));
	}

	@Test // testcase4
	public void testcheckIdExist() {
		Assert.assertEquals(true, hsDao.checkId("2"));
	}

	@Test // testcase5
	public void testcheckCharId() {
		Assert.assertEquals(false, hsDao.checkId("ch"));
	}

	@Test // testcase6
	public void testcheckNegativeId() {
		Assert.assertEquals(false, hsDao.checkId("-4"));
	}

	@After
	public void cleanUp() {
		hsDao = null;
	}

}