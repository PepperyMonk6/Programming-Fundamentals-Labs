package lab10_exercise2;

public class Charge {
	private Service service;
	private double charge;
	
	public Charge(Service service, double charge) {
		this.service = service;
		this.charge = charge;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}
	
public double calculateVAT() {
		double result = 0;
		double standardCharge = this.service.getStandardCharge();
		if(this.service.getRate() == VATRate.LOW) {
			result = standardCharge * 0.5;
		}	else if(this.service.getRate() == VATRate.STANDARD) {
			result = standardCharge * 1.75;
		}
		return result;
	}
}
