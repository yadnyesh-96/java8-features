// Example: WAP to create collection and store values in it and find the even values   and display it.

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamFilterApplication{
	public static void main(String x[]){
		
		/*
		List<Integer> list=List.of(10,11,20,42,15,16,17);
		Stream<Integer> s1 = list.stream();
		Predicate<Integer> p = new Predicate<Integer>(){
			public boolean test(Integer val){
				return val%2==0;
			}
		};
		Stream<Integer> s2=s1.filter(p);
		s2.forEach((val)->System.out.println(val));
		*/
		
		/*
		Stream<Integer> s1 = List.of(10,11,20,42,15,16,17).stream();
		Predicate<Integer> p =(Integer val)->val%2==0;

		Stream<Integer> s2=s1.filter(p);
		s2.forEach((val)->System.out.println(val));
		*/
		
		Stream<Integer> s1 = List.of(10,11,20,42,15,16,17).stream();
		

		Stream<Integer> s2=s1.filter((Integer val)->val%2==0);
		s2.forEach((val)->System.out.println(val));
	}
}