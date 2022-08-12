package com.training.userdefined;

public class ATMKiosk {

	public static void main(String[] args) {
		System.out.println("In ATM");
  IdBank idbank=new IdBank(20000);
  
  try {
	idbank.withdraw(10000);
	System.out.println("amount withdrawn succesfully");
} catch (InsufficientBalanceException e) {
	System.out.println(e.getMessage());
} catch (ExceedingLimitException e) {
	System.out.println(e.getMessage());
}
  System.out.println("Bye");
	}
  

}
