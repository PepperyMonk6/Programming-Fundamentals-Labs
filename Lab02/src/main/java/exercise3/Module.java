package exercise3;

public class Module {
	private Assessment assessment1;
	private Assessment assessment2;
	
	public Module(Assessment assessment1, Assessment assessment2) {
		super();
		this.assessment1 = assessment1;
		this.assessment2 = assessment2;
	}
		public double calculateAverage() {
			return this.assessment1.getMark() * 0.2 + this.assessment2.getMark() * 0.8;
	}
		@Override
		public String toString() {
				return "COM1027 Average = " + calculateAverage() + "%" + " [Labs(20%) = " + assessment1.getMark()
				+ "% ," + "Coursework(80%) = " + assessment2.getMark() + "% ]";
				//"COM1027 Average = 75.6% [Labs(20%) = 90.0% ,Coursework(80%) = 72.0% ]"
			}
}
