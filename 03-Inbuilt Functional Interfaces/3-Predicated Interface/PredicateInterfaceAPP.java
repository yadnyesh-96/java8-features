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
		/*Method - III
		Predicate<Integer> p = (Integer val)->val%2==0?true:false;
		*/
		/*Method -IV
		boolean res=((Predicate<Integer>)(Integer val)->val%2==0?true:false).test(10);
		*/
		
		/*Method -V
		if(((Predicate<Integer>)(Integer val)->val%2==0?true:false).test(10)){
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
		*/
		/*
		String msg = ((Predicate<Integer>)(Integer val)->val%2==0?true:false).test(11)?"EVEN":"ODD";
		System.out.println(msg);
		*/
		
		System.out.println(((Predicate<Integer>)(Integer val)->val%2==0?true:false).test(11)?"EVEN":"ODD");
	}
}