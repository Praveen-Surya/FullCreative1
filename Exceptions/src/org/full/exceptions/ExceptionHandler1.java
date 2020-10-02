package org.full.exceptions;

// Unchecked Exceptions using try and catch

public class ExceptionHandler1 {

	private int number1, number2, result;

	public void divide(int number1, int number2) {
		try {
			result = number1 / number2;
		} catch (ArithmeticException exception) {
			System.out.println("ArithmeticException Handled");
		} finally {
			System.out.println("Finally Block");
		}
	}

	public static void main(String[] args) {

		ExceptionHandler1 obj1 = null;
		try {
			obj1.divide(12, 6); // NullPointer Exception
		} catch (NullPointerException exception) {
			System.out.println("NullPointerException Handled");
		} finally {
			System.out.println("Finally Block");
		}
		ExceptionHandler1 obj2 = new ExceptionHandler1();
		obj2.divide(10, 0); // Arithmetic Exception

	}

}
