package exercise3;

public class Assessment {
	private String name;
	private int maximum;
	private double mark;
	
	public Assessment(String name, double mark) {
		this.name = name;
		this.maximum = 100;
		this.mark = mark;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMaximum() {
		return this.maximum;
	}
	
	public double getMark() {
		return this.mark;
	}
	
	public void setNamne(String name) {
		this.name = name;
	}
	
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	public void setMark(double mark) {
		this.mark = mark;
	}
	
}
