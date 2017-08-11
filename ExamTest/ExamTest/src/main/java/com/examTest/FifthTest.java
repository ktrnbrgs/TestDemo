package com.examTest;

public class FifthTest {
	public static void main(String args[]) {
		int integer_value = 60;
		boolean done = false;
		int count = 1;
		int current = integer_value + 2;
		while(!done) {
			current = current / count;
			if(current%3==0) {
				done = true;
			}
			else if(current<1) {
				done = true;
			}
			else {
				count += 1;
			}
			System.out.println(current);
		}
		System.out.println(count);
	}
}
