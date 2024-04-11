package com.chainsys.day3;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j, row = 6;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		num = sc.nextInt();
		if (num > 0) {
			for (int i = num; i < row; i++) {
				System.out.println("");
				for (j = 1; j <= i; j++) {
					System.out.print("*");
				}
			}
		} else
			System.out.println("INVALID DATA");//validation
	}
}
