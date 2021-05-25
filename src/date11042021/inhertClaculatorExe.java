package date11042021;

public class inhertClaculatorExe {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CalculatorC calc=new CalculatorC();
		
		calc.add(20, 30);
		InhertCalculatorP	calcp=new InhertCalculatorP();
		int result=calc.add(10,30);
	System.out.println(result);
	
	}

}
