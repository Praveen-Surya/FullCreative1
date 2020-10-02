package org.full;

class DefaultClass {

	static int empId;
	String empName;
	String bloodGroup;
	String empBranch = "Development";

	void name(String empName) {
		this.empName = empName;
	}

	static int id(int empId) {
		DefaultClass.empId = empId;
		return empId;
	}

	DefaultClass(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
