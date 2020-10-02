package org.exceptionswithmethodoverriding;

import java.io.IOException;

public class DerivedClass extends BaseClass {

	// Derived Class throws exception when exception is same as base class exception

	@Override
	void color() throws ArithmeticException {

		int result = 10 / 0;
		System.out.println(result);

	}

	// Derived Class doesn't throws exception when exception is broader than base
	// class exception

	@Override
	void message() throws IOException {

		System.out.println("Base Class");

	}

	// Derived Class throws exception when exception is narrower than base class
	// exception

	@Override
	void print() throws ArithmeticException {

		int result = 10 / 0;
		System.out.println(result);

	}

	public static void main(String[] args) {

		BaseClass obj = new DerivedClass();

		try {
			obj.color();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Handled");
		}

		try {
			obj.print();
		} catch (Exception e) {
			System.out.println("ArithmeticException Handled");
		}

	}

}
