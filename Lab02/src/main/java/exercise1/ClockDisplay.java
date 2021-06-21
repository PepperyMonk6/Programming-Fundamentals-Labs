package exercise1;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;
	private boolean isAM = true;
    private boolean is12Format = true;
	
	public ClockDisplay() {
		super();
		this.hours = new NumberInfo();
		this.minutes = new NumberInfo();
	}
	
	public ClockDisplay(boolean is12format) {
		super();
		this.is12Format = is12format;
		if (is12format) {
			this.hours = new NumberInfo(12);
			this.minutes = new NumberInfo(60);
		} else {
			this.hours = new NumberInfo(24);
			this.minutes = new NumberInfo(60);
		}
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
		if(this.hours.getValue() == 0)
        {
            this.isAM = !this.isAM;
        }
		}
		
	}
	
	@Override
	public String toString() {
		
		
		String output = "";
		String h = Integer.toString(this.hours.getValue());
		String m = Integer.toString(this.minutes.getValue());
		if (h.length() == 1 && !is12Format) {
			h = "0" +  h;
		}
		if (m.length() == 1) {
			m = "0" +  m;
		}
        output += h;
        output += ":";
        output += m;
        
        if (is12Format)
        {
            if(isAM)
            {
                output += "am";
            }
            else
            {
                output += "pm";
            }

        }
        if (output.contains ("0:00pm")) {
        	output = "12:00pm";
        }
        
        return output;
			
	}

}
