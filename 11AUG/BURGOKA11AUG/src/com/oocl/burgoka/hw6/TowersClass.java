package com.oocl.burgoka.hw6;

public class TowersClass {

	public void arrange(int n, String first, String second, String third) {
		// TODO Auto-generated method stub
		if (n == 1) {
	           System.out.println("Disk 1 from " + first + " -> " + third);
	       } else {
	           arrange(n - 1, first, third, second);
	           System.out.println("Disk " + n +" from " + first + " -> " + third);
	           arrange(n - 1, second, first, third);
	       }
	}

}
