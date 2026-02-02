
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamAPIallMatchAPP{
	public static void main(String x[]){
		
		List<Integer> ls = Arrays.asList(11,22,31,41,51);
		Stream<Integer> s = ls.stream();
		Predicate<Integer> p = new Predicate<Integer>(){
			public boolean test(Integer val){
				return val%2==0;
			}
		};
		
		boolean res = s.allMatch(p);
		if(res){
			System.out.println("Condition: Ture");
		}else{
			System.out.println("Condition: False");
		}
	}
}