package com.chainsys.day7;

public class TestABCBank {

	public static void main(String[] args) {
		ABCBank abcbank = new ABCBank();
		abcbank.getUserDetails();
		abcbank.printUserDetails();
		abcbank.deposit(4000,5432675,"Angelin");
	}
}
