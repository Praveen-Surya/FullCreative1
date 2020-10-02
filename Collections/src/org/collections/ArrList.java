package org.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		System.out.println("The List is Empty: " + arrayList.isEmpty());
		System.out.println("The Size of the List is: " + arrayList.size());
		System.out.println();

		arrayList.add("Red");
		arrayList.add("Blue");
		arrayList.add("Green");
		arrayList.add("Yellow");
		arrayList.add("Pink");
		arrayList.add("Violet");

		System.out.println(arrayList);
		System.out.println("The List Contains Green: " + arrayList.contains("Green"));
		System.out.println("The List Contains Orange: " + arrayList.contains("Orange"));
		System.out.println("The Value at index 5 is: " + arrayList.get(5));
		System.out.println();

		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
