
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class StreamAPILongcountAPP{
	public static void main(String x[]){
		/*
		List<Integer> ls = Arrays.asList(10,20,30,40,50);
		Stream<Integer> s1 = ls.stream();
		long c = s1.count();
		System.out.println("Number of Element is::"+c);
		*/
		
		
		System.out.println("Number of Element is::"+
			Arrays.asList(10,20,30,40,50).
					stream().
						count()
		);
	}
}