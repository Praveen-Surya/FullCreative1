package org.singleton;

public class DriverClass {

	public static void main(String[] args) {

		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		SingletonClass obj3 = SingletonClass.getInstance();

		obj1.inpstr = obj1.inpstr.toUpperCase();
		System.out.println("String from x is " + obj1.inpstr);
		System.out.println("String from x is " + obj2.inpstr);
		System.out.println("String from x is " + obj3.inpstr);

		System.out.println();

		obj3.inpstr = obj3.inpstr.toLowerCase();
		System.out.println("String from x is " + obj1.inpstr);
		System.out.println("String from x is " + obj2.inpstr);
		System.out.println("String from x is " + obj3.inpstr);
	}

}
