package lab11_exercise2;

import java.util.ArrayList;
import java.util.List;

public class Item implements IItem {
	private List<Ingredient> ingredients;
	
	public Item() {
		this.ingredients = new ArrayList<Ingredient>();
	}
	
	public Item(List<Ingredient> ingredients) {
		this.ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}
	
	public double getTotalCalories() {
		double result = 0;
		for(int i = 0; i < this.ingredients.size(); i++) {
			result += this.ingredients.get(i).getCalories();
		}
		return result;
	}
	
	public double getTotalFat(IngredientType type) {
		double result = 0;
		for(int i = 0; i < this.ingredients.size(); i++) {
			if(this.ingredients.get(i).getType() == type) {
				result += this.ingredients.get(i).getFat();
			}
		}
		return result;
	}
	
	public double getTotalSodium(IngredientType type) {
		double result = 0;
		for(int i = 0; i < this.ingredients.size(); i++) {
			if(this.ingredients.get(i).getType() == type) {
				result += this.ingredients.get(i).getSodium();
			}
		}
		return result;
	}
	
	public double getTotalWeight() {
		double result = 0;
		for(int i = 0; i < this.ingredients.size(); i++) {
			result += this.ingredients.get(i).getCookedWeight();
		}
		return result;
	}
}
