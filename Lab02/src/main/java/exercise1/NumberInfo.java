package exercise1;

public class NumberInfo {
	private int limit;
	private int value;
	
	public NumberInfo() {
		super();
		this.limit = 3;
		this.value = 0;
	}
	
	public NumberInfo(int limit) {
		super();
		this.limit = limit;
		this.value = 0;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void increment() {
		this.value = (this.value + 1) % this.limit; 
	}
}
