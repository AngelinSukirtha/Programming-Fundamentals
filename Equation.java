package com.chainsys.day3;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        for (int y = 5; y <= 10; y++) {
	                    double result = solveEquation(y);
	                    System.out.println("For y = " + y + ", the result is: " + result);
	                }
	            }
	            public static double solveEquation(int y) {
	                double result = 2 * Math.pow(y, 2) + y + 5;
	                return result;
	}
}
