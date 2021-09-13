
public class Main {

	public static void main(String[] args) {
		
		Account client = new Account();
		client.withdrawal(2000);
		client.deposit(12400);
		client.deposit(5000);
		client.withdrawal(300);
		client.withdrawal(10);
		client.printHistory();
	}

}
