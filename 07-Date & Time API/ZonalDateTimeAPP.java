
import java.time.*;

public class ZonalDateTimeAPP{
	public static void main(String x[]){
		ZonedDateTime zd = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime zd1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		
		System.out.println(zd);
		System.out.println(zd1);
		
	}
}