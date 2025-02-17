package com.bi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTC {

	@Test
	void tesDepositt() {
		Account a123 = new Account(100);
		
		assertEquals(123, a123.getId());
		
		a123.deposit(50);
		
		assertEquals(150, a123.getBalance());
	}

}
