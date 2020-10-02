package org.string;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStringBuilderClass {

	private StringBuilder mobileName;

	@Before
	public void initilize() {
		mobileName = new StringBuilder("Samsung");
	}

	@Test
	public void testAppend() {
		assertEquals(mobileName, mobileName.append(" Company"));
		System.out.println(mobileName);
	}

	@Test
	public void testDelete() {
		assertEquals(mobileName, mobileName.delete(1, 5));
		System.out.println(mobileName);
	}

	@Test
	public void testInsert() {
		assertEquals(mobileName, mobileName.insert(1, "HELLO"));
		System.out.println(mobileName);
	}

	@Test
	public void testReverse() {
		assertEquals(mobileName, mobileName.reverse());
		System.out.println(mobileName);
	}

	@Test
	public void testReplace() {
		assertEquals(mobileName, mobileName.replace(1, 3, "AM"));
		System.out.println(mobileName);
	}

}
