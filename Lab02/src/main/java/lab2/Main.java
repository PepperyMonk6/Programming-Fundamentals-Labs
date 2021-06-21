package lab2;

public class Main {
		public static void main(String[] args) {
			ClockDisplay clock = new ClockDisplay(24, 60);
			for (int i = 0; i < 100; i++) {
				clock.timeTick();
				System.out.println(clock.toString());
			}
		}
}
