package lab10_exercise3;

public interface IGuest {
	public void addCharge(Service service, double charge);
	
	public double calculateTotalChargeWithoutVAT();
	
	public double calculateVATChargeAtRate(VATRate rate);
	
	@Override
	public String toString();
}
