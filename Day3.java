package com.chainsys.day3;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2, y = 5, z = 0;
		if (x >= 0 && y >= 0 && z >= 0) {
			System.out.println("Logical operators");
			System.out.println(x == 2);
			System.out.println(x != 5);
			System.out.println(x != 5 && y >= 5);
			System.out.println(z != 0 || x == 2);
			System.out.println(!(y < 10));
		} else
			System.out.println("INVALID DATA");// validation
	}
}