package com.chainsys.day4;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String a = sc.nextLine();
		System.out.println("Enter your age");
		int b = sc.nextInt();
		name(a);
		checkAge(b);
	}

	static void name(String n) {
		System.out.println(n);
	}
	static void checkAge(int age) {
		if (age < 18) {
			System.out.println("You are not old enough to vote!");
		} else {
			System.out.println("You are old enough to vote!");
		}
	}
}
