package org.full.junit;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestMultipleOperation {
	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private MultipleOperation multipleOperation;

	public TestMultipleOperation(int firstNumber, int secondNumber, int expectedResult) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		multipleOperation = new MultipleOperation();
	}

	@Test
	public void testMultipleOperations() {

		assertEquals(expectedResult, multipleOperation.multiple(firstNumber, secondNumber));
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { { 1, 1, 1 }, { 11, -1, -11 }, { -10, -22, +220 }, { 0, 1, 0 },
				{ 0, -1, 0 }, { 0, 0, 0 } });
	}
}
