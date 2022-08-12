package com.training.func;

public interface IGreeter {
void add();
void product();
default void greet() {
	System.out.println("Hello");
}
}
interface IChecker{
	void add(int x);
	void cube();
	default void greet() {
		System.out.println("Hello");
}
}

