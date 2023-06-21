package com.sk;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeativealll {
	public static void main(String[] args) {

		System.out.println("  Please  enter  the  input  string  :");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(input);
		Stream<Object> firstNonRepeatedChar = logic("sushanth");
		firstNonRepeatedChar.forEach(System.out::println);
		System.out.println(
				"The  first  non  repeated  character  is  :    " + firstNonRepeatedChar);
		in.close();
	}

	private static Stream<Object> logic(String input) {
		return input.chars() // string stream
				.mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) // convert to lowercase & then to
																					// Character object

				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store
																												// in a
																												// map
																												// with
																												// the
																												// count

				.entrySet().stream() // entryset stream
				.filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey());

	}
}



