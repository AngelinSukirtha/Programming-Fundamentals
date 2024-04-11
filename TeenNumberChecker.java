package com.chainsys.day5;

import java.util.Scanner;

public class TeenNumberChecker {

	static boolean a,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Teen Number Checker
		We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
		Write a method named hasTeen with 3 parameters of type int.
		The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
		Write another method named isTeen with 1 parameter of type int.
		The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
		  
		 */
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        
        if(age>13 && age<19) {
            System.out.println("Teen");
        }else {
            System.out.println("Not Teen");
        }
        
        hasTeen(12,10,23);
        System.out.println(a);
        
        isTeen(13);
        System.out.println(b);
    }

    private static boolean isTeen(int l) {
		if(l>=13 && l<=19) {
            boolean b=true;
            return b;
        }
        return b;
    }

    private static boolean hasTeen(int i, int j, int k) {
        if((i>=13 && i<=19) ||(j>=13 && j<=19)||(k>=13 && k<=19)) {
            boolean a=true;
            return a;
        }
        return a;
    }

}
