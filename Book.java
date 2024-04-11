package com.chainsys.day2;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String bookname;
String authorname;
String favline;
final int amount=2000;
int pageno=86;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the book name");
bookname=sc.nextLine();
System.out.println("Enter the author name");
authorname=sc.nextLine();
System.out.println("Enter your fav line");
favline=sc.nextLine();
System.out.println("Book Name: "+bookname);
System.out.println("Author Name: "+authorname);
System.out.println("Fav line: "+favline);
System.out.println("Amount: "+amount);
System.out.println("Pageno: "+pageno);
	}

}
