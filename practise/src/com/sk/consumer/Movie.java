package com.sk.consumer;

import java.util.function.Consumer;

public class Movie {
	String name;
	Movie(String name)
	{
		this.name=name;
		
	}
 public static void main(String[] args) {
	
	 Consumer<Movie> c1= m-> System.out.println(m.name+"rerady to realease");
	 Consumer<Movie> c2= m-> System.out.println(m.name+"rerady to flop");
    Consumer<Movie> c3= m-> System.out.println(m.name+"rerady to rqwer");
    Consumer<Movie> cc =c1.andThen(c2).andThen(c3);
 
    		
    		Movie m = new Movie("kranthi");
            cc.accept(m);
 }
}
