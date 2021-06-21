package lab11_exercise3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadyMeal {
	private String name;
	private ProductType type;
	private Factory factory;
	private Date productionDate = null;
	private List<IItem> items;
	
	public ReadyMeal(String name, ProductType type, Factory factory) {
		this.productionDate = new Date();
		this.name = name;
		this.type = type;
		this.factory = factory;
		this.items = new ArrayList<IItem>();
	}
	
	public void addItem(IItem biscuit) {
		this.items.add(biscuit);
	}
	
	public String printContent() {
		String typeArray = this.getType().toString();
		String result = "";
		String subStr1 = typeArray.substring(0, 1);
		String subStr2 = typeArray.substring(1, typeArray.length()).toLowerCase();
		for(int i = 0; i < this.items.size(); i++) {
			result += subStr1 + subStr2 + " " + this.name + " Ready Meal " + 
					this.items.get(i).getTotalWeight() + " g\n\n" + "Contents\n" + "Calories: " +
					this.items.get(i).getTotalCalories() + "kcal\n" + "Meat (fat): " + 
					this.items.get(i).getTotalFat(IngredientType.MEAT) + "g\n" + "Vegetable (sodium): " +
					this.items.get(i).getTotalSodium(IngredientType.VEGETABLE) + "g\n\n" + 
					this.factory.getAddress();
		}
		return result;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public List<IItem> getItems() {
		return items;
	}

	public void setItems(List<IItem> items) {
		this.items = items;
	}
}
