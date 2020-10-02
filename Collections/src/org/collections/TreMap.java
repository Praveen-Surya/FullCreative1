package org.collections;

import java.util.TreeMap;

public class TreMap {

	public static void main(String[] args) {

		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		System.out.println("The HashMap is Empty: " + treeMap.isEmpty());
		System.out.println("The Size of the HashMap is: " + treeMap.size());
		System.out.println();

		treeMap.put("English", 85);
		treeMap.put("Physics", 91);
		treeMap.put("Chemistry", 89);
		treeMap.put("Maths", 95);
		treeMap.put("Botany", 70);
		treeMap.put("Zoology", 70);// Duplicate Value is allowed for different Key.
		treeMap.put("Social", 93); // Duplicate Key is not allowed
		treeMap.put("Social", 55);

		System.out.println(treeMap);// TreeMap will Sort the data in Ascending Order by default
		System.out.println(treeMap.descendingMap());

	}

}
