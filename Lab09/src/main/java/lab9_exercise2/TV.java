package lab9_exercise2;

public class TV extends AbstractItem {
	private static final double SALE_PERCENTAGE = 0.80;
	
	private int size = 0;

	
	public TV(double price, int size) {
		super(price);
		this.size = size;
	}

	
	@Override
	public double calculateSalePrice() {
		return super.getPrice() * SALE_PERCENTAGE;
	}

	@Override
	public String getName() {
		return "TV (" + this.getSize() + "\")";
	}

	public int getSize() {
		return this.size;
	}

}