package javaDemo;

public class StringConcept {

	public static void main(String[] args) {
		
		String text = "String concept";
		String text1 = "String concept";
		
		//Find the memory location/address of this text/text1 variable
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		
		//Print the value of text/text1
		System.out.println(text);
		System.out.println(text1);
		
		//String class method
		//1.equals()-return true or false
		System.out.println(text1.equals(text));
		System.out.println(text.equals(text1));	
		//equal function compare the value of two different variable(text&text1)
		
		System.out.println("...............");
		
		System.out.println(text==text1);
		//Compare memory address of String variable
		
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		
		//2.Length()-return count of String
		String text2 = "Learning String";
		System.out.println(text2.length());
		
		
		//3. Concat()-if you want to concat (join more than one Strings)two String
		
		System.out.println(text.concat(text2));
		
		// if you want to concat different datatype variable,we use +
		 String num = "50";
		 String num1 = "70";
		  int a = 30;
		  int b = 40;
		System.out.println(num+a);
		
		System.out.println(a+b);
		
		System.out.println(num+num1);
		
		//4. trim()-to remove white apace from both side of a String 
		String line ="   Java String concept   ";
		System.out.println(line);
		System.out.println(line.length());
		System.out.println(line.trim());
		System.out.println(line.trim().length());
		System.out.println(line.length());
		
		//5. toLowerCase()-convert all of the String as LowerCase
		 String text4 = "Compares String and convert it Lower case";
		 System.out.println(text4.toLowerCase());
	    //to UpperCase()-convert all of the String as UpperCase
		 System.out.println(text4.toUpperCase());
		 
	    //6.cotains()- given String is available in entire String or not-return true/false
		 System.out.println(text4.contains("vert"));
		 System.out.println(text4.contains("text"));
		 System.out.println(text4.contains("String"));
		

	}

}
