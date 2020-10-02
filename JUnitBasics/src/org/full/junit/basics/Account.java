package org.full.junit.basics;

public class Account {

	String name = "JAVA";
	String nickName = "Program";
	String name1 = "JAVA";
	String name2;

	public int deposit(int amount) {
		int currentBalance, balance = 1000;
		currentBalance = balance + amount;
		return currentBalance;

	}

}
