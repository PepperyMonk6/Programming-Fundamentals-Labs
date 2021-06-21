package lab8_exercise3;

public class InvalidSurnameException extends Exception {
	
	/*public InvalidSurnameException(String errorMessage) {
		super(errorMessage);
		
	}*/
	public InvalidSurnameException() {
		super("Invalid Surname");
	}
	
	public InvalidSurnameException(String error) {
		super(error);
	}
}