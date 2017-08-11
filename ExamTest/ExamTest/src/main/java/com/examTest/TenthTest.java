package com.examTest;

import java.util.Scanner;

public class TenthTest {
	public static void main (String args[]) {
		int one, two, three;
		
		Scanner in = new Scanner(System.in);
		one = in.nextInt();
		two = in.nextInt();
		three = in.nextInt();
		
		do
		{
			one++;
			System.out.print("cart");
		} while (one < 3);
		
		for (int i = 0; i< two; i++) {
			System.out.print("o");
		}
		
		while(true)
		{
			three++;
			if(three==5) {
				break;
			}
			System.out.print("n");
			
		}
	}
}
