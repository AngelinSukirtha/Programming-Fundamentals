package com.chainsys.day3;

import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		char sex;
		char maritalStatus;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		age = sc.nextInt();
		if (age > 0) {

			System.out.println("enter your gender(F/M)");
			sex = sc.next().charAt(0);
			System.out.println("enter your marital status(Y/N)");
			maritalStatus = sc.next().charAt(0);
			if (sex == 'F')
				System.out.println("Work only in urban areas");
			else if (sex == 'M' && (age >= 20 && age <= 40))
				System.out.println("Work in anywhere");
			else if (sex == 'M' && (age >= 40 && age <= 60))
				System.out.println("Work in urban areas only");
			else if (age > 60 || (age < 20 && age >= 0))
				System.out.println("ERROR");
		} else
			System.out.println("INVALID INPUT");// validation
	}
}
