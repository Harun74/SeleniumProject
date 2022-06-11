package learnCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//ArrayList-Step 1:- Create object for ArrayList class
		
		//Step 2:- Use all List methods one by one
		
		//Syntax- List<Integer> lst = new ArrayList<Integer>();
		
		//List<Integer> id = new LinkedList<Integer>();
		
//List->ArrayList		
		
		/*List<Integer>id = new ArrayList<Integer>();
		id.add(10);
		id.add(20);
		id.add(30);
		id.add(60);
		id.add(80);
		id.add(40);
		id.add(342);
		id.add(18);
		id.add(342);
		id.add(9);
		
		System.out.println(id);//maintain inserting order-see output
		
		System.out.println("...............");
		
		System.out.println(id.size());
		
		System.out.println(",,,,,,,,,,,,,,");
		
		for(Integer eachid: id) {
			System.out.println(eachid);}*/
		
		List<String>lst = new ArrayList<String>();
		lst.add("Mamun");
		lst.add("Touhid");
		lst.add("Daizy");
		lst.add("Shskil");
		lst.add("Kutub");
		lst.add("Sumaiya");
		lst.add("Kutub");
		lst.add("Shipan");
		lst.add("Tushar");
		lst.add("Shipan");
		
		//Note:- ArrayList allow duplicate value,for that we have inserted Kutub and Shipan multiple times.
		
		System.out.println(lst);
		
		//Get count of list
		System.out.println(lst.size());
		
  System.out.println(".................");
  
       //Add new Item in the List
       lst.add("Wadud");
       
       //After adding item
       System.out.println(lst);
       
       //After adding -Get count of List
       System.out.println(lst.size());
       
       System.out.println("...........");
       
       //Print all item inside the list
       for(int i=0;i<lst.size();i++) {
    	   System.out.println(lst.get(i));
       }
       
       System.out.println("............");
       
       //Delete particular item from list
       lst.remove(3);
       
       System.out.println(",,,,,,,,,,,,,");
       
       System.out.println(lst);
       
       //Verify after remove, print all items inside the list
       
       for(int i=0;i<lst.size();i++) {
    	   System.out.println(lst.get(i));
       }
       
      System.out.println("..........");
      
      //Verify Particular Item in the List-true/false
      System.out.println(lst.contains("Kutub"));
      
      System.out.println(lst.contains("abc"));
      
      
      System.out.println("...........");
      //Clear the List
      lst.clear();
      
      System.out.println("............");
      
      //Confirms/verify the List is Empty-true/false
      System.out.println(lst.isEmpty());
      
 //2.List->LinkedList     
      
      List<String>names = new LinkedList<String>();
      names.add("abc");
      names.add("xyz");
      names.add("Bepul");
      names.add("Reza");
      names.add("Azam");
      System.out.print(names);
      
      //Get the count of the list
      
      System.out.println(names.size());
      
      System.out.println("..........");
      
      names.add("Sunny");
      System.out.println(names.size());
      
  System.out.println("..............");
  
      //Print all item inside the list
      for(String eachnames:names) {
    	  System.out.println(eachnames);}
      
      System.out.println("............");
      
      //Delete the item from the list
      names.remove(0);
      names.remove(1);
      names.remove(2);
      //Again print all items inside the list
      for(String eachnames:names) {System.out.println(eachnames);}
      
      System.out.println("..........");
      
      System.out.println(names.contains("pqr"));
      
      System.out.println("............");
      
      System.out.println(names.contains("Reza"));
      
      System.out.println("...........");
           names.clear();
           
      System.out.println(names.isEmpty());
      
      System.out.println("...........");
      
      
       
		
		
		}

	}


