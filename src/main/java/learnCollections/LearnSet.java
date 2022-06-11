package learnCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	//Set is not ordered based
	public static <integer> void main(String[] args) {
		
		//Set<integer> obj = new TreeSet<integer>();//Ascending order
		
		//Set<integer> obj = new HashSet<integer>();//Random order
		
		Set<Integer>obj = new LinkedHashSet<Integer>();//Inserting order
		
		//add items in Set-use add()
		obj.add(123);
		obj.add(210);
		obj.add(124);
		obj.add(456);
		obj.add(765);
		obj.add(789);
		obj.add(111);
		obj.add(000);
		obj.add(12345);
		obj.add(789);
		
		System.out.println(obj);
  //Get count of set-use size()
		System.out.println(obj.size());
		
		System.out.println("............");
		
  //Print/display all items in the set-use for each
		
		for(Integer eachobj:obj) {
			System.out.println(eachobj);}
		
		System.out.println("...........");
		
  //Check particular item from set-use contains()-output-true/false
		System.out.println(obj.contains(12345));
		System.out.println(obj.contains(789));
		System.out.println(obj.contains(1111));
		
		System.out.println("**************");
		 
  //Delete from set-use remove(item)
		obj.remove(12345);
		
		System.out.println(obj.contains(12345));
		
  //After delete-Print all items from set
		for(Integer eachobj:obj) {
			System.out.println(eachobj);}
		
		System.out.println(".............");
		
		//After delete item- size()
		System.out.println(obj.size());
		
		System.out.println(obj.contains(111));
		System.out.println(obj.contains(12345));
		System.out.println(654321);
		
		System.out.println("************");
		
  //Remove all items from set-use obj.clear()
		obj.clear();
		
		
  //Confirm set is empty or not-use isEmpty()-output-true/false
		System.out.println(obj.isEmpty());
		
		
		
		
		

	}

}
