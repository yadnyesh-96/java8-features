import java.util.function.*;
import java.util.*;
class PredicateInterfaceAPP{
	public static void main(String x[]){
		/* Method - I
		Predicate<Integer> p =new Predicate<>(){
			public boolean test(Integer val){
			 return val%2==0;
			}
		};
		*/
		/*Method -II
		Predicate<Integer> p=(Integer val)->{
				return val%2==0?true:false;
		};
		*/
		
		Predicate<Integer> p = (Integer val) val%2==0?true:false;
		boolean res=p.test(10);
		if(res){
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
	}
}