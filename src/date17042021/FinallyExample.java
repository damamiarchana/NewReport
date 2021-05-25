package date17042021;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name=null;
int length=0;

try {
	length=name.length();
	
}
catch(Exception e) {
	
	System.out.println(e.getMessage() +"occured");
	
	name="Pune";
	length=name.length();
	}
finally {
	
	System.out.println(" I am always executed :finally");
}
System.out.println("The length of the string is:+length");

	}

}
