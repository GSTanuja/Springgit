package com.training.basics;

public class Bank {
int balance=5000000;

void withdraw(int amount) {
	balance=balance-amount;
	System.out.println(balance);
}
}
