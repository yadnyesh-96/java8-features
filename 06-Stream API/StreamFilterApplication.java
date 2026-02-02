
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamFilterApplication{
	public static void main(String x[]){
		
		List<Integer> list=List.of(10,11,20,42,15,16,17);
		Stream<Integer> s1 = list.stream();
		Predicate<Integer> p = new Predicate<Integer>(){
			public boolean test(Integer val){
				return val%2==0;
			}
		};
		Stream<Integer> s2=s1.filter(p);
		s2.forEach((val)->System.out.println(val));
	}
}