package org.full.polymorphism;

//Run Time Polymorphism

public class Driver {

	public static void callArea(Shape a) {

		a.area();

	}

	public static void main(String[] args) {

		Shape circle = new Circle();
		circle.area();

		Shape triangle = new Triangle();
		triangle.area();

		callArea(circle);
		callArea(triangle);

	}

}