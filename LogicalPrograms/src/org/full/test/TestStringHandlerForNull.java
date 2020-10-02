package org.full.test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.full.main.StringHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class TestStringHandlerForNull {

	private StringHandler stringHandler;

	@Before
	public void initilize() {
		stringHandler = new StringHandler();
	}

	@Test(expected = NullPointerException.class)
	public void testNullStringHandler() {
		stringHandler.replaceString(null, "a", "z");
	}

}
