package date17042021;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		try {
			
			checkValueOfX(x);
		}catch(Exception e) {
			
			
			e.printStackTrace();
		}

	}
static void checkValueOfX(int x) throws Exception{
	
	if(x==10) {
		
		throw new Exception("valueOfX10");
	}
}
		// TODO Auto-generated method stub
		
	}


