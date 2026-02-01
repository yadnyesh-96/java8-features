/*
 public default Function<V, R> compose(Function<? super V, ? extends T>):  compose function is used for process first on parameter function and pass its result to calling function
*/

import java.util.*;
import java.util.function.*;

public class FunctionInterfacecompose{
	static int count=0;
	public static void main(String x[]){
		
		Function<Integer,Integer> f = new Function<Integer,Integer>(){
			public Integer apply(Integer val){
				++count;
				System.out.println("Calling count from First");
				return val*val;
			}
		};
		
		Function<Integer,Integer> f1 = new Function<Integer,Integer>(){
			public Integer apply(Integer res){
				++count;
				System.out.println("Calling Count from Second"+count);
				return res*100;
			}
		};
		
		Function<Integer,Integer> f2 = f.compose(f2);
		Integer result = f2.apply(10);
		System.out.println("Final result is "+result);
	}
}
