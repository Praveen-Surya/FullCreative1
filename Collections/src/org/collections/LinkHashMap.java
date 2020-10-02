package org.collections;

import java.util.LinkedHashMap;

public class LinkHashMap {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		System.out.println("The HashMap is Empty: " + linkedHashMap.isEmpty());
		System.out.println("The Size of the HashMap is: " + linkedHashMap.size());
		System.out.println();

		// LinkedHashMap Supports Insertion Order

		linkedHashMap.put(85, "English");
		linkedHashMap.put(91, "Physics");
		linkedHashMap.put(89, "Chemistry");
		linkedHashMap.put(95, "Maths");
		linkedHashMap.put(93, "Biology");
		linkedHashMap.put(93, "Social"); // Duplicate Key is not allowed
		linkedHashMap.put(55, "Social"); // Duplicate Value is allowed for different Key.

		System.out.println(linkedHashMap);

	}

}
