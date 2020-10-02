package org.full.polymorphism;

// Compile Time Polymorphism

public class CalculateArea {

	void area(double radius) {

		double circleArea = 3.14 * radius * radius;
		System.out.println("Area of Circle " + circleArea);

	}

	void area(double height, double base) {

		double triangleArea = 0.5 * height * base;
		System.out.println("Area of Triangle " + triangleArea);

	}

	public static void main(String[] args) {

		CalculateArea area = new CalculateArea();
		area.area(3.15);
		area.area(3.0, 4.5);

	}
}
