package com.chainsys.day5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginCredantials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your username: ");
		System.out.println("(Username must have upper case,lower case,and digits)");
		String username = sc.nextLine();
		String regex = "^[a-z A-Z 0-9]{6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(username);
		boolean valid = matcher.matches();
		if (valid) {
			System.out.print("Enter your password: ");
			System.out.println("(Password must have alphabets,digits and special characters)");
			String password = sc.next();
			String regex1 = "^\\d\\D\\S\\w\\W$";
			Pattern pattern1 = Pattern.compile(regex1);
			Matcher matcher1 = pattern1.matcher(password);
			boolean valid1 = matcher1.matches();
			if (valid1)
				System.out.println("WELCOME");
			else
				System.out.println(password+"INVALID PASSWORD");
		} else {
			System.out.print(username+"INVALID USERNAME");
		}
	}
}
