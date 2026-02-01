
/*
Example: WAP to accept a number as input and calculate its square and return it using a Function interface.
*/

import java.util.*;
import java.util.function.*;

public class FunctionInterfaceAPP{
	public static void main(String x[]){
		/*
		Function<Integer,Integer> f = new Function<Integer,Integer>(){
			public Integer apply(Integer val){
				return val*val;
			}
		};
		
		Integer res = f.apply(10);
		System.out.println("Square is :"+res);
		*/
		/*
		Function<Integer,Integer> f =(Integer val)->val*val;
		
		Integer res = f.apply(10);
		System.out.println("Square is :"+res);
		*/
		
		
		Integer res = ((Function<Integer,Integer>)(Integer val)->val*val).apply(10);
		System.out.println("Square is :"+res);
	}
}