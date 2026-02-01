
import java.util.function.*;
public class PredicateInterface{
	public static void main(String x[]){
		/* 
		Predicate<Integer> p1 = new Predicate<Integer>(){
			public boolean test(Integer valFirst){
				return valFirst>=10;
			}
		};
		
		Predicate<Integer> p2 = new Predicate<Integer>(){
			public boolean test(Integer valSecond){
				return valSecond<=20;
			}
		};
		
		Predicate<Integer> p3 = p1.and(p2);
		boolean res = p3.test(12);
		if(res){
			System.out.println("Value is greater than 10 and less than 20");
		}else{
			System.out.println("Value is less than equal 10 or greater than 20");
		}
		*/
		
		Predicate<Integer> p1 = (Integer valFirst)->valFirst>=10;
		
		Predicate<Integer> p2 =(Integer valSecond)->valSecond<=20;
		
		Predicate<Integer> p3 = p1.and(p2);
		boolean res = p3.test(12);
		if(res){
			System.out.println("Value is greater than 10 and less than 20");
		}else{
			System.out.println("Value is less than equal 10 or greater than 20");
		}
	}
}