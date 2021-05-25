package date0132021;

public class Calculator {
	int number1;
	int number2;
	
	public Calculator(int n1,int n2) {
		
		number1=n1;
		number2=n2;;
		
	}
	void add() {
		 System.out.println("Addition is:"+(number1 + number2));
	}
	void Subtract(int n1,int n2) {
		
	System.out.println("Substraction is:"+(n1 - n2));
	
	System.out.println("Substraction Instance var:"+(number1-number2));
	System.out.println("Substraction  number1 and n1:"+(number1-n1));
	System.out.println("Substraction number2 and n2:"+(number2 - n2));
		
	}
	  void Mult() {
		 System.out.println("Multiplication :"+ (number1*number2));
		 
	  }
	 void Division(int n1,int n2)
	  {
		System.out.println("Division :"+ (n1/n2));
	
		
	}
}
