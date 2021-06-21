package lab7_exercise3;

public class Module {
		private String name;
		String regExp = "([A-Z]{3})([0-9]{4})";
		
		public Module(String name) {
			this.name = name;
		}
		
		public String getName() {
			if (name.matches(regExp)) {
				return this.name;
			}	else {
				return "Error"; 
			}
		}
		
		@Override
		public String toString() {
			return this.name;
		}
}
