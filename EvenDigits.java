package com.chainsys.day3;

import java.util.Scanner;

public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		if (num > 0) {
			for (i = 1; i <= num; i++)
				if (i % 2 == 0) {
					System.out.println(i);
				}
		} else
			System.out.println("INVALID DATA");// validation
	}
}
