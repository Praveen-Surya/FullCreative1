package org.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		System.out.println("The HashSet is Empty: " + hashSet.isEmpty());
		System.out.println("The Size of the HashSet is: " + hashSet.size());
		System.out.println();

		// HashSet Doesn't Supports Insertion Order

		hashSet.add("Red");
		hashSet.add("Blue");
		hashSet.add("Green");
		hashSet.add("Yellow");
		hashSet.add("Pink");
		hashSet.add("Violet");

		System.out.println(hashSet);

		System.out.println("The HashSet Contains Green: " + hashSet.contains("Green"));
		System.out.println("The HashSet Contains Orange: " + hashSet.contains("Orange"));
		System.out.println();

		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
