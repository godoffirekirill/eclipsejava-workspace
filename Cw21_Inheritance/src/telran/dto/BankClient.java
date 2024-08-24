package telran.dto;

public class BankClient extends Person {
	double amount;

	public BankClient(double amount) {
		super();
		this.amount = amount;
	}
	

	public BankClient(String name, int age, double amount) {
		super(name, age);
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "BankClient [amount=" + amount + ", name=" + name + "]";
	}
	
	
	
}
