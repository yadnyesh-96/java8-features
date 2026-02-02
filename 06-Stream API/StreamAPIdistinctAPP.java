
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class StreamAPIdistinctAPP{
	public static void main(String x[]){
		
		List<Integer> ls=Array.asList(10,10,20,30,44,40,40,15,50,50,50);
		
		Stream<Integer> s1 = ls.stream();
		Stream<Integer> s2 = s1.distinct();
		s2.forEach((val)->System.out.println(va));
	}
}