
import java.util.*;
import java.util.function.*;
public class SupplierInterfaceRandom{
	public static void main(String x[]){
		/*
		Supplier<Integer> s = new Supplier<Integer>(){
			public Integer get(){
				return new Random().nextInt(100);
			}
		};
		System.out.println(s.get());
		*/
		/*
		Supplier<Integer> s = ()->new Random().nextInt(100);

		System.out.println(s.get());
		*/
		
		

		System.out.println(((Supplier<Integer>)()->new Random().nextInt(100)).get());
		
	}
}	