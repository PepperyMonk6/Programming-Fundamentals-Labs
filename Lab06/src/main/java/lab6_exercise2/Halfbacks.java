package lab6_exercise2;

public class Halfbacks {
		Player halfbacks[] = new Player[2];
		
		public Halfbacks() {
			halfbacks = new Player[2];
		}
		public String getPlayerBad(int number) {
			String result =null;
			if(number == 0) {
				result =this.halfbacks[0].getName();
				}
			if(number == 1) {
				result =this.halfbacks[1].getName();
			}
			return result;
		}
		
		public String getPlayer(RugbyPosition position) {
			String result1 = "";
			for(Player player : halfbacks) {
				switch (position) {
				case FLYHALF:
					result1 = (player.getName());
					break; 
				case SCRUMHALF:
					result1 = (player.getName());
					break;
				default:
					result1 = null;
					break;
				} 
				if(player.getPosition() == position) {
					break;	
				}
			}return result1;
		}
		
		public void assignHalfback(Player player) {
			if(player.getPosition() == RugbyPosition.SCRUMHALF) {
				this.halfbacks[0] = player;
				/*if(halfbacks[1] != null) {
					halfbacks[1] = null;
				}*/
			} else if (player.getPosition() == RugbyPosition.FLYHALF) {
				this.halfbacks[1] = player;
				/*if (halfbacks[0] != null) {
					halfbacks[0] = null;
				}*/
			} 
		}
		public String displayElements() {
			StringBuffer result = new StringBuffer();
			int i = 0;
			for(Player player : halfbacks) {
				if (player == null)
				{
					result.append(i + " - " + "\n");
				}
				else
				{
					result.append(i + " - " + player.getName() + " " + player.getPosition() + "\n");
				} i++;
			} 	
			return result.toString();
		}
}
