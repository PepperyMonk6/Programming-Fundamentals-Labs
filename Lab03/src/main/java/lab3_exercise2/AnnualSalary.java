package lab3_exercise2;

public class AnnualSalary {
	private double salary;
	
	public AnnualSalary() {
		this.salary = 0;
	}
	
	public AnnualSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculateTax() {
		double totalTax = 0;
		double PERSONALALLOWANCE = 12509;
		double taxableSalary = this.salary - PERSONALALLOWANCE;
		if(taxableSalary > 37500) {
			totalTax += 37500 * 0.2;
			totalTax += (taxableSalary - 37500) * 0.4;
		}else if(taxableSalary > 0){
			totalTax += taxableSalary * 0.2;
		}
		return totalTax;
	}
}
