package org.full.constructors;

public class ParameterizedConstructor {

	private String name;
	private int empID;
	private String bloodGroup;

	ParameterizedConstructor(String name, int empID, String bloodGroup) {
		this.name = name;
		this.empID = empID;
		this.bloodGroup = bloodGroup;
	}

	ParameterizedConstructor(int empID, String name, String bloodGroup) {
		this.empID = empID;
		this.name = name;
		this.bloodGroup = bloodGroup;
	}

	ParameterizedConstructor(String name, String bloodGroup, int empID) {
		this.empID = empID;
		this.name = name;
		this.bloodGroup = bloodGroup;
	}

	public static void main(String[] args) {

		ParameterizedConstructor empDetails = new ParameterizedConstructor("Vinoth", 1001, "O -ve");
		System.out.println("Object 1");
		System.out.println("Employee Name " + empDetails.name);
		System.out.println("Emplopyee ID " + empDetails.empID);
		System.out.println("Employee Blooo Group " + empDetails.bloodGroup);
		System.out.println();

		ParameterizedConstructor empDetails1 = new ParameterizedConstructor(1002, "Santhosh", "B +ve");
		System.out.println("Object 2");
		System.out.println("Employee Name " + empDetails1.name);
		System.out.println("Emplopyee ID " + empDetails1.empID);
		System.out.println("Employee Blooo Group " + empDetails1.bloodGroup);
		System.out.println();

		ParameterizedConstructor empDetails2 = new ParameterizedConstructor("Ranjith", "O +ve", 1003);
		System.out.println("Object 2");
		System.out.println("Employee Name " + empDetails2.name);
		System.out.println("Emplopyee ID " + empDetails2.empID);
		System.out.println("Employee Blooo Group " + empDetails2.bloodGroup);

	}

}
