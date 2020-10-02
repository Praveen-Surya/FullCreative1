package org.full.test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.full.main.StringHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestStringBuilderHandler {

	private String inputStr;
	private String oldString;
	private String newString;
	private String expectedString;
	private StringHandler stringHandler;

	public TestStringBuilderHandler(String inputStr, String oldString, String newString, String expectedString) {
		this.inputStr = inputStr;
		this.oldString = oldString;
		this.newString = newString;
		this.expectedString = expectedString;
	}

	@Before
	public void initilize() {
		stringHandler = new StringHandler();
	}

	@Test
	public void testStringHandler() {
		assertEquals(expectedString, stringHandler.replaceString(inputStr, oldString, newString));
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(
				new Object[][] { { "Java is a Programming Language", "a", "b", "Jbvb is b Progrbmming Lbngubge" },
						{ "Java is a Programming Language", " ", "b", "JavabisbabProgrammingbLanguage" },
						{ "Java is a Programming Language", "a", " ", "J v  is   Progr mming L ngu ge" },
						{ "Java is a Programming Language", "a", "1", "J1v1 is 1 Progr1mming L1ngu1ge" },
						{ "Java is a Programming Language", "a", "*", "J*v* is * Progr*mming L*ngu*ge" },
						{ "Java is a Programming Language", "z", "a", "Java is a Programming Language" },
						{ "Java is a Programming Language Java", "Java", "Python",
								"Python is a Programming Language Python" },
						{ "India is my country", "my", "our", "India is our country" },

				});
	}

}
