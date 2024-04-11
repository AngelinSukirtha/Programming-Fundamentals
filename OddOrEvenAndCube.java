package com.chainsys.day3;

import java.util.Scanner;

public class OddOrEvenAndCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0)
				System.out.println(num + " is even");
			else
				System.out.println(num + " is odd");
			System.out.println("Cube of that num is:" + num * num * num);
		} else
			System.out.println("INVALID INPUT");// validation
	}
}