package org.full;

public class ProtectedClass {

	protected static int empId;
	protected String empName;
	protected String bloodGroup;
	protected String empBranch = "Development";

	protected void name(String empName) {
		this.empName = empName;
	}

	protected static int id(int empId) {
		ProtectedClass.empId = empId;
		return empId;
	}

	protected ProtectedClass(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
