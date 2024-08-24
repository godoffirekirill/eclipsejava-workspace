package bank_account;

public class AccountAppl {

	public static void main(String[] args) {
		
		BankAccount[] bank = {
			new BankAccount(124578, "Piter", "Leumi", 100, 200.)	,
			new BankAccount(111222333, "Mariya", "Leumi", 111),
			new BankAccount(44455566, "Discount", 400, 100500.),
			new BankAccount(77788844, "Zero", 56)
		};

		for (int i = 0; i < bank.length; i++) {
			bank[i].display();
		}
		System.out.println();
		
		bank[0].display(false);
	}

}
