package com.sk.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
	
	
	String name;
	int marks;
	public Student(String name,int marks) {
	
		this.name =name;
		this.marks=marks;
	
	}
	public static void main(String[] args) {
		
		Function<Student, String> f=s-> {
			int marks =s.marks;
			String grade="";
			if(marks>=80) grade="A(Dictinction)";
			else if (marks>=60) grade="B(FC)";
			else if (marks>=40) grade="C(SC)";
			else if (marks>=35) grade="D(SC)";
			else  grade="E(Fail)";
			return grade;
			
		};
		Predicate<Student> p=s-> s.marks>=60;
		
		Student[] s = { new Student("sush", 99),
				new Student("nandish", 75),
				new Student("darsh", 55),
				new Student("ashi", 37),
				new Student("loki", 20)
				
		};
			for (Student s1:s)	{
				if (p.test(s1))
				{
				
				System.out.println("Studednt name:"+s1.name);
				System.out.println("Studednt marks:"+s1.marks);
				System.out.println("Studednt name:"+f.apply(s1));
			
				System.out.println();
			}
	}
}
}			
	
	
	


