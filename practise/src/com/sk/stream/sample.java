package com.sk.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class sample {
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(25);
		l.add(35);
		
		System.out.println(l);
		
//		List<Integer>l1= l.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(l1);
		
		
		
		List<Integer>l1=l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l1);
	}

}
