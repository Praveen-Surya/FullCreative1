package org.full.constructors;

//Constructor Chaining Using this()

public class Employee {

	private String name;
	private int empID;
	private String bloodGroup;

	Employee(int empID) {
		this.empID = empID;
	}

	Employee(int empID, String name) {
		this(empID);
		this.name = name;
	}

	Employee(int empID, String name, String bloodGroup) {
		this(empID, name);
		this.bloodGroup = bloodGroup;
	}

	public static void main(String[] args) {
		System.out.println("Constructor Chaining Using this()");
		Employee empDetails = new Employee(5001, "Ram", "B +ve");
		System.out.println("Employee Name " + empDetails.name);
		System.out.println("Emplopyee ID " + empDetails.empID);
		System.out.println("Employee Blood Group " + empDetails.bloodGroup);
	}

}
