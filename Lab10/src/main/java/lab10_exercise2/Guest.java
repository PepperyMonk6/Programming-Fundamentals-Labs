package lab10_exercise2;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest {
	private String forename;
	private String surname;
	private String address;
	private String telephone;
	private List<Charge> charges;
	
	public Guest(String forename, String surname, String address, String telephone) {
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		charges = new ArrayList<Charge>();
	}
	
	public void addCharge(Service service, double charge) {
		charges.add(new Charge(service, charge));
	}
	
	public double calculateTotalChargeWithoutVAT() {
		return 0;
	}
	
	public double calculateVATChargeAtRate(VATRate rate) {
		return 0;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += this.forename + " " + this.surname + ", " + this.address + ", " + this.telephone;
		return result;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Charge> getCharges() {
		return charges;
	}

	public void setCharges(List<Charge> charges) {
		this.charges = charges;
	}
}
