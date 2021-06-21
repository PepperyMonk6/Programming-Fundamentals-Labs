package exercise2;

public class Meal {
	private Food mainCourse;
	private Food dessert;
	
	public Meal (Food mainCourse, Food dessert) {
		super();
		this.mainCourse = mainCourse;
		this.dessert = dessert;
	}
	public double calculateTotalSugarLevel() {
		return this.mainCourse.getSugar() + this.dessert.getSugar();
	}
	@Override
	public String toString() {
		return "Meal [mainCourse = " + mainCourse.getName() + ", dessert = " + dessert.getName() + "]";
	}
}
