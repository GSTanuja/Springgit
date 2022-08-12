package com.training.func;

public class MyCheck implements IGreeter, IChecker {

	@Override
	public void cube() {

	}

	@Override
	public void add() {
		System.out.println("adding");
	}

	@Override
	public void add(int x) {
		
	}

	@Override
	public void product() {

	}
	@Override
	public void greet() {
		IChecker.super.greet();
		IGreeter.super.greet();
		System.out.println("my greetings in class");
	}

	public static void main(String[] args) {
		IGreeter ref=new MyCheck();
		ref.add();
		ref.greet();

	}

}
