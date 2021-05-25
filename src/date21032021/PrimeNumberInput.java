package date21032021;

import java.util.Scanner;

public class PrimeNumberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPrime=false;
		int counter=0;
		Scanner obj=new Scanner(System.in);
System.out.println("Enetr a number");

int number=obj.nextInt();


for(int i=1;i<number;i++) {
	
	
	if(number%i==0) {
		
		
		isPrime=true;
		counter++;
	}
}
	
	if(counter<=2&& isPrime) {
	System.out.println(number +" is a prime number");
		
		
		
	}else {
		System.out.println( number +" is not a prime number");
	
	
		
	}
	}
		
		
	}


