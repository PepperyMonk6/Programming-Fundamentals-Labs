package lab6_exercise3;

public enum Countries {
		CANADA(1, false), CHINA(2, false), RUSSIA(3, false), BRITAIN(4, true), FRANCE(5, true);
		
		private int index;
		private boolean isEU;
		
		private Countries(int index, boolean isEU) {
			this.index = index;
			this.isEU = isEU;
		}
 		
		public int getIndex() {
			return this.index;
		}
		
		public boolean isEU() {
			return this.isEU;
		}
		
		public Countries[] orderedCountries() {
				// Use the index as an array index.
				Countries[] output =new Countries[Countries.values().length];
				for(Countries country : Countries.values()) {
					output [country.getIndex()] = country;
					}
				return output;
			}
		}
