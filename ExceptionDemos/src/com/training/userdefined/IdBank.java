package com.training.userdefined;

public class IdBank {
	double balance;

	public IdBank(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(int amount) throws InsufficientBalanceException,ExceedingLimitException {
		try {
		if(amount>balance) {
			throw new InsufficientBalanceException("Amount>than balance");
		}
		if(amount>10000) {
			throw new ExceedingLimitException("Exceeding day limits");
		}
		else {
			balance=balance-amount;
			System.out.println("Amount withdrawn");
			System.out.println("Balance is "+balance);
		}
	}catch (Exception e) {
		System.out.println("exception "+e);
		throw e;
	}
		finally {
			System.out.println("close");
		}
		System.out.println("completed");
	}

}
