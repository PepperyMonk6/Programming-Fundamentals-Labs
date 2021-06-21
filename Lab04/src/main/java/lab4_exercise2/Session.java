package lab4_exercise2;

public class Session {
	private String sessionName;
	private int startTime;
	private int endTime;
	
	public Session() {
		this.sessionName = "";
		this.startTime = 0;
		this.endTime = 0;
	}
	
	public Session(String sessionName, int startTime, int endTime) {
		this.sessionName = sessionName;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public String getSessionName() {
		return this.sessionName; 
	}
	
	public int getStartTime() {
		return this.startTime;
	}
	
	public int getEndTime() {
		return this.endTime;
	}
	
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
}
