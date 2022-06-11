package learnCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapTreeMap {

	public static void main(String[] args) {
		
		
		//Create a map that is create object of TreeMap class
		
		Map<String, String>country = new TreeMap<String, String>();
		
		//Maintains ascending order
		country.put("Bangladesh", "Dhaka");
		country.put("Qatar", "Duha");
		country.put("pakistan", "Islamabad");
		country.put("UK", "London");
		
		System.out.println(country.size());
		
		country.get("Qatar");
		System.out.println(country.get("Qatar"));
		
		System.out.println("...............");
		
		for(Entry<String, String>eachMp:country.entrySet()) {
			System.out.println(eachMp.getKey() +"  "+ eachMp.getValue());
			}
		
		System.out.println("............");
		
		//Create a Map that is create object of HashMap class
		Map<String, String>stu = new HashMap<String, String>();
		
		//Maintain Random order
		stu.put("Ali", "Reza");
		stu.put("Mohammad", "Khan");
		stu.put("Md", "Uddin");
		stu.put("Mohammad", "Chowdhury");
		stu.put("Mehedi", "Hasan");
		
		for(Entry<String, String>eachMp:stu.entrySet()) {
			System.out.println(eachMp.getKey() +"  "+ eachMp.getValue());
		
			}
		System.out.println(stu.size());
		
		stu.get("Mohammad");
		System.out.println(stu.get("Mohammad"));

	}

}
