package com.chainsys.day3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		num = sc.nextInt();
		if (num > 0) {
			for (i = 1; i <= 10; i++)
				System.out.println(num + " * " + i + " = " + num * i);
		} else
			System.out.println("INVALID DATA");// validation
	}
}
