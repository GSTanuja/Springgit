package com.training.samples;

import java.util.Arrays;

public class RefDemo {

	public static void main(String[] args) {
		IShow showref=()->{
			return "Welcome to VFISLK";
		};
		System.out.println(showref.print());

		IEmpDetails empdetails=(int amount)->{
			System.out.println("amount: "+(amount*2));

		};
		empdetails.calcBonus(10000);

		IStudentDetails studentref=(int m1,int m2,int m3)->{System.out.println("Total: "+(m1+m2+m3));
		return (m1+m2+m3);
		};
		studentref.calcTotal(20, 30, 50);

		INameChecker nameref=(String name)->{
			if(name.startsWith("J")) {
				return "Welcome "+name;
			}
			return "Sorry";
		};
		System.out.println(nameref.checkName("Janvi"));

		IMetricsChanger metricscref=(double grams)->{
			double kg=grams/1000;
			return kg;
		};
		System.out.println(metricscref.covertGmstoKgs(200));

		Ishape shaperef=(double length)->{
			double area=length*length;
			return area;
		};
		System.out.println(shaperef.areaOfSquare(12));

		ICourseDetails courseref=()->Arrays.asList("Java","JDBC","SQL");
		{
			System.out.println(courseref.showCourses());
		}


	}

}
