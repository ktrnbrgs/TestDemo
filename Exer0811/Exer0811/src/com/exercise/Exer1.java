package com.exercise;

public class Exer1 {

	public Exer1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = new int[2];
		try {
			System.out.println("Access Element: " + a[3]);
		}
		catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		finally {
			System.out.println("Done...");
		}

	}

}
