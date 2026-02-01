//Example: WAP to calculate square of 10 and multiply it by 100

import java.util.*;
import java.util.function.*;

public class FunctionInterfaceandThen{
	public static void main(String x[]){
		/*
		Function<Integer,Integer> f =(Integer val)->val*val;
		
		Function<Integer,Integer> f1 = new Function<Integer,Integer>(){
			public Integer apply(Integer res){
				return res*100;
			}
		};
		
		Function<Integer,Integer> f2 = f.andThen(f1);
		Integer result = f2.apply(10);
		System.out.println("Final Result is:"+result);
		*/
		/*
		Function<Integer,Integer> f =(Integer val)->val*val;
		
		Function<Integer,Integer> f1 =(Integer res)->res*100;
		
		Function<Integer,Integer> f2 = f.andThen(f1);
		Integer result = f2.apply(10);
		System.out.println("Final Result is:"+result);
		*/
		
		
		
		Function<Integer,Integer> f2 = ((Function<Integer,Integer>)(Integer val)->val*val).andThen(((Function<Integer,Integer>)(Integer res)->res*100));
		Integer result = f2.apply(10);
		System.out.println("Final Result is:"+result);
	}
}