package com.oocl.burgoka.sw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class thirdTestCase {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String [] n = {"1", "2", "5", "26"};
		
		int ct = 0;
		int inner = 2; int outer = 2;
		int result = 0;
		
		for(int i =0; i<outer; i++) {
			for(int j = 0; j<inner; j++) {
			result = (result * result) + 1;
			String res = String.valueOf(result);
			assertEquals(res, n[i]);
			//System.out.println(result);
			}
		}

	}
}

