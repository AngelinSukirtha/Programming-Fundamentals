package com.chainsys.day3;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		int sum = 0;
		if (n > 0) {
			while (n > 0) {
				int last = n % 10;
				sum = sum + last;
				n = n / 10;
			}
			System.out.println(sum);
		} else
			System.out.println("INVALID INPUT");// validation
	}
}
