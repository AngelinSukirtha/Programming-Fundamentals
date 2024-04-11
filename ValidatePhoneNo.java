package com.chainsys.day5;

import java.util.Scanner;
import java.util.regex.*;

public class ValidatePhoneNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number");
		String phone = sc.next();
		String regex = "^\\d{4}\\d{3}\\d{3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phone);
		boolean valid = matcher.matches();
		if (valid) {
			System.out.println("Phone number is valid");
		} else {
			System.out.println("Phone number is invalid");
		}
	}
}

