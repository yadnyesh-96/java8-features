
import java.util.function.*;
public class ConsumerInterfaceApp{
	public static void main(String x[]){
		
		Consumer<Integer> cm=new Consumer<Integer>(){
			public void accept(Integer val){
				System.out.println("VALUE :"+val);
			}
		};
		
		cm.accept(100);
	}
}