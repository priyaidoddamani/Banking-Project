package com;

public class InsufficientBalnaceException extends RuntimeException{
	private String message;
	InsufficientBalnaceException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}
}



/** Documentation Comment -->Rules to Develop Custome Exception
 * ---------------------------------------
 * 1.create a class with the exception name
 * 2a. if class extends Exception --> checked Exception
 * 2b. if class extends RuntimeException  -->unchecked Exception
 * 3. Override getMessage() -->(variable,Constructor,method)
 * 4. invoke the exception object using throw keyword and handle it using try and catch block
 */

