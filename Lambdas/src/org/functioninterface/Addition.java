package org.functioninterface;

public class Addition implements ArithmeticInterface {

	// Normal Method

	public int operation(int a, int b) {
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		Addition plusoperation = new Addition();
		System.out.println("Result= " + plusoperation.operation(5, 6));

	}
}
