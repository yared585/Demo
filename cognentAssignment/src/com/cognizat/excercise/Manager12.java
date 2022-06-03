package com.cognizat.excercise;

class BankAccount{
	
	String acHolder;
	int balance;
	public BankAccount(String acHolder, int balance) {
		
		this.acHolder = acHolder;
		this.balance = balance;
	}
	
	void withdraw(int amt) {
		
		System.out.println("Current Balacne is "+ balance);
		if(amt <= balance) {
			balance = balance -amt;
			System.out.println("Please collect your cash. Remaining amount is "+ balance);
		}else {
			
			throw new InsufficientBalanceException( "  insufficienct Fund  " );
		}
	}
	
	
}

public class Manager12 {
	public static void main(String[] args) {
		
		BankAccount ac1 = new BankAccount("Yared" , 1000);
		
		ac1.withdraw(10000);
	}

}
