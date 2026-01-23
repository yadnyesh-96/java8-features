@FunctionalInterface
interface ABC{
	void show(); // public abstract void show();
}

public class AnonymApplication{
	public static void main(String x[]){
		ABC ab=new ABC(){  // created here anonymous class 
			public void show(){
				System.out.println("I am Show from Anonymous class");
			}
		};
		ab.show();
	}
}