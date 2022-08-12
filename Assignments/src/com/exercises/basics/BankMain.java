package com.exercises.basics;

public class BankMain {

	public static void main(String[] args) {
  Account account=new Account(10000);
  account.withdraw(3000);
  account.deposit(5000);
  double balance=account.getBalance();
  System.out.println("balance: "+balance);
  
  Savings savings=new Savings(4000);
  savings.showPlans();
  
	}

}
