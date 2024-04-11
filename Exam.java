package com.chainsys.day3;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int classHeld;
		int classAttended;
		char medicalIssue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of classes held:");
		classHeld = sc.nextInt();
		if (classHeld > 0) {
			System.out.println("Enter the number of classes attended:");
			classAttended = sc.nextInt();
			System.out.println("Do you have medical issues(Y/N)");
			medicalIssue = sc.next().charAt(0);
			int p = (classAttended * 100) / classHeld;
			System.out.println("Percentage is:" + p);
			if (p >= 75 || medicalIssue == 'Y')
				System.out.println("Student is allowed to sit");
			else if (p >= 75 || medicalIssue == 'N')
				System.out.println("Student is allowed to sit");
			else
				System.out.println("Student is not allowed to sit");
		} else
			System.out.println("INVALID DATA");// validation
	}
}
