package Practice;

public class ProbMultip3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		boolean threeMultiple=false, fiveMultiple=false;
		
		for(int i=3; i<1000;i++) {
			
			
			threeMultiple=i%3==0;
			
			fiveMultiple=i%5==0;
			
			if(threeMultiple || fiveMultiple) 
				sum +=i;
				
				
		}System.out.println(sum);
				

	}

}
