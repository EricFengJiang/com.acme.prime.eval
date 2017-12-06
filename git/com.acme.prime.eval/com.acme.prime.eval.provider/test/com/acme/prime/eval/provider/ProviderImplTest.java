package com.acme.prime.eval.provider;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Example JUNit test case
 *
 */

public class ProviderImplTest {

	/*
	 * Example test method
	 */
	@Test
	public void simple() throws Exception {
		EvalImpl impl = new EvalImpl();
		assertEquals(3.0, impl.eval("1 + 2"), 0);
	}

}
