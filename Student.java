package com.chainsys.day2;

import java.util.Scanner;

public class Student {

public static void main(String[] args) {
// TODO Auto-generated method stub
String name;
char initial;
final int rollno=4;
int fee;
String phoneno;
String emergencyno;
boolean haspresent;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
name = sc.nextLine();
System.out.println("Enter your initial");
initial = sc.next().charAt(0);
System.out.println("Enter your fee");
fee = sc.nextInt();
System.out.println("Fee "+fee);
System.out.println("Enter your phoneno");
phoneno = sc.next();
System.out.println("Enter your emergencyno");
emergencyno = sc.next();
System.out.println("----------------------");
System.out.println("Name: "+name);
System.out.println("Initial: "+initial);
System.out.println("Rollno: "+rollno);
System.out.println("Phoneno: "+phoneno);
System.out.println("Emergencyno: "+emergencyno);
	}

}
