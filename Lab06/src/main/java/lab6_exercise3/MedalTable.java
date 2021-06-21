package lab6_exercise3;

public class MedalTable {
		private int[][] medals;
		
		public MedalTable() {
			this.medals = new  int[Countries.values().length][Medals.values().length];
			for(int i = 0; i < Countries.values().length; i++) {
				for (int j = 0; j < Medals.values().length; j++) {
					this.medals[i][j] = 0;
				}
			}
		}
		
		public void addMedal(Countries countries, Medals medals) {
			int i = countries.getIndex();
			int j = medals.getIndex();
			this.medals[i - 1][j] += 1;
		}
		
		public int getEUMedalCount() {
			int euMedals = 0;
			for (int i = 0; i < Countries.values().length; i++) {
				if(Countries.values()[i].isEU()) {
					for(int j = 0; j < Medals.values().length; j++) {
						euMedals += this.medals[i][j];
					}
				}
			}
			return euMedals;
		}
		
		public int getMedals(Countries countries, Medals medals) {
			return this.medals[countries.getIndex() - 1][medals.getIndex()];
		}
		
		@Override
		public String toString() {
			String finalResult = "";
			for(int i = 0; i < Countries.values().length; i++) {
				finalResult += "\n" + Countries.values()[i] + ": " + "\n";
				for(int j = 0; j < Medals.values().length; j++) {
					finalResult += Medals.values()[j]+ " " + Integer.toString(this.medals[i][j]) + "\n";
				}
			}
			return finalResult;
		}
}