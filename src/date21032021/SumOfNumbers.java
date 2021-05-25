package date21032021;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int firstNum=obj.nextInt();
		System.out.println("Enter the number");
		int secondNum=obj.nextInt();
		
		
		if(firstNum==secondNum) {
			
			System.out.println("Double sum is:"+2*(firstNum+secondNum));
		}else {
			
			System.out.println("Sum is:"+(firstNum+secondNum));
		}

	}

}
