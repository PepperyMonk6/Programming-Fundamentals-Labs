package lab10_exercise3;

public class Service {
	private String code;
	private String name;
	private VATRate rate;
	private double standardCharge;
	String regExp = "([A-Z]{4}[0-9]{4})";
	
	public Service(String code, String name, VATRate rate, double standardCharge) {
		if(!code.matches(regExp)) {
			throw new IllegalArgumentException();
		}
		if(standardCharge < 0) {
			throw new IllegalArgumentException();
		}
		if(name == null) {
			throw new NullPointerException();
		}
		this.code = code;
		this.name = name;
		this.rate = rate;
		this.standardCharge = standardCharge;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VATRate getRate() {
		return rate;
	}

	public void setRate(VATRate rate) {
		this.rate = rate;
	}

	public double getStandardCharge() {
		return standardCharge;
	}

	public void setStandartCharge(double standartCharge) {
		this.standardCharge = standartCharge;
	}
	
	
}
