package com.oocl.burgoka.sw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class eightTestCase {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String [] as = {"*", "*", "*", "*", "*"};
		int value = 5;
		int value2 = 1;
		while(value2 <4) {
			for(;value >= value2; value--) {
				assertEquals("*", as[value]);
				//System.out.println("*");
			}
			value2++;
		}
	}

}
