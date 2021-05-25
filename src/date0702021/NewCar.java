
package date0702021;

public class NewCar {
	String company;
	String modelName;
	String color;
	int year;
	int numberofGears;
	
	public NewCar(String inputCompany,String inputModel,String iColor, int iYear,int iGears) {
		company =inputCompany; 
		modelName =inputModel;
		color =iColor;
		year =iYear;
		numberofGears=iGears;
	}
	
	void displaycarDetails() {

		System.out.println("name:"+modelName);
		System.out.println("color:"+color);
		System.out.println("year:"+year);
		System.out.println("gears:"+numberofGears);
		// TODO Auto-generated method stub
		
		
		
	}
		

	}
	



