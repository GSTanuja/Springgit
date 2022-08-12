package com.training.samples;

import java.util.List;

public interface IShow {
	
  String print(); //return a welcome message
}

interface IEmpDetails{
	void calcBonus(int amount); //return the amount
}

interface IStudentDetails{
	int calcTotal(int m1,int m2,int m3); //return the sum
}

interface INameChecker{
	//if name starts with "j" return welcome name else return sorry
	String checkName(String name);
}

interface IMetricsChanger{
	double covertGmstoKgs(double grams);
}

interface Ishape{
	double areaOfSquare(double length);
}

interface ICourseDetails{
	List<String> showCourses();
}
