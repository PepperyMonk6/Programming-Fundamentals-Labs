package exercise2;

public class Food {
	private String name;
	private double amountOfSugar;
	
	public Food(String name, double amountOfSugar) {
		super();
		this.name = name;
		this.amountOfSugar = amountOfSugar;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSugar() {
		return this.amountOfSugar;
	}
		
}	
