package com.sk.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exam {
	public static void main(String[] args) {
		ArrayList<Integer>marks = new ArrayList<Integer>();
		
		marks.add(70);
		marks.add(90);
		marks.add(80);
		marks.add(10);
		marks.add(30);
		marks.add(20);
		System.out.println(marks);
		long noOfFailedStudent =marks.stream().filter(m->m<35).count();
		System.out.println(noOfFailedStudent);
		
		
		List<Integer>sortedList=marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
