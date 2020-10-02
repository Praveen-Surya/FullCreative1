package org.full;

public class CheckPrivateClass {

	public static void main(String[] args) {

		PrivateClass empDetails = new PrivateClass();

		// can't able to access private instance method
		empDetails.name("Rajesh");

		// can't able to access private static method
		PrivateClass.id(1001);

		// can't able to access private variable
		System.out.println(empDetails.empBranch);
	}
}
