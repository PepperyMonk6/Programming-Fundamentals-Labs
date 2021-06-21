package lab3;

public class Email {
	private static final String DEFAULT_ADRESS = "known@unknown";
	private String emailAdress = DEFAULT_ADRESS;
	
	public Email(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	
	public String getEmailAddress() {
		return this.emailAdress;
	}
	
	public void setEmailAddress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
}
