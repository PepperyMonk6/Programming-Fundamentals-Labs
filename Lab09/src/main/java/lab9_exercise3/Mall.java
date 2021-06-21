package lab9_exercise3;

import java.util.HashMap;
import java.util.Map;

public class Mall {
	private Map<Integer, Shop> shops;
	
	public Mall() {
		shops = new HashMap<Integer, Shop>();
	}
	
	public void addShop(int number, Shop shop) throws NullPointerException{
		if(shop == null) throw new NullPointerException();
		shops.put(number, shop);
	}
	
	public String displayAllShops() {
		String result = "";	
		for(Map.Entry<Integer, Shop> entry : shops.entrySet()) {
		Integer number = entry.getKey();
		Shop shop = entry.getValue();
		result += number + " : "  + shop.displayCatalogue();
		}
		return result;
	}
}
