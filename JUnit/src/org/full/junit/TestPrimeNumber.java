package org.full.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPrimeNumber {

	private PrimeNumber primeNumber;

	@Before
	public void initilize() {
		primeNumber = new PrimeNumber();
	}

	@Test
	public void notAPrimeNumberTest() {
		assertFalse(primeNumber.primeNumberCheck(20));

	}

	@Test
	public void primeNumberTest() {
		assertTrue(primeNumber.primeNumberCheck(17));

	}

}
