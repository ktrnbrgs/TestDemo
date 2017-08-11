package com.examTest;

public class FirstTest {
	public static void main(String args[]) {
		int i = 1;
		for (int j=0 ; j<5; j=j+2) {
			i = (i*i) + j;
		}
		
		switch(i) {
		case 3: System.out.println("zero");
				break;
		case 13: System.out.println("one");
		case 175: System.out.println("two");
		default: System.out.println("default");
		}
	}
}
