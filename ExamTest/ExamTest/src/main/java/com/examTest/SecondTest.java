package com.examTest;
import java.util.Scanner;

public class SecondTest {
	public static void main(String args[]) {
		int n;
		int F_0=1, F_1=1;
		int F_n=0;
		System.out.println("Enter the number: ");
		Scanner scan= new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i=1; i<n; i++) {
			F_n = F_0 + F_1;
			F_0=F_1;
			F_1 = F_n;
		}
		System.out.println(F_n);
		
	}
}
