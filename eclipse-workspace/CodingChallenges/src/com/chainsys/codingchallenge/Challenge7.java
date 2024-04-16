package com.chainsys.codingchallenge;

import java.util.Scanner;

public class Challenge7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			series(a, b, n);
		}
		in.close();
	}

	public static void series(int a, int b, int n) {
		int result = a;
		for (int i = 0; i < n; i++) {
			result += Math.pow(2, i) * b;
			System.out.print(result + " ");
		}
		System.out.println();
	}

}
