package Practice;

import java.util.Scanner;

public class AreaOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the base of  the Rectangle");
		double Base=sc.nextDouble();
		System.out.println("Enter the height of the rectangle");
		double Height=sc.nextDouble();
	double Area=Base*Height;
	System.out.println("Area of rectangle:"+Area);
sc.close();
	}

}
