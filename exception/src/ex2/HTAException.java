package ex2;

public class HTAException extends RuntimeException {
	
	private String errorCode;
	
	public HTAException() {
		
	}
	
	public HTAException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

//	public HTAException(Throwable cause) {
//		super(cause);
//	}
//	
//	public HTAException(String message, Throwable cause) {
//		super(message, cause);
//	}
	
}
