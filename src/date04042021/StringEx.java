package date04042021;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=" I am learning java";
		String anotherName="Pune";
		String newName="pune";
		String emptyStr="";
		
		String hello="helloWorld";
		
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		
		System.out.println(name.compareTo(anotherName));
		System.out.println(name.contains("learn"));
		System.out.println(name.contains("java"));
		System.out.println(newName.contentEquals(anotherName));
		System.out.println(newName.equals(anotherName));
		System.out.println(name.equalsIgnoreCase(anotherName));
		System.out.println(name.indexOf("j"));
		System.out.println(name.indexOf("a"));
		System.out.println(emptyStr.isEmpty());
		
		System.out.println(name.lastIndexOf("v",10));
		
		String newValue=name.replace("ava", "AVA");
		
		System.out.println(newValue);
		System.out.println(name);

          String[] vals=name.split("");
          for(int i=0; i<vals.length;i++) {
        	  System.out.println(vals[i]);
        	  
          }
          
          String[] temp=hello.split("w");          
          for(int i=0;i<temp.length;i++) {
        	  System.out.println(temp[i]);
        	
        		  
        	  }
        	  
System.out.println(name.startsWith("i"));
System.out.println(name.substring(5));
System.out.println(name.substring(5, 13));

System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
        	  
          
	}

}
