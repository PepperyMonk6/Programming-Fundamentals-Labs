package lab4_exercise2;

public class Day {
	private String name;
	private Session[] sessions;
	
	public Day() {
		super();
		this.name = "";
		sessions = new Session[4];
	}
	
	public Day(String name) {
		super();
		this.name = name;
		sessions = new Session[4];
	}
	
	public String getName() {
		return this.name;
	}
	
	public Session getSessions(int i) {
		return this.sessions[i];
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSession(int i, String moduleName, int startTime, int endTime) {
		this.sessions[i] = new Session();
		this.getSessions(i).setSessionName(moduleName);
		this.getSessions(i).setStartTime(startTime);
		this.getSessions(i).setEndTime(endTime);
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i = 0; i < sessions.length; i++) {
			if(sessions[i] != null) {
			result += this.getSessions(i).getSessionName() + ": " + this.getSessions(i).getStartTime() + " - " + this.getSessions(i).getEndTime() + "\n";
			}
		}	
		return result;
	} 
	
	public void display() {
		System.out.println(this.getName());
		System.out.println(this.toString());
	}
}
