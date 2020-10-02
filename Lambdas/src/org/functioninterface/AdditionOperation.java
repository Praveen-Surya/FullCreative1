package org.functioninterface;

public class AdditionOperation {

	public static void main(String[] args) {

		// Using Lambda Expression
		ArithmeticInterface additionOperation = (a, b) -> a + b;
		System.out.println(additionOperation.operation(10, 20));

	}

}
