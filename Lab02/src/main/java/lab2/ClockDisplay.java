package lab2;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;
	
	public ClockDisplay() {
		super();
		this.hours = new NumberInfo();
		this.minutes = new NumberInfo();
	}
	
	public ClockDisplay(int hoursLimit, int minutesLimit) {
		super();
		this.hours = new NumberInfo(hoursLimit);
		this.minutes = new NumberInfo(minutesLimit);
	}
	
	public void setHours(int hours) {
		this.hours = new NumberInfo(hours);
	}
	
	public NumberInfo getHours() {
		return this.hours;
	}
	
	public void timeTick() {
		this.minutes.increment();
		if(this.minutes.getValue() == 0) {
		this.hours.increment();
		}
		
	}
	
	@Override
	public String toString() {
		String a = "";
		if (this.hours.getValue() < 10) {
			a += "0" + this.hours.getValue();
		} else {
			a += this.hours.getValue();
		}
		
		a += ":";
		
		if (this.minutes.getValue() < 10) {
			a += "0" + this.minutes.getValue();
		} else {
			a += this.minutes.getValue();
		}
		return a;
	}

}
