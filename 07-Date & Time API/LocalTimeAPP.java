
import java.time.*;
public class LocalTimeAPP{
	public static void main(String x[]){
		LocalTime t = LocalTime.now();
		LocalTime m = LocalTime.of(10,20,30);
		
		System.out.println(t);
		System.out.println(m);
	}
}