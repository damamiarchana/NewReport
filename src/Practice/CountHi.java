package Practice;

import java.util.Scanner;

public class CountHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		
		String  str=sc.next();
		
		
		int count=0;
		
		if(str.length()==1 && str.charAt(0)=='h')
    count=0;
			else {

		for(int i=0; i<str.length()-1; i++)
		
		if((str.charAt(i)=='h') &&  (str.charAt(i+1)=='i'))
			count+=1;
			
			
		}
		System.out.println(count);
	}

}
