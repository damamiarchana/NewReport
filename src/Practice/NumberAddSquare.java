package Practice;

import java.util.Scanner;

public class NumberAddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner obj= new Scanner(System.in);
		
		double num;
		System.out.println(" Enter the number");

		
		num =obj.nextDouble();
		
		if(num<100) {
			double square = num *num;
			
			System.out.println(" Square of "+ square);
		}if(num>100)
			
		{
			System.out.println("Add number:"+(num+10));
		}
	}

}
