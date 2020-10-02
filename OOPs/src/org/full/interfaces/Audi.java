package org.full.interfaces;

public class Audi implements Car {

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

	public void soundSystem() {
		System.out.println("soundSystem method implementation");
	}

	public void cameraSystem() {
		System.out.println("cameraSystem method implementation");
	}

	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.accelerate();// implemented abstract method of interface
		Car.airBag();// static method of interface
		audi.soundSystem();// instance method of Audi class
	}

}
