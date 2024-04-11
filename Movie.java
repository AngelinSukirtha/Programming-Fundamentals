package com.chainsys.day2;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String moviename;
String heroname;
String heroinename;
int leadroles=5;
int totaltickets;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Moviename");
moviename=sc.nextLine();
System.out.println("Enter the hero name");
heroname=sc.nextLine();
System.out.println("Enter the heroine name");
heroinename=sc.nextLine();
System.out.println("Enter the total number of tickets available");
totaltickets=sc.nextInt();
System.out.println("Movie Name: "+moviename);
System.out.println("Hero Name: "+heroname);
System.out.println("Heroine name: "+heroinename);
System.out.println("Leadroles: "+leadroles);
System.out.println("Totaltickets: "+totaltickets);
	}

}
