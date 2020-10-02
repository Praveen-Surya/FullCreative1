package org.full;

public class PrivateClass {

	private static int empId;
	private String empName;
	private String empBranch = "Development";

	private void name(String empName) {
		this.empName = empName;
	}

	private static int id(int empId) {
		return empId;
	}

}
