package com.training.abstraction;

public class AbsMain {

	public static void main(String[] args) {
     Bank bank=new Branch1();
     bank.carLoan();
     bank.eductionLoan();
     bank.houseLoan();
     bank.admin();
     
     Branch1 branch=(Branch1)bank;
     branch.branchDetails();
     
     bank=new Subbranch();
     bank.carLoan();
     bank.eductionLoan();
     bank.houseLoan();
     bank.admin();
     
     Branch2 sub=(Branch2)bank;
     sub.loanDetails();  //using same class ref
     
     Subbranch subbranch=(Subbranch)bank;
     subbranch.loanDetails();  //using subclass ref
     subbranch.termPlans(); //own method of sub
	}

}
