package lab5_exercise3;

public class Pizza {
		private String[] toppings;
		
		public Pizza() {
			this.toppings = new String[10];
		}
		
		public void addToppings(String[] toppings) {
			for(int i = 0; i < toppings.length; i++) {
				this.toppings[i] = toppings[i];
			}
		}
		
		public String printToppings() {
			String printedToppings = "";
			int i = 0;
			do {
				printedToppings += this.toppings[i] + ",";
				i++;
			} while(this.toppings[i + 1] != null);
			printedToppings += this.toppings[i];
			return printedToppings;
		}
		
		public double calculateCost() {
			double price = 0;
			int countValidToppings = 0;
			for(int i = 0; i < toppings.length; i++) {
				if(this.toppings[i] != null) {
					countValidToppings += 1;
				}
			}
		
			switch (countValidToppings) {
			case 1:
			case 2:
			case 3:
			case 4:
				price = 8.99;
			break;
			case 5:
				price = 9.99;
			//Add code here
			break;
			case 6:
				price = 10.99;
			//Add code here
			break;
			case 7:
				price = 11.99;
			//Add code here
			break;
			case 8:
				price = 12.99;
			break;
			case 9:
				price = 13.99;
			break;
			case 10:
				price = 14.99;
			break;
			} 
			return price;
		}
}
