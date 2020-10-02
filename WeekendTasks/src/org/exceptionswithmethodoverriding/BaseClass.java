package org.exceptionswithmethodoverriding;

import java.io.IOException;

//Base Class declares exception

public class BaseClass {

	void color() throws ArithmeticException {

		System.out.println("Green");

	}

	void message() throws ArithmeticException {

		System.out.println("Base Class");

	}

	void print() throws IOException {

		System.out.println("Base Class");

	}

}
