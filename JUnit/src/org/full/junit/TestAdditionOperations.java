package org.full.junit;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestAdditionOperations {
	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private AdditionOperation additionOperation;

	public TestAdditionOperations(int firstNumber, int secondNumber, int expectedResult) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		additionOperation = new AdditionOperation();
		System.out.println("hi");
	}

	@Test
	public void testArithmeticOperations() {
		assertEquals(expectedResult, additionOperation.addition(firstNumber, secondNumber));
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { { 1, 1, 2 }, { 11, -1, 10 }, { -10, -22, -32 }, { 0, 1, 1 },
				{ 0, -1, -1 }, { 0, 0, 0 } });
	}
}
