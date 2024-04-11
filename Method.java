package com.chainsys.day4;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eid = 5;
		java.lang.String ename;
		int eage;
		java.lang.String egender;

		working();
		System.out.println(" ");

		System.out.println("Student ID : " + eid);
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Please Enter Student Name");
		ename = sc.nextLine();
		System.out.println(" ");

		System.out.println(" ");
		System.out.println("Please Enter Student Gender");
		egender = sc.nextLine();
		System.out.println(" ");

		System.out.println("Please Enter Student Age");
		eage = sc.nextInt();

		System.out.println(" ");
		System.out.println("Entered Student Name : " + ename);
		System.out.println("Entered Student Gender : " + egender);
		System.out.println("Entered Student Age : " + eage);
	}

	public static void working() {
		System.out.println("Employee details");
	}
}
