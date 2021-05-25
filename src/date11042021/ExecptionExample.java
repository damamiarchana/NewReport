package date11042021;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ExecptionExample {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int firstNum=obj.nextInt();
		System.out.println("Enter a another number:");
		 int secNum=obj.nextInt();
		 try {
			 
			 int result=firstNum/secNum;
			 System.out.println("the result odd division is:"+ result);
			 
			 
		 }
		 catch(Exception e) {
			 System.out.println("Exception occured");
		 }
		 
		 System.out.println("Program End");
		 
		 
		 
	}

}
