package org.full.junit.basics;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAccount {

	Account account;

	@Before
	public void initilize() {
		account = new Account();
	}

	@Test
	public void testEquals() {
		assertEquals(1500, account.deposit(500));

	}
	
	@Test
	public void testSame() {
		assertSame(account.name, account.name1);
	}

	@Test
	public void testNull() {
		assertNull(account.name2);
	}

	@Test
	public void testNotNull() {
		assertNotNull(account.name);
	}

	@Test
	public void testNotSame() {
		assertNotSame(account.nickName, account.name);
	}
}
