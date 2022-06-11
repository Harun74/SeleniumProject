package javaDemo;



public class Arrays {

	public static void main(String[] args) {
		//Data Types:-1.Primitive DataType and 2.NonPrimitive DataType
		
		//num =9600232
		//float, short, boolean, bit, byte 
		
		short num0 = 1;
		System.out.println(num0);
		
		int num1 = 10;
		System.out.println(num1);
		
		long num2 = 1111111111;
		System.out.println(num2);
		
		double num3 = 10.10;
		System.out.println(num3);
		
		float num4 = 10.10f;
		System.out.println(num4);
		
		boolean num5 = false;
		System.out.println(num5);
		
		char ch = 'p';
		System.out.println(ch);
		
		int x= 10;
		System.out.println(x);
		
		char y = 'a';
		System.out.println(y);
		
		String z ="Hasan";
		System.out.println(z);
		
       /* System.out.println(num5);
		
		System.out.println(y);
		 System.out.println(num4);
    System.out.print(num2);*/
		
		//NonPrimitive Datatype(String,Array,Classes and interfaces)
		
		String txt = "Yousuf";//data type
		System.out.println(txt);
		//Syntax of Arrays:
		//String[]names={"Yousuf","Shihab","Mamun",};
		
		//1.How to store the values into Arrays(Note:Two ways available)
		
		//Way-1-Examples
		//int[]prices={10,12,13,15,20,25};
		//String[]emp={"Harun","Reza","Daisy","Touhid","Shipan","Sumaiya""Harun","Reza","Daisy","Touhid","Shipan","Sumaiya"};
		
		//Examples-1(integer type)
		int [] id = {10,20,30,40,50,60}; //array.length
		
		//Get count of arrays-array.length
		System.out.println(id.length);
		
		//Get particular value from arrays
		System.out.println(id[2]);
		System.out.println(id[1]);
		System.out.println(id[5]);
		
		System.out.println(".............");
		
		//Example-2(String type)
		String[] names = {"Milton","Shakil","abcd","lipee"};
		
		System.out.println(names.length);
		System.out.println(names[2]);
		
		/*Other examples
		int[]ph={123,456,789,1,2,3,4};
		
		char[] char1 = {'a','b','c','d'};
		
       //Print a particular value
	   System.out.println(ph.length);
	   System.out.println(char1[3]);*/
		
		/*How to get count of Array--->array.length
		System.out.println(names.length);
		System.out.println(ph.length);*/
		
		//Way-2(using object)
		//ClassName obj = new ClassName();
		
		/*String[] names = new String[4];
		String[] emp = new String[5];
		emp[0] = "Reza";
		emp[1] = "Daizy";
		emp[2] = "Tushar";
		emp[3] = "Shakil";
		emp[4] = "Sumit";*/
		
		String[] obj = new String[5];
		obj[0] = "Rumel";
		obj[1] = "Rumi";
		obj[2] = "Neepa";
		obj[3] = "xyz";
		obj[4] = "abc";
	  //obj[5] = "Mamun";
		
	 //obj[5] = "Reza";
	 //System.out.println(5);
		
	  System.out.println("...........");
	  
	  //2.How to pick particular value from Array--->array[indexNumber]
	 // System.out.println(emp[4]);
	  
	  //3.How to get count of Array--->array.length
	 // System.out.println(emp.length);
	  
    //System.out.println("***********************************");
	  
	  
	  
	  //Homework
	  //Given Marks :60,65,70,78,80,86,90,92,95 and for these marks the Array is:
	  int[] marks = {60,65,70,78,80,86,90,92,95};
	  
	  //a)Print index value 3 from above array
	  System.out.println(marks[2]);
	  
	  //b)Print gets count of above array
	  System.out.println(marks.length);
	  
	  //c)Print all value from above array
	   marks[0]=60;
	   marks[1]=65;
       marks[2]=70;
	   marks[3]=78;
	   marks[4]=80;
	   marks[5]=86;
	   marks[6]=90;
	   marks[7]=92;
	   marks[8]=95;
	   
	   for(int i=0; i<marks.length; i++) {System.out.println(marks[i]);}
	  
	//3.List of employee 	who are working in Walmart Inc:
	   
	 String[] emp = {"David","Smith","Erika","Priscila","Regina","Tammy","Paul","Garcia",};
		
	//a)Print Priscila from the list:
	 System.out.println(emp[3]);
	 
	 //b)Print Gets count of list:
	 System.out.println(emp.length);
		
	//c)Print all names from the list:
	 emp[0] ="David";
	 emp[1]	="Smith";
	 emp[2] ="Erika";
	 emp[3] ="Priscila";
	 emp[4] ="Regina";
	 emp[5] ="Tammy";
	 emp[6] ="Paul";
	 emp[7]	= "Garcia";
	 for(int i=0;i<emp.length;i++) {
	 System.out.println(emp[i]);}
	 
	 //Loop-Homework
	 
	 //3.Print"I am learning Selenium using Java language" 15 times by using for loop:
	 for(int i=1;i<=15;i=i+1) 
	 {System.out.println(i+ " I am learning Selenium using Java language");
	 }
	 
	 //4.An Array of 10 employees names of a comp any:
	 String[] comemp = {"David","Smith","Erika","Priscila","Regina","Tammy","Paul","Garcia","Bob","Frank",};
	 comemp[0] ="David";
	 comemp[1]	="Smith";
	 comemp[2] ="Erika";
	 comemp[3]="Priscila";
	 comemp[4] ="Regina";
	 comemp[5] ="Tammy";
	 comemp[6] ="Paul";
	 comemp[7] 	= "Garcia";
	 comemp[8]	="Bob";
	 comemp[9]	="Frank";
	 //Print all the names by using for loop:
	 for(int i=0;i<comemp.length;i++) 
	 {System.out.println(comemp[i]);
	 }
	 
	 //5)Print all the even numbers up to 40 starting from 2 by using while loop:
	 int i=2; while(i<=40) {System.out.println(i);i=i+2;}
	 
	 //6.Print all the odd numbers up to 35 starting from 3 by using do while loop:
	 int j=3;do {System.out.println(j);j=j+2;}while(j<=35);
	 
	 //7.Array of 10 students of Selenium QA class and print all students name on the console by using for each loop(use Array creation way-1).
	 String[] selQAstu = {"Sayed","Wadud","Sanjoy","Kutub","Harun","Reza","Daisy","Touhid","Shipan","Sumaiya"};
	 for(String eachselQAstu:selQAstu) {System.out.println(eachselQAstu);}
	 
	 //8.Array of 20 employees ID numbers of an organization and print all the id of employees on the console by using for each loop(use Array creation way-2
	int[] empid = new int[20];
	 empid[0]=111;
	 empid[1]=112;		 
	 empid[2]=113;		 
	 empid[3]=114;		 
	 empid[4]=115;		 
	 empid[5]=116;		 
	 empid[6]=117;		 
	 empid[7]=118;		 
	 empid[8]=119;		 
	 empid[9]=120;		 
	 empid[10]=121;		 
	 empid[11]=122;		 
	 empid[12]=123;		 
	 empid[13]=124;		 
	 empid[14]=125;		 
	 empid[15]=126;		 
	 empid[16]=127;		 
	 empid[17]=128;
	 empid[18]=129;
	 empid[19]=130;
	 for(int eachempid:empid) {System.out.println(eachempid);}
	 
	 String[] stu= new String[3];
	 stu[0] = "abc";
	 stu[1] = "xyz";	 
	 stu[2] = "pqr";
	// stu[3] = "lmn"; 
	for(i=0;i<3;i++) { System.out.println(stu[i]);}
	}

}
