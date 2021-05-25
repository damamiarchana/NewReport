package date0702021;

public class ExecutionNewCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NewCar santro= new NewCar("Hyonda","santro","white",2020,5);
     santro.displaycarDetails();
     NewCar balena=new NewCar("Maruti","Balena","Grey",2021,5);
     balena.displaycarDetails();
     System.out.println(santro.modelName);
     System.out.println(balena.color);
	}

}
