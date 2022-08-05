package Banking;

public class Account {
	int balance;
	
	void withdraw(int a) {
		balance = balance - a;
		System.out.println("Total balance: " + balance);
	}
	
	void deposit(int b) {
		balance = balance + b;
		System.out.println("Total balance: " + balance);
	}
	
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.deposit(100);
	    acc1.withdraw(5);
	    
	    SavingsAccount acc2 = new SavingsAccount();
	    acc2.balance = 100;
	    acc2.ROI = 0.325;
	    acc2.calculateInterest();
	}
}

class SavingsAccount extends Account{
	double ROI;
	
	void calculateInterest() {
		double total = balance * ROI;
		System.out.println("Total Interest: " + total);
	}
}

class currentAccount extends Account{
	int overDraft;
}
