package com.training.lang;

public class CloneDemo {

	public static void main(String[] args) {
  Student student=new Student("anu", 100);
  System.out.println(student);
  
  Student student1=null;
  
	  try {
		student1=student.clone();
		System.out.println(student1);
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	  System.out.println(student1);
	  System.out.println(student1==student);
	  System.out.println(student1.equals(student));
	  System.out.println(student1.getClass()==student.getClass());
	  
  }
	}


