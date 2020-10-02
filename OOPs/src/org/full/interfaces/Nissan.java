package org.full.interfaces;

public class Nissan implements Car {

	@Override
	public void accelerate() {
		System.out.println("accelerate method implementation");
	}

	@Override
	public void brake() {
		System.out.println("brake method implementation");
	}

	@Override
	public void changeGear() {
		System.out.println("changeGear method implementation");
	}

	public void automate() {
		System.out.println("automate method implementation");
	}

	public void gps() {
		System.out.println("gps method");
	}

	public void emissionControl() {
		System.out.println("emissionControl method");
	}

	public static void main(String[] args) {
		Nissan nissan = new Nissan();
		nissan.accelerate();// implemented abstract method of interface
		nissan.automate();// default method of interface
		Car.airBag();// static method of interface
		nissan.emissionControl();// instance method of Nissan class
	}

}
