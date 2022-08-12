package com.exercises.basics;

public class Account {
double balance;

public Account(double balance) {
	
	this.balance = balance;
}
void withdraw(double amount) {
	if(balance>amount) {
	balance=balance-amount;
	System.out.println("available balance: "+balance);
}
	else {
		System.out.println("insufficient balance");
	}
}
void deposit(double amount) {
	balance=balance+amount;
	System.out.println("total balance: "+balance);
}
double getBalance() {
	return balance;
}
}
