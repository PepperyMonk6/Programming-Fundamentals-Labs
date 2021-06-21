package exercise1;

public class Main {
		public static void main(String[] args) {
			ClockDisplay clock = new ClockDisplay(true);
			for (int i = 0; i < 722; i++) {
				
				System.out.println(clock.toString());
				clock.timeTick();
			}
		}
}
