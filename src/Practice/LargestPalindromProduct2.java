package Practice;

public class LargestPalindromProduct2 {

	
	
	public static void Run() {
		
		
		int maxPalindrome=0;
		 int i=0;
		 int j=0;
		 
		 for(i=999; i>99; i--) {
			 
			 
			 for(j=999; j>=i;j--) {
				 
				 
				 int product =i*j;
				 
				 if(isPalindrome(product)) {
					 
					 maxPalindrome=product;
					  String text ="Largest palindrom is : %s x %s=%s";
					  
					  
					  
					  System.out.println("text, i,j, maxPalindrome");

					  
					  break;
				 }
			 }
			 
			 if(maxPalindrome !=0) break;
				 
				 
		 }
		 
	}
	private static boolean isPalindrome(int product) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
