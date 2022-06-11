package learnCollections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class LearnMap {

	public static void main(String[] args) {
//LinkedHashMap( For insert order)
		
	//Map (2 dimension)
	
	// Create a map that is create object of LinkedHashMap class
		
    // Maintains order of put/insert
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		//Result order depends on implementation classes
		mp.put("Mamun", 111);
		mp.put("Touhid", 123);
		mp.put("Daizy", 425);
		mp.put("Harun", 456);
		mp.put("xyz", 233);
		mp.put("Daizy", 775);
		mp.put("Kutub", 432);
		mp.put("xyz", 322);
		mp.put("Sumaiya", 653);
		
	/*syntax: for(datatype MapName:Collection){sysout(Mapname);}*/
		
		for(Entry<String, Integer> eachMp:mp.entrySet()) {
		System.out.println(eachMp.getKey() +"  "+ eachMp.getValue());
		
		}
		
		System.out.println("....................");
		
		//Get count of Map entry size()
		System.out.println(mp.size());
		
		System.out.println("...............");
		
		//get()
		mp.get("xyz");
		System.out.println(mp.get("xyz"));
		
		System.out.println(mp.containsValue(322));
		
		System.out.println(mp.containsKey("Harun"));
		
		//Remove() a particular item
		mp.remove("Kutub");
		
		System.out.println("..............");
		
		//After remove size of Map
		System.out.println(mp.size());
		
		for(Entry<String, Integer>eachMp:mp.entrySet()) {
			System.out.println(eachMp.getKey() +"  "+ eachMp.getValue());}
		
		System.out.println("............");
		
		//ContainsKey()- Search by the key
		mp.containsKey("xyz");
		System.out.println(mp.containsKey("xyz"));
		
		System.out.println(".............");
		
		//ContainsValue-Search by value
		mp.containsValue(775);
		System.out.println(mp.containsValue(775));//true/false
		
		//Clear()- all Map items
		mp.clear();//Remove all Map entry
		
		System.out.println(".............");
		
		System.out.println(mp.size());//Size will be zero
		
		System.out.println("...............");
		
		System.out.println(mp.isEmpty());//true/false
		
		System.out.println("..............");
		
		for(Entry<String, Integer>eachmp:mp.entrySet()) {
			System.out.println(eachmp.getKey() +"  "+ eachmp.getValue());
			}//result will be nil
		
		

		
		
		
		
		
		
		
		
		
			
	}

}
