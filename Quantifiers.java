package com.chainsys.day5;

import java.util.regex.*;

public class Quantifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quantifiers");
		// ? Quantifier occurs once or not at all
		System.out.println(Pattern.matches("[ang]?", "a"));// true (a or n or g comes one time)
		System.out.println(Pattern.matches("[ang]?", "aaa"));// false (a comes more than one time)
		System.out.println(Pattern.matches("[ang]?", "aanng"));// false (a,n and g comes more than one time)
		System.out.println(Pattern.matches("[ang]?", "aazzta"));// false (a comes more than one time)
		System.out.println(Pattern.matches("[ang]?", "an"));// false (a or n or g must come one time)

		// + Quantifier occurs once or more times
		System.out.println(Pattern.matches("[ang]+", "a"));// true (a or n or g once or more times)
		System.out.println(Pattern.matches("[ang]+", "aaa"));// true (a comes more than one time)
		System.out.println(Pattern.matches("[ang]+", "aanngg"));// true (a or n or g comes more than once)
		System.out.println(Pattern.matches("[ang]+", "aazzta"));// false (z and t are not matching pattern)
		// *Quantifiers occurs zero or more times
		System.out.println(Pattern.matches("[ang]*", "annga"));// true (a or n or g may come zero or more times)

	}

}
