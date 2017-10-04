package com.poonam;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CursorLearningTest {
Calculator c;
	
	@Before
	public void setUp() {
	     c = new Calculator();
		System.out.println("Called first");
	}

	@Test(expected = Exception.class)
	public void test() throws Exception {
	assertEquals(5, c.divide(3, 0));
	
	}

	@After
	public void breakDown() {
	System.out.println("Called last");
	}

}
