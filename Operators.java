package com.chainsys.day2;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int b ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
a= sc.nextInt();
System.out.println("Enter the second number:");
b= sc.nextInt();
System.out.println("Arithmetic operator");
System.out.println("a+b="+ (a+b));
System.out.println("a-b="+ (a-b));
System.out.println("a*b="+ (a*b));
System.out.println("a/b="+ (a/b));
System.out.println("a%b="+ (a%b));
System.out.println("-------------------");
System.out.println("Assignment operator");
int c=a;
System.out.println("c using =: " + c);
c += a;
System.out.println("c using +=: " + c);
c *= a;
System.out.println("c using *=: " + c);
System.out.println("-------------------");
System.out.println("Relational and Logical operator");
if(c==b && c>b)
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}

	}

}

