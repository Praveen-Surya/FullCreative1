package org.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreSet {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();

		System.out.println("The TreeSet is Empty: " + treeSet.isEmpty());
		System.out.println("The Size of the TreeSet is: " + treeSet.size());
		System.out.println();

		treeSet.add("Red");
		treeSet.add("Blue");
		treeSet.add("Green");
		treeSet.add("Yellow");
		treeSet.add("Pink");
		treeSet.add("Violet");

		System.out.println(treeSet);// TreeSet will Sort the data in Ascending Order by default
		System.out.println(treeSet.descendingSet());

		System.out.println("The TreeSet Contains Green: " + treeSet.contains("Green"));
		System.out.println("The TreeSet Contains Orange: " + treeSet.contains("Orange"));
		System.out.println();

		Iterator<String> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
