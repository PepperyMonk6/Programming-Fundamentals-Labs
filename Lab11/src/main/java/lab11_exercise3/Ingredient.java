package lab11_exercise3;

public class Ingredient {
	private String name;
	private IngredientType type;
	private Supplier supplier;
	private double rawWeight;
	private double calories;
	private double fat;
	private double sodium;
	
	public Ingredient(String name, IngredientType type, Supplier supplier, double rawWeight, double calories, 
			double fat, double sodium) {
		this.name = name;
		this.type = type;
		this.supplier = supplier;
		this.rawWeight = rawWeight;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IngredientType getType() {
		return type;
	}

	public void setType(IngredientType type) {
		this.type = type;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public double getRawWeight() {
		return rawWeight;
	}

	public void setRawWeight(double rawWeight) {
		this.rawWeight = rawWeight;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getSodium() {
		return sodium;
	}

	public void setSodium(double sodium) {
		this.sodium = sodium;
	}
	
	public double getCookedWeight() {
		return this.rawWeight * 0.8;
	}
}
