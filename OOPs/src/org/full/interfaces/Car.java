package org.full.interfaces;

public interface Car {

	default void automate() {
	}

	static void airBag() {
	}

	void accelerate();

	void brake();

	void changeGear();

}