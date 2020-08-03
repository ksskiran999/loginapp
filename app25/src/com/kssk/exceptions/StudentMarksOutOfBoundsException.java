package com.kssk.exceptions;

public class StudentMarksOutOfBoundsException extends RuntimeException {

	public String exception_Message;	
	
	public StudentMarksOutOfBoundsException(String exception_Message) {
		this.exception_Message=exception_Message;
	}

	/*public void setException_Message(String exception_Message) {
		this.exception_Message = exception_Message;
	}
	public String getException_Message() {
		return exception_Message;
	}*/
}
