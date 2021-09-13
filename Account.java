public class Account {
	private double balance;
	private Statement statement;
	private double maxBalance;
	private double minBalance;
	
	public Account() {
		this.balance = 0;
		this.statement = new Statement();
		this.maxBalance = 10000;
		this.minBalance = 0;
	}
	
	public void withdrawal(double moneyAmount) {
		if( (balance - moneyAmount) >= minBalance ){
			Transaction transaction = new Transaction("withdrawal", moneyAmount);
			statement.addTransaction(transaction);
			balance -= moneyAmount;
			System.out.println("Transaction Successful!");
		}
		else {
			System.out.println("Transaction Impossible! your balance is lower than the amount you want to retrieve");
			System.out.println("You current balance: " + balance);
		}
	}
	
	public void deposit(double moneyAmount) {
		if( (balance + moneyAmount ) <= maxBalance ){
			Transaction transaction = new Transaction("deposit", moneyAmount);
			statement.addTransaction(transaction);
			balance += moneyAmount;
			System.out.println("Transaction Successful!");
		}
		else{
			System.out.println("Transaction Impossible! you have surpassed your maximum allowed balance which is: " + maxBalance);
			System.out.println("You current balance: " + balance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void  printHistory() {
		System.out.println("Here is the history of your transactions: \n" + statement.history() + "\n Your current balance is: " + balance);	
	}
}
