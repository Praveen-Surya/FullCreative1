package org.full1;

// can able to access protected class members using import statement and inheritance
import org.full.ProtectedClass;

public class CheckProtectedClass extends ProtectedClass {

	// can able to access protected constructor using constructor chaining
	public CheckProtectedClass(String bloodGroup) {
		super(bloodGroup);
	}

	public static void main(String[] args) {

		// able to access protected constructor with different package
		CheckProtectedClass empDetails = new CheckProtectedClass("B +ve");
		System.out.println(empDetails.bloodGroup);

		// able to access protected instance method with different package
		empDetails.name("Ram");
		System.out.println(empDetails.empName);

		// able to access protected static method with different package
		ProtectedClass.id(1001);
		System.out.println(ProtectedClass.empId);

		// able to access protected variable with different package
		System.out.println(empDetails.empBranch);
	}

}
