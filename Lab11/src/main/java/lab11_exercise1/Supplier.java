package lab11_exercise1;

public class Supplier {
	private String name;
	private String phone;
	String regExp = "[0][1-9]{10}";
	
	public Supplier(String name, String phone) throws IllegalArgumentException {
		if(!phone.matches(regExp)) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
