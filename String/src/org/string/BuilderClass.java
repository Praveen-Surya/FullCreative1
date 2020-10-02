package org.string;

public class BuilderClass {

	public static void main(String[] args) {

		StringBuilder mobileName = new StringBuilder("Samsung");

		// duplicate can be created with different memory address
		StringBuilder mobileName1 = new StringBuilder("Samsung");

		System.out.println(mobileName.hashCode());
		System.out.println(mobileName1.hashCode());

		// can be changed the content of the object in the same memory address==>mutable
		System.out.println(mobileName.append(" Company"));
		System.out.println(mobileName1.hashCode());

	}

}
