package com.chainsys.day5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email{
    public static void main(String[] args) {
     
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Email ID: ");
		String emailId = sc.nextLine();
		String regex = "^(?=.*[0-9])[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);
		boolean valid = matcher.matches();
		if (valid) {
			System.out.print("Enter your password: ");
			String password = sc.next();
			String regex1 = "^\\d\\D\\S\\w\\W$";
			Pattern pattern1 = Pattern.compile(regex1);
			Matcher matcher1 = pattern1.matcher(password);
			boolean valid1 = matcher1.matches();
			if (valid1)
				System.out.println("WELCOME");
			else
				System.out.println("INVALID PASSWORD,Password must have alphabets,digits and special characters");
		} else {
			System.out.print("INVALID EMAIL ID,Email ID should satisfy lower case,number and special character-@");
		}	
    }
}


