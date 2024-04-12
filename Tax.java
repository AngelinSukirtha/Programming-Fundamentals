package com.chainsys.day3;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your gross salary: ");
		double grossSalary = scanner.nextDouble();

		System.out.print("Enter your total savings: ");
		double totalSavings = scanner.nextDouble();

		double tax = taxCalculator(grossSalary, totalSavings);

		System.out.println("Your tax is: Rs. " + tax);

		scanner.close();
	}

	public static double taxCalculator(double grossSalary, double totalSavings) {
		double taxableIncome = grossSalary - Math.min(totalSavings, 100000);

		double tax = 0;

		if (taxableIncome > 500000) {
			tax += (500000 - 200000) * 0.2; 
			taxableIncome -= 500000;
			tax += taxableIncome * 0.3; 
		} else if (taxableIncome > 200000) {
			tax += (200000 - 100000) * 0.1; 
			taxableIncome -= 200000;
			tax += taxableIncome * 0.2; 
		} else if (taxableIncome > 100000) {
			tax += (taxableIncome - 100000) * 0.1; 
		}

		return tax;
	}
}