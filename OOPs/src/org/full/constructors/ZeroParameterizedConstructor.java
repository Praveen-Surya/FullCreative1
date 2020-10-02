package org.full.constructors;

public class ZeroParameterizedConstructor {

	private String name;
	private int empID;
	private String bloodGroup;

	ZeroParameterizedConstructor() {
		name = "Kishore";
		empID = 5001;
		bloodGroup = "O +ve";
	}

	public static void main(String[] args) {

		ZeroParameterizedConstructor empDetails = new ZeroParameterizedConstructor();
		System.out.println("Object 1");
		System.out.println("Employee Name " + empDetails.name);
		System.out.println("Emplopyee ID " + empDetails.empID);
		System.out.println("Employee Blooo Group " + empDetails.bloodGroup);
		System.out.println();

		ZeroParameterizedConstructor empDetails1 = new ZeroParameterizedConstructor();
		System.out.println("Object 2");
		System.out.println("Employee Name " + empDetails1.name);
		System.out.println("Emplopyee ID " + empDetails1.empID);
		System.out.println("Employee Blooo Group " + empDetails1.bloodGroup);
	}

}
