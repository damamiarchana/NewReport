package Practice;

import java.util.Scanner;

public class Divisiable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("The Number is...");

		int num;
		num=sc.nextInt();
		
		if (num % 3==0) {
			
			
			System.out.println("The Divisiable  by 3 ");
			
			
		}if(num % 5==0) {
			
			
			
			System.out.println(" Not  Divisiable by  5");
		}

	}

}
