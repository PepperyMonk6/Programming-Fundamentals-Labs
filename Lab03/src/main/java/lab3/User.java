package lab3;

public class User {
	private String name;
	private Email email;
	
	public User(String fullName, Email emailAdress) {
		super();
		this.name = fullName;
		this.email = emailAdress;
	}
	
	public Email getEmail() {
		return this.email;
	}
	
	public void setEmail(Email email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  this.name + " <" + this.email.getEmailAddress() + ">";
	}

}
