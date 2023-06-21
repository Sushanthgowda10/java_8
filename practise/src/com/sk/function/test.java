package com.sk.function;

import java.util.function.Function;

public class test {
	public static void main(String[] args) {
//		Function<Integer, Integer> f =i ->i*i;
//		System.out.println(f.apply(4));
//		
//	}
		
		
		
	//	Function<String, Integer> f=s ->s.length();
	//System.out.println(f.apply("ashik"));
//}
		
		Function<Integer, Integer> f1 =i ->2*i;
		Function<Integer, Integer> f2 =i ->i*i*i;
		System.out.println(f1.andThen(f2).apply(4));
		System.out.println(f1.compose(f2).apply(4));
		
		
	}		
		
}