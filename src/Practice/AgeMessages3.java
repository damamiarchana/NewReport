package Practice;

import java.util.Scanner;

public class AgeMessages3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		String name;
		int age;
		System.out.println("Enter your name");
		  name= key.nextLine();
		  System.out.println("enetr your age");
		  age=key.nextInt();
		  System.out.println();
		  
		  if (age<16) {
			  
			  
			  System.out.println("You can't drive,"+ name +".");
			  
		  }
		  if (age>=16 && age<=17) {
			  
			  System.out.println("you can't drive  and not vote"+ name+".");
		  }
             if(age>=18 && age <=24) {
            	 
            	 
            System.out.println("you can vote "+ name);
             }
             
             if (age>=25) {
            	 
            	 System.out.println("You can do anything"+name);
             }
	}

}
