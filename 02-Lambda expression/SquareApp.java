@FunctionalInterface
interface Square{
	int get_Square(int no); // public abstract void 
}

public class SquareApp{
	public static void main(String x[]){
		Square sq=new Square(){
			public int get_Square(int no){
				return no*no;
			}
		};
		
		int res = sq.get_Square(5);
		System.out.println("Square is : "+res);

	}
}