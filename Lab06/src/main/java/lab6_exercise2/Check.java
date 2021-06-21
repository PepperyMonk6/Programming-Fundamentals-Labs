package lab6_exercise2;

public class Check {
	public static void main(String args) {
		Player player1 = new Player("Rhys Priestland", RugbyPosition.FLYHALF);
		Player player2 = new Player("Mike Phillips", RugbyPosition.SCRUMHALF);
		Halfbacks halfbacks = new Halfbacks();halfbacks.assignHalfback(player1);
		halfbacks.assignHalfback(player2);
		System.out.println(halfbacks.displayElements());
		System.out.println(halfbacks.getPlayerBad(1));
	}
}
