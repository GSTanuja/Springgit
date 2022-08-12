package com.training.interfaces;

public class Student implements IGames,ICourse{

	@Override
	public String[] webCourses() {
		return new String[] {"HTML","CSS","Javascript"};
	}

	@Override
	public String[] backendCourse() {
		return new String[] {"Java","Spring"};
	}

	@Override
	public void outdoorGames() {
		System.out.println("baseball");
		
	}

	@Override
	public void indoorGames() {
		System.out.println("chess");
		
	}

}
