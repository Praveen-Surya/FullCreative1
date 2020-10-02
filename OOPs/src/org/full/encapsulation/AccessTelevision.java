package org.full.encapsulation;

public class AccessTelevision {

	public static void main(String[] args) {

		Television television = new Television();
		
		
		/*	Integer volume=television.getVolume();
		volume=200;
		volume=television.getVolume();
		System.out.println(volume);

		television.increaseVolume(20);
		*/
		
		television.decreaseVolume(20);

		System.out.println(television.getVolume());

		television.increaseVolume(15);

		System.out.println(television.getVolume());

	}

}
