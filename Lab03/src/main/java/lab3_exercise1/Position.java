package lab3_exercise1;

public class Position {
	private String role;
	
	public Position() {
		this.role = "";
	}
	
	public Position(String role) {
		this.role = role;
	}
	
	public String getRoleName() {
		return role;
	}
	
	public void setRoleName(String role) {
		this.role = role;
	}
	
}
