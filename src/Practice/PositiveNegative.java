package Practice;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		
		Scanner  sc= new Scanner(System.in);

		System.out.println("Enter the number");
		
		num=sc.nextInt();
		
		if(num>0) {
			
			
			System.out.println("Enetred the number is positive");
		}else if(num<0) {
			
			
			
			System.out.println("Entered the number is negative" );
			
			
		} else {
			System.out.println("If its Positive or negative  print the message");
	}


	}

}
