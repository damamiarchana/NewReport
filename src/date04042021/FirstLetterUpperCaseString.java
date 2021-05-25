package date04042021;

public class FirstLetterUpperCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//sentence =>words=>split("")
		//substring=>separate the first letter from other letters
		//every words first letter=>charAt(0)
		//use the toUpper()
		//concat the upper letter and other letter
		//concat all the words
		
		String str="I am learning java";
		String[] words=str.split("");
		String newStr="";
		for(int i=0;i<words.length;i++) {
			String letter=words[i].substring(0, 1);
				letter=letter.toUpperCase();
				
				String temp=letter + words[i].substring(1);
				newStr+=temp+"";

	}
	
System.out.println(newStr);

	}

}
