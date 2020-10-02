package org.full.constructors;

public class DefaultConstructor {

	private String name = "Rajesh";
	private int empID = 1001;

	public static void main(String[] args) {
		DefaultConstructor empDetails = new DefaultConstructor();
		System.out.println("Employee Name " + empDetails.name);
		System.out.println("Emplopyee ID " + empDetails.empID);
	}

}
