package com.chainsys.day7;

import java.util.Scanner;

public class ABCBank {
	long accountNumber;
	String depositerName;
	String branch;
	String bankName;
	String mobileNumber;

	public void getUserDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Bank Name: ");
		bankName = scanner.nextLine();
		System.out.print("Enter your branch name: ");
		branch = scanner.nextLine();
		System.out.print("Enter your Name: ");
		depositerName = scanner.nextLine();
		System.out.print("Enter your mobile number: ");
		mobileNumber = scanner.nextLine();
		System.out.print("Enter your account number: ");
		accountNumber = scanner.nextLong();
	}

	public void printUserDetails() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Branch Name: " + branch);
		System.out.println("Depositer Name: " + depositerName);
		System.out.println("Mobile number: " + mobileNumber);
		System.out.println("Account number: " + accountNumber);
	}

	public void deposit(double amount, int accountNumber) {
		int balance = 500;
		balance += amount;
		System.out.println("Your balance" + balance);
	}

	public void deposit(double amount, int accountNumber, String depositerName) {
		int balance = 500;
		balance += amount;
		System.out.println("Your balance amount : " + balance + " deposited by " + depositerName);
	}
	
}
