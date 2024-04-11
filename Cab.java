package com.chainsys.day;

import java.util.Scanner;

public class Cab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		String userName = sc.next();

		System.out.println("Enter your distance in kilometer");
		double kiloMeter = sc.nextDouble();

		System.out.println("Enter your cab type (micro, mini, prime) ");
		String cabType = sc.next();

		if (cabType.equalsIgnoreCase("micro")) {
			System.out.println(" Calculated cab fare: " + CabFare.micro(kiloMeter));
		} else if (cabType.equalsIgnoreCase("mini")) {
			System.out.println(" Calculated cab fare: " + CabFare.mini(kiloMeter));
		} else if (cabType.equalsIgnoreCase("prime")) {
			System.out.println(" Calculated cab fare: " + CabFare.prime(kiloMeter));
		} else {
			System.out.println("Please enter the cab type");
		}
		System.out.println("   Thank You   ");
	}

}
