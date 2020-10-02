package org.full.polymorphism;

public class Circle implements Shape {

	double radius = 1.5;

	@Override
	public void area() {

		double circleArea = 3.14 * radius * radius;
		System.out.println("Area of Circle " + circleArea);
	}

}
