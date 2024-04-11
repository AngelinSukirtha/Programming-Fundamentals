package com.chainsys.day3;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years = 6;
		int bonus = 5;
		int salary = 10000;
		if (years >= 5) {
			salary = salary + ((salary * 5) / 100);
			System.out.println(salary);
		} else {
			System.out.println("INVALID DATA");// Validation
		}
	}

}
