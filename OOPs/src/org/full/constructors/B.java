package org.full.constructors;

//Constructor Chaining Using super()

public class B extends A {

	String bloodGroup;

	B(String name, int empID, String bloodGroup) {

		super(name, empID);
		this.bloodGroup = bloodGroup;

	}

	public static void main(String[] args) {
		System.out.println("Constructor Chaining Using super()");
		B empDetails = new B("Arun", 5001, "B +ve");
		System.out.println(empDetails.name);
		System.out.println(empDetails.empID);
		System.out.println(empDetails.bloodGroup);

	}
}
