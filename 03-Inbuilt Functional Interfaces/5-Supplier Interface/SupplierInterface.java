
import java.util.*;
import java.util.function.*;
public class SupplierInterface{
	public static void main(String x[]){
		/*
		Supplier<Date> s = new Supplier<Date>(){
				public Date get(){
					return new Date();
				}
		};
		Date sysDate= s.get();
		System.out.println(sysDate);
		*/
		
		Supplier<Date> s = ()-> new Date();
		Date sysDate= s.get();
		System.out.println(sysDate);
	}
}