

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class OptionalClassAPP{
	public static void main(String x[]){
		Optional<String> o =getName(1);
		if(o.isPresent()){
			o.ifPresent((n)->System.out.println(n.toUpperCase()));
		}else{
			System.out.println("No name found");
		}
	}
	public static Optional getName(int id){
		if(id==1){
			return Optional.of("India");
		}else{
			return Optional.empty();
		}
	}
}