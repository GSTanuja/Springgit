package com.training.interfaces;

public class InterMain {

	public static void main(String[] args) {
		IGames gamer=new User();
		gamer.indoorGames();
		gamer.outdoorGames();
		
		gamer=new Student();
		gamer.indoorGames();
		gamer.outdoorGames();
		
		//ICourse courses=new Student();
		ICourse courses=(ICourse) gamer;
		String[] bcourses=courses.backendCourse();
		for(String courseName:bcourses) {
			System.out.println(courseName);
		}
		String[] wcourses=courses.webCourses();
		for(String courseName:wcourses) {
			System.out.println(courseName);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
				
		
	}

}
