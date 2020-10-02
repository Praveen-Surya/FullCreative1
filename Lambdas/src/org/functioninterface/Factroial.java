package org.functioninterface;

public class Factroial {

	// Anonymous Inner Class
	public static void main(String[] args) {
		FactorialInterface factorial = new FactorialInterface() {

			public int operation(int n) {

				int result = 1;
				for (int i = 1; i <= n; i++)
					result = i * result;
				return result;
			}
		};
		System.out.println("Factorial of 5 is " + factorial.operation(5));
	}

}
