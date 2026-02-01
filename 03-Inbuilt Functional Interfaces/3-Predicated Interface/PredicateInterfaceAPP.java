
inport java.util.*;
class PredicateInterfaceAPP{
	public static void main(String x[]){
		
		Predicate<Integer> p =new Predicate<>(){
			public boolean test(Integer val){
			 return val%2==0;
			}
		};
		
		boolean res=p.test(10);
		if(res){
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
	}
}