package date0132021;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		int z=x+y;
		 x=z-y;
		 y=z-y;
		 System.out.println("x:" + x);
		 System.out.println("y:" + y);
 
			
x=x+y;
y=y-x;
x=x-y;


System.out.println("x:" + x);
System.out.println("y:" + y);


	}

}
