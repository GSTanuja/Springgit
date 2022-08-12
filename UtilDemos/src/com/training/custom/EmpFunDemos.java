package com.training.custom;
import java.util.function.Predicate;

import com.training.custom.Employee;

public class EmpFunDemos {
		
		public static void main(String[] args) {
	   Predicate<String> pred=(str)->str.equals("hello");
	   System.out.println(pred.test("Hello"));
	   
	   Predicate<Employee> empPredicate=(Employee emp)->{
		   if(emp.getCity().equals("Bangalore"))
			   return true;
		   return false;
	   };
	   Employee emp1=new Employee("Ram",200,10000, "Bangalore");
	   System.out.println(empPredicate.test(emp1));
		
		}
	}



