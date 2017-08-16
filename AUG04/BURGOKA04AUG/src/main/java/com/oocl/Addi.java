package com.oocl;

public class Addi {
	public int method(int x, int y) {
		return y == 0 ? x : addRec(++x, --y);
	}

	private int addRec(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
