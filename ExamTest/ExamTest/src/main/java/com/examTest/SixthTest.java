package com.examTest;

public class SixthTest {
	public static void main(String args[]) {
		double count;
		int limit;
		count = 9.0;
		limit = 43/4;
		
		for(;count<=limit;count = count = count + 0.5)
		{
			System.out.println("in for:" + count) ;
		}
		System.out.println("after for" + count );
	}
}
