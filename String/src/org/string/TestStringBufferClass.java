package org.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestStringBufferClass {

	private StringBuffer companyName;

	@Before
	public void initilize() {
		companyName = new StringBuffer("Apple");
	}

	@Test
	public void testAppend() {
		assertEquals(companyName, companyName.append(" Company"));
		System.out.println(companyName);
	}

	@Test
	public void testDelete() {
		assertEquals(companyName, companyName.delete(1, 3));
		System.out.println(companyName);
	}

	@Test
	public void testInsert() {
		assertEquals(companyName, companyName.insert(1, "HELLO"));
		System.out.println(companyName);
	}

	@Test
	public void testReverse() {
		assertEquals(companyName, companyName.reverse());
		System.out.println(companyName);
	}

	@Test
	public void testReplace() {
		assertEquals(companyName, companyName.replace(1, 3, "AM"));
		System.out.println(companyName);
	}

}
