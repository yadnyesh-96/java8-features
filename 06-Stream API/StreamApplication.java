
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class StreamApplication{
	public static void main(String x[]){
		/*
		List<Integer>list=List.of(10,20,30,40,50);
		Stream<Integer> s = list.stream();
		Function<Integer,Integer> s1 = new Function<Integer,Integer>(){
				public Integer apply(Integer v){
					return v*v;
				}
		};		
		Stream<Integer>s2=s.map(s1);
		Consumer<Integer> c = new Consumer<Integer>(){
			public void accept(Integer v){
				System.out.println(v);
			}
		};
		s2.forEach(c);
		*/
		
		/*
		List<Integer>list=List.of(10,20,30,40,50);
		Stream<Integer> s = list.stream();
		Function<Integer,Integer> s1 =(Integer v)-> v*v;
		
		Stream<Integer>s2=s.map(s1);
		Consumer<Integer> c = (Integer v)->System.out.println(v);
		s2.forEach(c);
		*/
		
		/*	Stream<Integer>s2=List.of(10,20,30,40,50).stream().map(((Function<Integer,Integer>)(Integer v)-> v*v));
		Consumer<Integer> c = (Integer v)->System.out.println(v);
		s2.forEach(c);
		*/
		
		List.of(10,20,30,40,50).stream().map(((Function<Integer,Integer>)(Integer v)-> v*v)).forEach((Integer v)->System.out.println(v));
	}
}