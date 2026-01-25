
import java.util.function.*;
public class ConsumerInterfaceApp{
	public static void main(String x[]){
		/* Method - I
		
		Consumer<Integer> cm=new Consumer<Integer>(){
			public void accept(Integer val){
				System.out.println("VALUE :"+val);
			}
		};
		cm.accept(100);
		*/
		
		/* Method - IIOByteBuffer
		Consumer<Integer> cm =(Integer val)-> System.out.println("VALUE :"+val);
		cm.accept(200);
		*/
		
		System.out.println(((Consumer<Integer>)(Integer val)->System.out.println(val)).accept(300));
		
	}
}