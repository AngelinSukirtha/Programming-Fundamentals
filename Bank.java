package com.chainsys.day2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accountno;
		String bankname;
		String branchname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		accountno = sc.nextInt();
		System.out.println("Enter the Bank name");
		bankname= sc.nextLine();
		System.out.println("Enter your branchname");
		branchname = sc.next();
		System.out.println("Accountno: "+ accountno);
		System.out.println("Bank Name: "+ bankname);
		System.out.println("Branch: "+ branchname);
		
	}

}
