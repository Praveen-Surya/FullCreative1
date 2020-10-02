package org.full1;

// able to access public class members with import statement
import org.full.PublicClass;

public class CheckPublicClass {

	public static void main(String[] args) {

		// able to access public constructor within same package
		PublicClass empDetails = new PublicClass("B+ve");
		System.out.println(empDetails.bloodGroup);

		// able to access public instance method within same package
		empDetails.name("Ram");
		System.out.println(empDetails.empName);

		// able to access public static method within same package
		PublicClass.id(1001);
		System.out.println(PublicClass.empId);

		// able to access public variable within same package
		System.out.println(empDetails.empBranch);
	}

}
