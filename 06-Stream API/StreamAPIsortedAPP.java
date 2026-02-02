
import java.util.*;
import java.util.stream.*;
public class StreamAPIsortedAPP{
	public static void main(String x[]){
		
		List<Integer> list =Arrays.asList(5,9,2,3,1);
		Stream<Integer> s1 = list.stream();
		Stream<Integer> s2 = s1.sorted();
		s2.forEach((e)->System.out.println(e));	
	}
}