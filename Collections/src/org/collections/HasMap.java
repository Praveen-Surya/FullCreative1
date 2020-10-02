package org.collections;

import java.util.HashMap;

public class HasMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		System.out.println("The HashMap is Empty: " + hashMap.isEmpty());
		System.out.println("The Size of the HashMap is: " + hashMap.size());
		System.out.println();

		// HashMap Doesn't Supports Insertion Order

		hashMap.put(85, "English");
		hashMap.put(91, "Physics");
		hashMap.put(89, "Chemistry");
		hashMap.put(95, "Maths");
		hashMap.put(93, "Biology");
		hashMap.put(93, "Social"); // Duplicate Key is not allowed
		hashMap.put(55, "Social"); // Duplicate Value is allowed for different Key.

		System.out.println(hashMap);

	}

}
