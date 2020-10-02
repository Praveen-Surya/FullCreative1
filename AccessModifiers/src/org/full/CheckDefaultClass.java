package org.full;

public class CheckDefaultClass {

	public static void main(String[] args) {

		// able to access default constructor within same package
		DefaultClass empDetails = new DefaultClass("B+ve");
		System.out.println(empDetails.bloodGroup);

		// able to access default instance method within same package
		empDetails.name("Rajesh");
		System.out.println(empDetails.empName);

		// able to access default static method within same package
		DefaultClass.id(1001);
		System.out.println(DefaultClass.empId);

		// able to access default variable within same package
		System.out.println(empDetails.empBranch);
	}

}
