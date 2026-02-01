/*
Example: WAP to create Collection and store 10 values in it and find only even values from collection 
*/

import java.util.*;
import java.util.function.*;
public class ListApp{
	public static void main(String x[]){
		
		/*
		List<Integer> ls =List.of(1,2,4,6,7,9,12,14,16,19);
		Predicate<Integer> p1 = new Predicate<Integer>(){
			public boolean test(Integer val){
				return val%2==0;
			}
		};
		Consumer<Integer> c = new Consumer<Integer>(){
			public void accept(Integer val){
				if(p1.test(val)){
					System.out.println(val);
				}
			}	
		};
		ls.forEach(c);
		*/
		/*
		List<Integer> ls =List.of(1,2,4,6,7,9,12,14,16,19);
		Predicate<Integer> p1 =(Integer val)->val%2==0;
		
		Consumer<Integer> c = (Integer val)->
				{if(p1.test(val)){
					System.out.println(val);
				}	
		};
		ls.forEach(c);
		*/
		
		/*
		List<Integer> ls =List.of(1,2,4,6,7,9,12,14,16,19);
		
		Consumer<Integer> c = (Integer val1)->
				{if(((Predicate<Integer>)(Integer val)->val%2==0).test(val1)){
					System.out.println(val1);
				}	
		};
		ls.forEach(c);
		*/
		
		/*
		List<Integer> ls =List.of(1,2,4,6,7,9,12,14,16,19);
		
		ls.forEach((Integer val1)->
				{if(((Predicate<Integer>)(Integer val)->val%2==0).test(val1)){
					System.out.println(val1);
				}	
		});
		*/
		
		
		List.of(1,2,4,6,7,9,12,14,16,19).forEach((Integer val1)->
				{if(((Predicate<Integer>)(Integer val)->val%2==0).test(val1)){
					System.out.println(val1);
				}	
		});
		
	}
}