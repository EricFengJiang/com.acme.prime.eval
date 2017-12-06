package com.acme.prime.eval.api;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This is an example OSGi enRoute bundle that has a component that implements
 * an API.
 */

@ProviderType
public interface Eval {

	/**
	 * Evaluate an expression and return the result.
	 */
	double eval(String expression) throws Exception;

}
