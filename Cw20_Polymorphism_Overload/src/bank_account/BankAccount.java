package bank_account;

public class BankAccount {
	private long account;
	private String owner;
	private String bank;
	private int branch;
	private double amount;
	
	public BankAccount() {}

	public BankAccount(long account, String owner, String bank, int branch, double amount) {
		
		this.account = account;
		this.owner = owner;
		this.bank = bank;
		this.branch = branch;
		this.amount = amount + 300;
	}

	public BankAccount(long account, String owner, String bank, int branch) {

		this.account = account;
		this.owner = owner;
		this.bank = bank;
		this.branch = branch;
		amount = 100;
	}

	public BankAccount(long account, String bank, int branch, double amount) {
		super();
		this.account = account;
		this.bank = bank;
		this.branch = branch;
		this.amount = amount;
	}

	public BankAccount(long account, String bank, int branch) {
		super();
		this.account = account;
		this.bank = bank;
		this.branch = branch;
	}

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}

	public double getAmount() {
		return amount;
	}

//	public void setAmount(double amount) {
//		this.amount = amount;
//	}
	
	public boolean deposit(double sum) {
		if(sum <= 0 )
			return false;
		amount += sum;
		return true;
	}
	
	public boolean withdraw(double sum) {
		if(sum <=0 || sum > amount)
			return false;
		amount -= sum;
		return true;
	}
	
	public void display() {
		String str;
		boolean check = owner != null;
		if(check)
			str = owner;
		else str = "Anonimous";
		
		System.out.println("Owner: " + str + " Account: " + account + " Bank: " + bank + " Branch: " + branch );
	}
	
	public void display(boolean gender) {
		String str;
		if(gender)
			str = "Dear Mrs. ";
		else
			str = "Dear Mr. ";
			
			
		boolean check = owner != null;
		if(check)
			str += owner;
		else str += "Anonimous";
		
		System.out.println( str + " Account: " + account + " Bank: " + bank + " Branch: " + branch );
	
	}
	
	
	
	
	
	
}
