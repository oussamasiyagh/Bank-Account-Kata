import java.util.ArrayList;

public class Statement {
	private ArrayList<Transaction> transactions;
	
	public Statement() {
		this.transactions = new ArrayList<Transaction>();	
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	public String history(){
		String statement = new String();
		for(int i=0; i < transactions.size(); i++){
			statement += transactions.get(i).printTransactionInfo() + "\n";
		}
		return statement;
	}
}
