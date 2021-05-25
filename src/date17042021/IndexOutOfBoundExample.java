package date17042021;

public class IndexOutOfBoundExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Pune";
		
		try {
			
			char charAt=name.charAt(4);
			
			System.out.println("The character is:" + charAt);
		}catch(ArithmeticException e) {
			
			System.out.println("Exception occured");
		}
		
		System.out.println(e.getMessage());
	
	}catch (StringIndexOutOfBoundsException e) {
		
		System.out.println(e.getMessage()+"occured! StringIndexOfBound");
		

	}
	catch(Exception e) {
		
		
		System.out.println(e.getMessage()+" ocured!");
	
}
}
