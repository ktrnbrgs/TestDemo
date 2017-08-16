package com.oocl.burgoka.sw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class fourthTestCase {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String [] hell = {"Hello", "Hello", "Hello", "Hello"};
		int x = 3;
		int y = 10;
		while(x<y) {
			for (int i =0 ; i<=3;i++)
			{
				assertEquals("Hello", hell[i]);
					//System.out.println("Hello");
					//x = x+1;
					//y= y-1;
			}
		}
	}

}
