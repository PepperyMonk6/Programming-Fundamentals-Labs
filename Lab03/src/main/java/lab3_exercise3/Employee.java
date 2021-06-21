package lab3_exercise3;

public class Employee {
	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;
	
	public Employee() {
		this.id = 0;
		this.forename = "";
		this.surname = "";
		this.salary = new AnnualSalary();
		this.companyPosition = new Position();
	}
	
	public Employee(int id, String forename, String surname, AnnualSalary salary, Position companyPosition) {
		super();
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.companyPosition = companyPosition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setsurname(String surname) {
		this.surname = surname;
	}

	public double getSalary() {
		return this.salary.getSalary();
	}

	public void setSalary(AnnualSalary salary) {
		this.salary = salary;
	}

	public String getPositionName() {
		return this.companyPosition.getRoleName();
	}
	
	public Position getCompanyPosition() {
		return companyPosition;
	}

	public void setCompanyPosition(Position companyPosition) {
		this.companyPosition = companyPosition;
	}
	
	public void displayEmployeeName() {
		System.out.println(this.forename + " " + this.surname);
	}
	
	private boolean eligableForBonus() {
		if(this.salary.getSalary() > 40000) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String result = this.surname + ", " + this.forename + " (" + this.id +"): " 
				+ this.companyPosition.getRoleName() + " at £" + this.salary.getSalary() + " (£" 
				+ this.salary.calculateTax() + " tax)";
		if(this.eligableForBonus()) {
			result += " and is eligible for bonus.";
		} else {
			result += " and is not eligible for bonus.";
		}
		return result;
		//James, Sid (1234):  Director at$53875.00 ($9046.40 tax) and is eligible for bonus
	}
	}