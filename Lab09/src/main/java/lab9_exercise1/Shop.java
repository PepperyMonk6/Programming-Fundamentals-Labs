package lab9_exercise1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private List<IItem> items;
	
	public Shop() {
		this.items = new ArrayList<IItem>();
	}
	
	public  void addItem(IItem item) {
		items.add(item);
	}
	
	public String displayCatalogue() {
		String result = "";
		result += "Shop Catalogue\n\nItem\t\tPrice\tSale Price\n";
		for (int i = 0; i < items.size(); i++) {
			result += items.get(i).getName() + "\t£" + String.format("%.2f", items.get(i).getPrice())
			+ "\t£" + String.format("%.2f", items.get(i).calculateSalePrice()) + "\n";
		}
		return result.replaceAll(",", ".");
	}
}
