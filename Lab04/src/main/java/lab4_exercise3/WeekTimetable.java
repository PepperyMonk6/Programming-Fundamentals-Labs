package lab4_exercise3;

public class WeekTimetable {
	private Day[] days;
	
	public WeekTimetable() {
		this.days = new Day[7];
	}
	
	public void addDailySessions(int i, Day day) {
		 this.days[i] = new Day();
		 this.days[i] = day;
	 }
	
	public String printTimetable() {
		String result = "";
		for(int i = 0; i < days.length; i++) {
			if(days[i] != null) {
				result += this.days[i].getName() + "\n" + this.days[i].toString() + "\n";
			}
		}
		return result;
	}
	 
	 
}
