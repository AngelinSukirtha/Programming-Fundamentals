package com.chainsys.day5;

import java.util.regex.*;

public class Metacharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \d- Number
		// \D- Non-Digit

		System.out.println(Pattern.matches("\\d", "abc"));// false (non-digit)
		System.out.println(Pattern.matches("\\d", "1")); // true(digit and comes once)
		System.out.println(Pattern.matches("\\d", "4443"));// false(digit but comes more than once)
		System.out.println(Pattern.matches("\\d", "323abc"));// false(digit and char)

		System.out.println(Pattern.matches("\\D", "abc"));// false(non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D", "1"));// false(digit)
		System.out.println(Pattern.matches("\\D", "4443"));// false(digit)
		System.out.println(Pattern.matches("\\D", "323abc"));// false(digit and char)
		System.out.println(Pattern.matches("\\D", "m"));// true (non-digit and comes once)

		// \s- Any whitespace
		// \S- Non whitespace Character
		// \w- Any word character like numbers/ characters
		// \W- Special symbols
		System.out.println(Pattern.matches("\\d\\D\\s\\S\\w\\W", "5G 4G!")); // true
		System.out.println(Pattern.matches("\\d\\D\\s\\S\\w\\W", "Angelin")); // false
	}
}