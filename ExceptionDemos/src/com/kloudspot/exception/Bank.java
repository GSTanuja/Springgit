package com.kloudspot.exception;

public class Bank {
	void withdraw(int amount) throws Exception {
		System.out.println("In bank");
		try {
			if(amount>6000) {
				throw new Exception("Exceeded limit");
			}
			System.out.println("Balance amount");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			throw e;
			
		}
		finally {
			System.out.println("close db");
		}
		System.out.println("completed");
}

}
