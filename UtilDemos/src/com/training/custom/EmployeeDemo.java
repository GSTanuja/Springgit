package com.training.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {

		List<Employee> employeeList=new ArrayList<Employee>();
		Employee employee1=new Employee("Priya",302077,45000.00,"Banglore");
		Employee employee2=new Employee("kavya",302078,55000.00,"Manglore");
		Employee employee3=new Employee("Arya",302079,35000.00,"Bellary");
		Employee employee4=new Employee("Tanu",302080,65000.00,"Chennai");
		Employee employee5=new Employee("Anu",302081,75000.00,"Hyderbad");

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);

		System.out.println(employeeList);
		List<Employee> employeeByCity=new ArrayList<>();
		for(Employee employee:employeeList) {
			
			if(employee.getCity().equalsIgnoreCase("Bangalore")) {
				employeeByCity.add(employee);


			}
		}
		for (Employee employee : employeeByCity) {
			System.out.println(employee);

		}

	}

}


