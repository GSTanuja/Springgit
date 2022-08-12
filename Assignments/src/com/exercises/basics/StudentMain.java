package com.exercises.basics;

public class StudentMain {

	public static void main(String[] args) {
    Student student = new Student("ram", "EEE");
    Student nstudent=new Student("sham","CSE");
	student.printDetails();
	int kmarks[]= {90,80,78,65,52,98};
	System.out.println(student.getGrade(kmarks));
	
	System.out.println();
	nstudent.printDetails();
	int[] amarks= {10,30,79,72,68,34};
	System.out.println(student.getGrade(amarks));
	
	}
	
	}


