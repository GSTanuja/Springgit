package com.exercises.basics;

public class Student {
	String name;
	String department;

	Student(String name,String department) {
		this.name=name;
		this.department=department;
	}

	void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("department: "+department);
	}
	String getGrade(int[] marks) {
		int sum=0,avg=0;

		for(int m:marks) {
			sum+=m;
		}
		avg=sum/marks.length;
		String grade=null;

		if(avg>=80) {
			grade="A";
		}
		else if(avg>=60) {
			grade="B";
		}
		else if(avg>=35) {
			grade="C";
		}
		else {
			grade="D";
		}
		return "your grade is:"+grade;

	}
}