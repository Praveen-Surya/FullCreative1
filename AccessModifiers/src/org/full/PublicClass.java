package org.full;

public class PublicClass {

	public static int empId;
	public String empName;
	public String bloodGroup;
	public String empBranch = "Development";

	public void name(String empName) {
		this.empName = empName;
	}

	public static int id(int empId) {
		PublicClass.empId = empId;
		return empId;
	}

	public PublicClass(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
