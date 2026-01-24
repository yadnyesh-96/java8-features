@FunctionalInterface
interface Square<T>{
	T get_Square(T no); // public abstract T get_Square();
}

public class Interface_genericApp{
	public static void main(String x[]){
		
		/*	Method = I ( Anonymous inner class ) with generics 
		
		Square<Float>sq=new Square<Float>(){
			public Float get_Square(Float no){
				return no*no;
			}
		};
		float res = sq.get_Square(5.5f);
		System.out.println("Square is : "+res); // Square is : 30.25
		*/
		
		/*	Method = II ( Using Lambda expression format ) with generics
		
		Square<Float>sq = (Float no) ->{ return no*no;};
		float res = sq.get_Square(6.5f);
		System.out.println("Square is : "+res);	// Square is : 42.25
		*/
	}
}