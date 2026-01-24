
public class Threading_LambdaExpAPP{
	public static void main(String x[]){
		/*	Method - I
		
		Runnable rn = new Runnable(){
			public void run(){
				try{
					for(int i=1; i<=5; i++){
						System.out.println("I = "+i);
						Thread.sleep(1000);
					}
				}catch(Exception ex){
					System.out.println("Error is : "+ex);
				}
			}
		};
		Thread t =new Thread(rn);
		t.start();		
		*/
		
		/*	Method - II
		
		Runnable rn = ()->{
			try{
					for(int i=1; i<=5; i++){
						System.out.println("I = "+i);
						Thread.sleep(1000);
					}
				}catch(Exception ex){
					System.out.println("Error is : "+ex);
				}	
		};
		Thread t =new Thread(rn);
		t.start();
		*/
		
		/*	Method - III
		
		Thread t =new Thread( ()->{
			try{
					for(int i=1; i<=5; i++){
						System.out.println("I = "+i);
						Thread.sleep(1000);
					}
				}catch(Exception ex){
					System.out.println("Error is : "+ex);
				}
		});
		t.start();
		*/
		
		/*	Method - IV
		
		new Thread(()->{
			try{
					for(int i=1; i<=5; i++){
						System.out.println("I = "+i);
						Thread.sleep(1000);
					}
				}catch(Exception ex){
					System.out.println("Error is : "+ex);
				}
		}).start();
		*/
	}
}