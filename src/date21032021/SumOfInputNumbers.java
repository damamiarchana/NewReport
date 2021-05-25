package date21032021;

import java.util.Scanner;

public class SumOfInputNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int sum=0;	
		Scanner obj=new Scanner(System.in);
		
		
		for(int i=0;i<10;i++) {
			
			
			System.out.println("Enter the sum of number");
			
			
			int num=obj.nextInt();
			
			sum=sum+sum;
		}
		
		System.out.println("sum of the number is:"+sum);
	

	}

}
