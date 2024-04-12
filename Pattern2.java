package com.chainsys.day3;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;

		for (int i = rows; i >= 1; i--) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
