package org.full.junit;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestDivisionOperation {

	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private DivisionOperation divisionOperation;

	public TestDivisionOperation(int firstNumber, int secondNumber, int expectedResult) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initilize() {
		divisionOperation = new DivisionOperation();
	}

	@Test
	public void testArithmeticOperations() {
		assertEquals(expectedResult, divisionOperation.division(firstNumber, secondNumber));
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { { 1, 1, 1 }, { 12, -6, -2 }, { -10, -5, 2 }, { 0, 1, 0 }, { 0, -1, 0 } });

	}

}
