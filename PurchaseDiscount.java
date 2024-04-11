package com.chainsys.day3;

import java.util.Scanner;

public class PurchaseDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1, p2, p3, p4, totalQuantity;
		double cost;
		double discount;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 4 product quantities");
		p1 = sc.nextInt();
		p2 = sc.nextInt();
		p3 = sc.nextInt();
		p4 = sc.nextInt();
		totalQuantity = p1 + p2 + p3 + p4;
		System.out.println("total quantity" + totalQuantity);
		cost = totalQuantity * 100;
		discount = (10 * cost) / 100;
		System.out.println("The cost:" + cost);
		if (cost > 0) {
			if (cost > 1000)
				System.out.println("eligible for discount");
			else
				System.out.println("not eligible for discount");
		} else
			System.out.println("INVALID DATA");// validation
	}

}
