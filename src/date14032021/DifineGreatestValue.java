package date14032021;

import java.util.Scanner;

public class DifineGreatestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner gre=new Scanner(System.in);
		System.out.println("Enter the first number");

		int a=gre.nextInt();
		
		System.out.println("Enter the second number");

		int b=gre.nextInt();
	
	       System.out.println("Enter the third number");

       int c=gre.nextInt();
       
       
    //   if(a>b && a>c) {
    	   
    	   
   //   System.out.println("a is greater then b and a is greater then c");
    //   }
       
       
      // if(b>c && b>a) {
   // 	   System.out.print("b number is greater then c and b is greater then a ");
    //   }
       
       
       if(a>b && a>c) {
    	   
       System.out.println("First number is greater");
       }
       else if(b>c) {
           System.out.println("second number is greater");

       }
       else {
           System.out.println("third number is greater");

       }
       }

}


