package lab3;

public class Mail {
	private User sender;
	private User recipient;
	private String message;
	
	public Mail(User sender, User recipient, String message) {
		this.sender = sender;
		this.recipient = recipient;
		this.message = message;
	}
	
	public String getSender() {
		return this.sender.getName() + " <" + this.sender.getEmail().getEmailAddress() + ">";
	}
	
	public String getRecipient() {
		return this.recipient.getName() + " <" + this.recipient.getEmail().getEmailAddress() + ">";
	}
	
	public String getMessage() {
		return message;
	}
	
	private void isEmpty() {
		if(this.getMessage() ==null||this.getMessage() == "") {
			this.message = "** Something went wrong! **";
		} else {
		}
	}
	public void print() {
		this.isEmpty();
		System.out.println("From: " + sender.getName());
		System.out.println("To: " + recipient.getName());
		System.out.println("Message: " + message);
	}
}
