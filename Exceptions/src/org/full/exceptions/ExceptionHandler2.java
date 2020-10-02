package org.full.exceptions;

//Unchecked Exceptions using throws keyword

public class ExceptionHandler2 {

	private int number1 = 10, number2 = 0, result;

	public static void divide(ExceptionHandler2 obj) throws NullPointerException, ArithmeticException {

		int result = obj.number1 / obj.number2;

	}

	public static void main(String[] args) {
		
		try {
			divide(null); // NullPointer Exception
		} catch (NullPointerException exception) {
			System.out.println("NullPointerException Handled");
		} finally {
			System.out.println("Finally Block");
		}

		try {
			divide(new ExceptionHandler2()); // Arithmetic Exception
		} catch (ArithmeticException exception) {
			System.out.println("ArithmeticException Handled");
		} finally {
			System.out.println("Finally Block");
		}

	}

}
