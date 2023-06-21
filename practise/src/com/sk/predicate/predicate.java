package com.sk.predicate;

import java.util.function.Predicate;

public class predicate {
	public static void main(String[] args) {

		//Predicate<Integer> p1= i->i%2==0;
		//System.out.println(p1.test(10));
		//System.out.println(p1.test(11));
		
		
		//Predicate<Employee> p1=e->e.salary>10000 && e.isHavingGf==true;
		//System.out.println(p1.test(e));
		
//	
//	String[] s = {"ashik","Nandish","sanjaubannigon","sus"};
//	Predicate<String> p=s1->s1.length()>5;
//	for (String s1 : s)
//	{
//		if(p.test(s1))
//		{
//	System.out.println(s1);
//}
//	}
		
		
	//and().or(),negate()	
		int[] x = {0,5,7,111,333,20,30,40,33};
		Predicate<Integer> p1 =i->i%2==0;
		Predicate<Integer>p2 = i-> i>10;
		System.out.println("The number which are even and > 10are:");
				
		for(int x1 : x)
		{
			if(p1.and(p2).test(x1));
			
			{
		System.out.println(x1);
			
		}
				
	
}	
	}

}
		
		
		
		
	
		
		
		
		
		
		
