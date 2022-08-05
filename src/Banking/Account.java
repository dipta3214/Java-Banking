package Banking;

public class Account {
	int balance;
	
	Account(int balance){
		this.balance = balance;
	}
	
	void withdraw(int a) {
		balance = balance - a;
		System.out.println("Total balance: " + balance);
	}
	
	void deposit(int b) {
		balance = balance + b;
		System.out.println("Total balance: " + balance);
	}
	
	public static void main(String[] args) {
		Account acc1 = new SavingsAccount(100);
		acc1.deposit(100);
	    acc1.withdraw(5);
	    
	    Account acc2 = new currentAccount(100);
	    
	}
}

class SavingsAccount extends Account{
	
	double ROI;
	
	SavingsAccount(int balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	
	
	
	void calculateInterest() {
		double total = balance * ROI;
		System.out.println("Total Interest: " + total);
	}
}

class currentAccount extends Account{
	int overDraft;
	
	currentAccount(int balance){
		super(balance);
	}
}
