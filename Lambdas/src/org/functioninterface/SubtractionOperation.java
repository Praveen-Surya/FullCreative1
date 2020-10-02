package org.functioninterface;

public class SubtractionOperation {

	public static void main(String[] args) {

		// Using Lambda Expression
		ArithmeticInterface subtractionOperation = (a, b) -> a - b;
		System.out.println(subtractionOperation.operation(30, 20));

	}

}
