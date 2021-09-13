import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
	private String transactionType;
	private double moneyAmount;
	private Date date;
	
	public Transaction(String transactionType, double moneyAmount){
		this.moneyAmount = moneyAmount;
		this.transactionType = transactionType;
		this.date = new Date();
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getMoneyAmount() {
		return moneyAmount;
	}

	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String printTransactionInfo(){
		String transactionInfo = new String();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		transactionInfo = "You have done the following transaction: " + transactionType + " of " + moneyAmount + " at " + dateFormat.format(date);
		return transactionInfo;	
	}
}
