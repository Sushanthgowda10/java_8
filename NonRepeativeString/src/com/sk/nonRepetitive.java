package com.sk;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class nonRepetitive {
	public static void main(String[] args) {

		System.out.println("  Please  enter  the  input  string  :");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(input);
		Character firstNonRepeatedChar = logic(input);
		System.out.println("The  first  non  repeated  character  is  :    " + firstNonRepeatedChar);
		in.close();
	}

	private static Character logic(String input) {
		// Converts the input string to an IntStream of characters.
		return input.chars() 
				
				//Maps each integer value (representing a character) to a Character object in lowercase.
				.mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) 
					
				
				//Collects the stream into a LinkedHashMap, grouping the characters by their counts.
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a map with the count
				
				//Converts the entrySet of the map to a stream of Map.Entry objects.																								
				.entrySet().stream() 
				
				//Converts the entrySet of the map to a stream of Map.Entry objects.
				.filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey())
				
				//Returns the first non-repeated character as a Character object.
				.findFirst().get();

	}
}
//Please  enter  the  input  string
 

//The  first  non  repeated  character  is  : 


