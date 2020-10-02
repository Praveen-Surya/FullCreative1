package org.functioninterface;

public class FactorialOperation {

	public static void main(String[] args) {

		// Blocked Lambda Expression
		FactorialInterface factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++)
				result = i * result;
			return result;
		};
		System.out.println(factorial.operation(5));

	}

}
