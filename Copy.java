package com.chainsys.day4;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] Str1 = { 'A', 'n', 'g', 'e', 'l', 'i', 'n' };
		String Str2 =" ";
		Str2 = Str2.copyValueOf(Str1);
		System.out.println(Str2.copyValueOf(Str1));
		System.out.println("Str2 is: " + Str2);
	}
}
