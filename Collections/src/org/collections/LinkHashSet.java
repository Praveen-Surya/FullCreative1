package org.collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		System.out.println("The LinkedHashSet is Empty: " + linkedHashSet.isEmpty());
		System.out.println("The Size of the LinkedHashSet is: " + linkedHashSet.size());
		System.out.println();

		// LinkedHashSet Supports Insertion Order

		linkedHashSet.add("Red");
		linkedHashSet.add("Blue");
		linkedHashSet.add("Green");
		linkedHashSet.add("Yellow");
		linkedHashSet.add("Pink");
		linkedHashSet.add("Violet");

		System.out.println(linkedHashSet);
		System.out.println("The LinkedHashSet Contains Green: " + linkedHashSet.contains("Green"));
		System.out.println("The LinkedHashSet Contains Orange: " + linkedHashSet.contains("Orange"));
		System.out.println();

		Iterator<String> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
