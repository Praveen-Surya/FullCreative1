package org.full.junit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestDivisionExpection {
	private DivisionOperation divisionOperation;

	@Before
	public void initilize() {
		divisionOperation = new DivisionOperation();
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisionOperation() {
		divisionOperation.division(1, 0);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisionOperation1() {
		divisionOperation.division(0, 0);
	}

	// If reference object is Null it throws NPE
	@Ignore
	@Test(expected = NullPointerException.class)
	public void testDivisionOperation2() {
	}

}
