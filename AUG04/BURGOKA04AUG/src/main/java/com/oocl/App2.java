package com.oocl;
import java.util.*;
import java.util.Scanner;

public class App2 {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in); 
		System.out.print("Please input two numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		Add addNum = new Add();
		
		System.out.println("Sum " + addNum.addFunc(a, b));
	}
}

//Multiply timesNum = new Multiply();
//addNum.addFunc(a, b);
//System.out.println("Multiply " + timesNum.mulFunc(a, b));