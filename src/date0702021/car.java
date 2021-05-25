package date0702021;

public class car {

	
		// TODO Auto-generated method stub
    String name="Maruti car";
    String color="Red";
    int year=2021;
    int numberofGears=6;
    
    
public static void main(String[] args) {
    	
    	car C1=new car();
    	C1.displayCarDetails();
}
    
    void displayCarDetails()
    {
    System.out.println("name:"+ name);
    System.out.println("color:"+color);
    System.out.println("year:"+year);
    System.out.println("numberofGears:"+numberofGears);
    }
    void Start() {
    	System.out.println("car is starting");
   
    }
    void Stop() {
    	System.out.println("car is stopping..");
    	
    
    }

    
    
   	}


