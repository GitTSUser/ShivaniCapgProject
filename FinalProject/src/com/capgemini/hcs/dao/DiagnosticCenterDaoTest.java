package com.capgemini.hcs.dao;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiagnosticCenterDaoTest {
	DiagnosticCenterDaoImpl centerDao;

	@Before
	public void setUp() throws Exception {
		centerDao=new DiagnosticCenterDaoImpl();
	}

	@Test
	public void testAddCenter() {
		boolean result=centerDao.addCenter("Abc");
		assertEquals(true, result);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testRemoveCenter() {
		boolean result=centerDao.removeCenter("3");
		assertEquals(true,result);
		//fail("Not yet implemented");
	}
	
	@After
	public void tearDown() throws Exception {
		centerDao=null;
	}

}
