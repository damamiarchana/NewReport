package date21032021;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=obj.nextInt();
		
		int reverse=0;
		int temp;
		int orignNum=number;
		
		while(number>=1) {
			
			
			
			temp=number%10;
			reverse=reverse*10+temp;
			number=number/10;
			}
		
		System.out.println("Reverse of " + orignNum+"is"+reverse);
		
	}



	
	
}
	



