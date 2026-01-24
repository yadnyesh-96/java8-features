@FunctionalInterface
interface Square{
	int get_Square(int no); // public abstract void 
}

public class SquareApp{
	public static void main(String x[]){
		
		/* Method = I ( Anonymous inner class )
		
		Square sq=new Square(){
			public int get_Square(int no){
				return no*no;
			}
		};
		
		int res = sq.get_Square(5);
		System.out.println("Square is : "+res); // Square is : 25
		*/
		
		
		/*  Method = II ( Using Lambda expression format )
		
		Square sq = (int no) ->{ return no*no;};
		int res = sq.get_Square(6);
		System.out.println("Square is : "+res); // Square is : 36
		*/
		
		/* Method = III ( Using Lambda Expression Format )
		Square sq = (int no) -> no*no;
		int res = sq.get_Square(7);
		System.out.println("Square is : "+res); // Square is : 49
		*/
		
		/*
		{  Method = IV ( Using Lambda Expression Format )
			int res = ((Square)(int no)->no*no).get_Square(8); 
			System.out.println("Square is : "+res); // Square is : 64
		}
		*/
	}
}