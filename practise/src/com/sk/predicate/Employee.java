package com.sk.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
	
		String name;
		double salary;
		Employee(String name,double salary)
		{
			this.name=name;
			this.salary=salary;
		}
		public static void main(String[] args) {
			
		ArrayList<Employee> l= new ArrayList<Employee>();
		l.add(new Employee ("sush",1000));
		l.add(new Employee ("raj",5000));
		
		l.add(new Employee ("manish",3000));
		
		Predicate<Employee> p=e-> e.salary>2000;
		for(Employee e1 : l)
		{
			if(p.test(e1))
			{
				System.out.println(e1.name+":"+e1.salary);
			}
		}
		
			
		}
			
		}
	
 

