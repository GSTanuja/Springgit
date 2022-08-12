package com.training.interfaces;

public class User implements IGames {

	@Override
	public void outdoorGames() {
		System.out.println("football");
		System.out.println("cricket");
	}

	@Override
	public void indoorGames() {
		System.out.println("Table Tennis");
		System.out.println("Chess");

	}

}
