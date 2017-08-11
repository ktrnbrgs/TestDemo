package com.examTest;

public class ThirdTest {
	public static void main(String args[]) {
		int inner = 2, outer = 2;
		int result=0;
		
		for(int i=0; i<outer;i++) {
			for (int j=0; j<inner; j++)
			{
				result = (result*result) + 1;
				System.out.println(result);
			}
		}
	}
}
