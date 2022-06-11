package seleniumDemo;

public class If_elseElse_if {

	public static void main(String[] args) {
		
		double D = 5.5; //D = Diabetic, 5.5 = Pre Diabetic, D<5=Non Diabetic,
				
		if(D<=5) {System.out.println("Diabetic");}
		
		else if(D<5) {System.out.println("Non Diabetic");}
		
		else if(D>8) {System.out.println("Poor Control");}
		
		else {System.out.println("Pre Diabetic");}
		
		System.out.println("*******************");
		
		int x = 20;
		
		if(x<21) {System.out.println("x is less than 21");}
		
		else if(x>25) {System.out.println("x is greater than 26");}
		
		else {System.out.println("x equal to 20");}
	

}}
