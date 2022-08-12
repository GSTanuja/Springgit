package com.kloudspot.exception;

public class ATMDemo {

	public static void main(String[] args) {
   System.out.println("In ATM");
   Bank bank=new Bank();
   try {
	   bank.withdraw(8000);
   }
   catch(Exception e) {
	   e.printStackTrace();
   }
   System.out.println("Amount withdrawn");
   System.out.println("Good bye");
	}

}
