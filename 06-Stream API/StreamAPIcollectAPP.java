
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamAPIcollectAPP{
	public static void main(String x[]){
		
		List<Integer> list =Arrays.asList(10,10,20,30,10,20,30,40,50,50,50);
		Stream<Integer> s1 = list.stream();
		Stream<Integer> s2 = s1.distinct();
		List<Integer> res = s2.collect(Collection.toList());
		res.forEach((val)->System.out.println(val));
	}
}