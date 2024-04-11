package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		char initial;
		final int appointmentno=4;
		final int doctorfee=500;
		int medicalfee=1000;
		String phoneno;
		String bloodgroup;
		String diseasename;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter your initial");
		initial = sc.next().charAt(0);
		System.out.println("Enter your phone number");
		phoneno = sc.next();
		System.out.println("Enter your blood group");
		bloodgroup = sc.next();
		System.out.println("Enter your Disease Name");
		diseasename = sc.next();
		System.out.println("----------------------");
		System.out.println("Name: "+name);
		System.out.println("Initial: "+initial);
		System.out.println("appointmentno: "+appointmentno);
		System.out.println("Doctorfee: "+doctorfee);
		System.out.println("Medicalfee: "+medicalfee);
		System.out.println("Phoneno: "+phoneno);
		System.out.println("Bloodgroup: "+bloodgroup);
		System.out.println("Diseasename: "+diseasename);
	}

}
