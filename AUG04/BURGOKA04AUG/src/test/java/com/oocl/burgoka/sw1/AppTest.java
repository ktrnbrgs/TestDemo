package com.oocl.burgoka.sw1;

import static org.junit.Assert.*;

//import org.junit.Assert;
import org.junit.Test;

public class AppTest {
	
	@Test
	public void test() {
		// fail("Not yet implemented");
		int x = 3;
		int y = 4;

		int resultAdd = x + y;
//		int resultMul = (x*y);
		assertTrue(resultAdd == 7);
		assertFalse(resultAdd != 7);
		
//		assertTrue(resultAdd == 12);
//		assertFalse(resultMul != 12);
		
		// Add tester = new Add();
		// Assert.assertNotNull(a);
	}

}
