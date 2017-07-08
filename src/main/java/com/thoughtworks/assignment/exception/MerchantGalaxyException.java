/**
 * 
 */
package com.thoughtworks.assignment.exception;

/**
 * @author Kashif
 * 
 */
public class MerchantGalaxyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MerchantGalaxyException() {
		super();
	}

	public MerchantGalaxyException(String message) {
		super(message);
	}

	public MerchantGalaxyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MerchantGalaxyException(Throwable cause) {
		super(cause);
	}

	protected MerchantGalaxyException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
