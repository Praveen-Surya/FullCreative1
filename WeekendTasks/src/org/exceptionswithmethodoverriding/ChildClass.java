package org.exceptionswithmethodoverriding;

import java.io.IOException;

public class ChildClass extends ParentClass {

	// Child Class throws unchecked exception when parent class doesn't declare
	// exception

	@Override
	void message() throws ArithmeticException {

		int result = 10 / 0;
		System.out.println(result);

	}

	// child class cannot throws checked exception when parent class doesn't declare
	// exception

	@Override
	void color() throws IOException {

		System.out.println("Green");

	}

	public static void main(String[] args) {

		ParentClass obj = new ChildClass();
		try {
			obj.message();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Handled");
		}
		obj.color();

	}

}
