package javaDemo;

public class WhileLoop {

	public static void main(String[] args) {
		//while loop
		/*initialization;
		 while(condition){Statement(s);increment;}
		 */
      //if I will print 1 to 10, using while loop
		
		int i=1;  //Start
		while(i<=10) {System.out.println(i); i++;}
		
		System.out.println("................");
		
		//Print all the values from below Arrays(obj)by using while loop
		
		String[] obj = new String[4];
	    obj[0] = "Ruman";
	    obj[1] = "Shihab";
	    obj[2] = "Mamun";
	    obj[3] = "xyz";
	    
	    int j = 0;
	    while(j<=3) {System.out.println(obj[j]);j++;}
	}

}
