package lab4_exercise1;

public class Neighbourhood {
	private House[] houses = new House[3];
	
	public Neighbourhood() {
		this.houses[0] = new House(3, 4);
		this.houses[1] = new House(5, 1);
		this.houses[2] = new House(7, 2);
	}
	
	public House getHouses(int i) {
		return this.houses[i];
	}
	
	public void setHouses(int i, int numberOfHouse, int numberBottles) {
		this.houses[i].setNumberBottles(numberBottles);
		this.houses[i].setNumberOfHouse(numberOfHouse);
	}
	
	public int calculateTotal() {
		int bottlesTotal = 0;
		for(int i = 0; i < houses.length; i++) {
			bottlesTotal += this.houses[i].getNumberBottles();
		}
		return bottlesTotal;
	}
	
	public String displayArray() {
		String disArray = "";
		for(int i = 0; i < houses.length; i++) {
			disArray += "Number of bottles in House number " + this.houses[i].getNumberOfHouse() + " is " + this.houses[i].getNumberBottles() + "\n";
		}
		disArray += "Total number of bottles to be delivered: " +  this.calculateTotal();
		return disArray;
	}
}
