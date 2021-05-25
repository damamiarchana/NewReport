package Practice;

import java.util.Scanner;

public class PosNegConditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		
		System.out.println(a<0 && b<0);
		System.out.println(a<0 && b>0);
		System.out.println(a>0 && b>0);
		
	}

}
