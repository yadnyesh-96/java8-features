
import java.time.*;
public class LocalDateAPP{

	public static void main(String x[]){
		LocalDate today = LocalDate.now();
		LocalDate date = LocalDate.of(1998,5,10); // YY-MM-DD
		
		System.out.println(today);
		System.out.println(date);
	}
}