package com.training.util;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.training.custom.Employee;

public class FunDemo {

	public static void main(String[] args) {

		//		Consumer<String> con=(str)->System.out.println(str.toUpperCase());
		//		con.accept("hello");
		//
		//		Consumer<Integer> con1=(num)->System.out.println(num*2);
		//		con1.accept(200);
		//
		//		BiConsumer<String,Integer> bicon=(str,num)->{
		//			System.out.println("Welcome "+str);
		//			System.out.println("Salary is: "+num);
		//		};
		//		bicon.accept("Priya", 100000);
		//
		//		BiConsumer<Integer,Integer> adder=(x,y)->System.out.println("Sum: "+(x+y));
		//		adder.accept(100, 200);
		//
		//		BiConsumer<Integer,Integer> product=(x,y)->System.out.println("product: "+(x*y));
		//		product.accept(120, 220);
		//
		//		Predicate<String> pred=(str)->str.equals("Hello");
		//		System.out.println(pred.test("hello"));
		//
		//		Predicate<Integer> pred1=(num)->num>1000;
		//		System.out.println(pred1.test(3000));
		//
		//		BiPredicate<String,String> bipred=(str1,str2)->str1.equals(str2);
		//		System.out.println(bipred.test("Sri", "Priya"));
		//
		//		Supplier<String> sup=()->"Great day";
		//		System.out.println(sup.get());

		Function<String,String> fun=(String str)->{
			return str.toUpperCase();
		};
		System.out.println(fun.apply("Priya"));

		Function<String,Integer> fun1=(str)->{
			return str.length();
		};
		System.out.println(fun1.apply("Sri"));

		Function<Integer,Integer> fun2=(num)->num*2;
		System.out.println(fun2.apply(10));

		Function<Employee,String> fun3=(employee)->{
			return employee.getName();
		};
		Employee emp=new Employee("Sri",101,300000,"Bangalore");
		System.out.println(fun3.apply(emp));

		Function<Employee,Integer> fun4=(employee)->employee.getEmployeeId();
		System.out.println(emp);

		Function<String,Employee> fun5=(str)->{
			Employee employee=new Employee("Raj", 102, 40000,"Mysore");
			employee.setName(str);
			return employee;
		};
		System.out.println(fun5.apply("Raj"));
	}

}
