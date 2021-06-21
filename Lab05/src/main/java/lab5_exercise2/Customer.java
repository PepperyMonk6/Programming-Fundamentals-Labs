package lab5_exercise2;

public class Customer {
		private String name;
		private String surname;
		
		public Customer() {
			this.name = "";
			this.surname = "";
		}
		
		public Customer(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}
		
		public char getName() {
			return this.name.charAt(0);
		}
		
		public String getSurname() {
			return this.surname;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setSurname(String surname) {
			this.surname = surname;
		}
		
		@Override
		public String toString() {
			return this.getName() + ". " + this.getSurname();
		}
}
