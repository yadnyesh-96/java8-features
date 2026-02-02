
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamAPIanyMatchAPP{
	public static void main(String x[]){
		List<Integer> ls =Arrays.asList(10,21,30,40,50);
		Stream<Integer> s1 = ls.stream();
		Predicate<Integer> s = new Predicate<Integer>(){
			public boolean test(Integer val){
				return val%2==0;
			}
		};
		
		boolean res = s1.anyMatch(s);
		if(res){
			System.out.println("Condition: Ture");
		}else{
			System.out.println("Condition: False");
		}
	}
}