package com.chainsys.day3;

import java.util.Scanner;

public class Raining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char r;
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Is it Raining(Y/N)");
		r = sc.next().charAt(0);
		System.out.println("enter the temperature");
		t = sc.nextInt();
		if (t >= 0 && t <= 60) {
			if (r == 'Y')
				System.out.println("Bring umbrella");
			if (t < 32)
				System.out.println("Bring heavy jacket");
			else if (t >= 32 && t <= 50)
				System.out.println("Bring light jacket");
			else
				System.out.println("No need for jacket");
		} else
			System.out.println("INVALID DATA");// validation
	}
}
