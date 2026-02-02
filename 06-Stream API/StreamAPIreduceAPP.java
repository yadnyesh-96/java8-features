
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamAPIreduceAPP{
	public static void main(String x[]){
		
		/*
		List<Integer> ls =Arrays.asList(10,10,20,30,10,20,30,40,50,50,50);
		Stream<Integer> s1 = ls.stream();
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>(){
			public Integer apply(Integer val1, Integer val2){
				return val1+val2;
			}
		};
		
		Integer res = s1.reduce(0,b);
		System.out.println(res);
		*/
		
		System.out.println(
		Arrays.asList(10,10,20,30,10,20,30,40,50,50,50).		
			stream().
				reduce(0,((BinaryOperator<Integer> )
						(Integer val1, Integer val2)-> val1+val2))
		);
	}
}