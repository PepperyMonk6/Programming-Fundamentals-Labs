package lab5_exercise2;

public class GasBill {
		private String accountNumber;
		private double amount;
		private Customer customer;
		
		public GasBill(String accountNumber, double amount, Customer customer) {
			if (accountNumber.matches("([0-9]{4})-([0-9]{4})-([0-9]{4})")) {
				this.accountNumber = accountNumber;
			} else {
				this.accountNumber = "Invalid Account";
			}
			this.amount = amount;
			this.customer = customer;
		}
		
		public String getAccountNumber() {
			return this.accountNumber;
		}
		
		public String getCustomer() {
			return this.customer.toString();
		}
		
		public boolean checkAccountAccuracy() {
			if(accountNumber.matches("([0-9]{4})-([0-9]{4})-([0-9]{4})")) {
				return true;
			} else {
				return false;
			}
		}
		
		public String displayAccountDetails() {
			String accountDetails = "";
			accountDetails = "Gas Bill\n" + " Account Number:" + this.accountNumber + "\n" 
			+ " Customer:" + this.customer.getName() + ". " + this.customer.getSurname() + "\n"
			+ " Amount due:" + this.displayAmountDue();
			return accountDetails;
		}
		
		private String displayAmountDue() {
			String dot = "";
			dot = String.format("%.2f", amount);
			dot = dot.replace(",", ".");
			return dot;
		}
}
