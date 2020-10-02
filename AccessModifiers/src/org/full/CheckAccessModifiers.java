package org.full;

public class CheckAccessModifiers {

	public static void main(String[] args) {

		AccessModifiers empDetails = new AccessModifiers("O -ve");

		// can able to access default instance variable with same package
		System.out.println(empDetails.empName);

		// can able to access protected instance variable with same package
		System.out.println(empDetails.bloodGroup);

		// can't able to access private instance variable with same package
		System.out.println(empDetails.empNickName);

		// can able to access public static variable with same package
		System.out.println(AccessModifiers.empId);
	}

}
