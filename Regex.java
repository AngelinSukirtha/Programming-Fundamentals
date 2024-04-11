package com.chainsys.day5;

import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{8}", "Suki2002"));// true
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{8}", "angelinsukirtha"));// false (more than 8 char)
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{8}", "AN1GE8IN"));// true
		System.out.println(Pattern.matches("[a-z A-Z 0-9]{8}", "angel$2"));// false ($ is not matched)
		System.out.println(Pattern.matches(".a", "aa"));// true (2nd char is a)
		System.out.println(Pattern.matches(".a", "mk"));// false (2nd char is not a)
		System.out.println(Pattern.matches(".a.", "mat"));// true
		System.out.println(Pattern.matches(".a", "amms"));// false (has more than 2 char)
		System.out.println(Pattern.matches("..a", "maa"));// true (3rd char is a)
	}
}