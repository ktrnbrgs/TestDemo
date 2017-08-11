package com.examTest;

public class NinethTest {
	static boolean a,b,c;
	public static void main(String args[]) {
		a=true;
		b=false;
		c=false;
		System.out.println(a + "," + b + "," + c);
		do 
		{
			if(b==c) {
				b = a;
			}
			else if(a==c) {
				b=c;
			}
			else {
				a=c;
			}
			System.out.println(a + "," + b + "," + c);
		} while (a || b || c);
	}
}
