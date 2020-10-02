package org.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {

		LinkedList<String> linkedlist = new LinkedList<String>();

		linkedlist.add("Green");
		linkedlist.add("Yellow");
		linkedlist.add("Pink");

		System.out.println("After adding to the List: " + linkedlist);
		System.out.println();

		linkedlist.add(1, "Orange");
		System.out.println("After adding to the particular index in the List: " + linkedlist);
		System.out.println();

		linkedlist.set(2, "Black");
		System.out.println("After updating to the List: " + linkedlist);
		System.out.println();

		linkedlist.remove(1);
		System.out.println("After removing from the List: " + linkedlist);
		System.out.println();

		System.out.println("Using Iterator Interface");

		Iterator<String> iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println();

		System.out.println("Deque Methods for FIFO");

		linkedlist.addLast("Navy");
		System.out.println(linkedlist);

		linkedlist.removeLast();
		System.out.println(linkedlist);

		System.out.println(linkedlist.getLast());

		System.out.println();

		System.out.println("Deque Methods for LIFO");

		linkedlist.addFirst("Navy");
		System.out.println(linkedlist);

		linkedlist.removeFirst();
		System.out.println(linkedlist);

		System.out.println(linkedlist.getFirst());

	}

}
