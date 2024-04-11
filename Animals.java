package com.chainsys.day2;

import java.util.Scanner;

public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int legs=5;
		int claws=2;
		boolean hastail;
		int sense;
		char group;
		char habitat='c';
		String name;
        System.out.println("legs:"+ legs);
        System.out.println("claws:"+ claws);
        System.out.println("habitat:"+ habitat);
        Scanner sc = new Scanner(System.in);
        {
        System.out.println("Please enter the sense");
        sense = sc.nextInt();
        System.out.println("sense"+sense);
      
        System.out.println("Please enter the name");
        name = sc.next();
        System.out.println(name + " Nice name!!");
	}
	}
	

}
