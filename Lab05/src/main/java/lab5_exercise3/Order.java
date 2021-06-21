package lab5_exercise3;

import java.util.ArrayList;
import java.util.List;

public class Order {
		private List<Pizza> pizzas;
		private Customer customer;
		
		public Order(Customer customer) {
			this.customer = customer;
			this.pizzas = new ArrayList<Pizza>();
		}
		
		public void addPizza(Pizza pizza) {
			
			this.pizzas.add(pizza);
		}
		
		public double calculateTotal() {
			double totalCost = 0;
			for(int i = 0; i < pizzas.size(); i++) {
				totalCost += this.pizzas.get(i).calculateCost();
			}
			return totalCost;
		}
		
		public String printReceipt() {
			String receipt = "Customer: " + this.customer.getName() + ". "
					+ this.customer.getSurname() + "\n" + "Number of Pizzas: "
					+ this.pizzas.size() + "\n" + "Total Cost: " + this.calculateTotal();
			return receipt;
		} 
}
