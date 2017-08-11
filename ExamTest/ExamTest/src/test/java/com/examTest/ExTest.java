package com.examTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ExTest {

	@Test
	public void test() {
		
		//fail("Not yet implemented");
		//String[] n = {"1", "2", "5", "26"};
		//String[] as = {"*", "*", "*", "*", "*"};
		//String [] hell = {"Hello", "Hello", "Hello", "Hello"};
		//for(int i =0 ; i < 4; i++) {
		//assertEquals(as[i], eightTest(as[i]));
		//assertEquals(n[i], thirdTest());
		
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("one");
		str1.add("two");
		str1.add("default");
		
		StringBuffer text = new StringBuffer();
		for (String str1_1 : str1) {
			text.append(str1_1).append('\n');
		}
		
		ArrayList<String> str2 = new ArrayList<String>();
		//str2.add();
		
		assertEquals(text.toString(), firstTest());
	}
	
	
	private String firstTest() {
		int i = 1;
		
		ArrayList<String> str = new ArrayList<String>();
		
		for (int j=0 ; j<5; j=j+2) {
			i = (i*i) + j;
		}
		
		switch(i) {
		case 3: str.add("zero");
				break;
		case 13: str.add("one");
		case 175: str.add("two");
		default: str.add("default");
		}
		
		StringBuffer text = new StringBuffer();
		for (String str1 : str) {
			text.append(str1).append('\n');
		}
		
		return text.toString();
	}
	
	private String thirdTest() {
		int ct = 0;
		int inner = 2; int outer = 2;
		int result = 0;
		String resu = "";
		
		for(int i =0; i<outer; i++) {
			for(int j = 0; j<inner; j++) {
			result = (result * result) + 1;
			resu = String.valueOf(result);
			}
		}
		return resu;
	}
	
	private void eightTest(String [] str) {
		int value = 5;
		int value2 = 1;
		while(value2 <4) {
			for(;value >= value2; value--) {	
			}
			value2++;
		}
	
	}
	
	private void fourthTest() {
		int x = 3;
		int y = 10;
		while(x<y) {
			for (int i =0 ; i<=3;i++)
			{
				
			}
		}
	}
}
