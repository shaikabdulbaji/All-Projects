package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class nHashMap_Class {

	public static void main(String[] args) {

/*
 		
 		 * HashMap class is the child class of Map interface
		 * Groups the objects as key value pairs
		 * Adding key value pairs using put() method and printing them
		 * Duplicate Keys are not allowed, if you try to insert any duplicate key the old value will get replaced with new value
		  * put() - returns null when there are no duplicate keys inserted and returns the replaced value when duplication key is inserted
		 * Retrieving the values using get(key) 
		  * Returns null when the provided key is not there
		 * Remove the values using remove(key)
		  * Returns the removed value
		 * Finding whether the key is available using containsKey(key)
		  * Returns boolean value
		 * Finding whether the value is available using containsValue(value)
		  * Returns boolean value
		 * Finding whether the HashMap is empty using isEmpty()
		  * Returns false when not empty
		 * Finding the size using size() 
		 * Clearing all the key value pairs using clear()
		 * Retrieving all the keys using keySet() 
		  * Returns Set 
		 * Retrieving all the values using values()
		  * Returns Collection
		 * Insertion order is not preserved
		 * Duplicate keys are not allowed and Duplicate values are allowed
		 * Retrieving all the Entries using enterySet()
		  * Returns Set
		  * Using iterator() to iterate
		  * Entry is the inner interface of Map Interface
		  * getKey(), getValue() and setValue()
		 * Generics
		 
		 
		HashMap 
		--------- 
		• HashMap is a class which implements Map interface. 
		
		Features :- 
		• introduced in 1.2v 
		• heterogenous data allowed 
		• Data structure is hashtable 
		• duplicate keys are not allowed but values can be duplicate 
		• random order based on hashcode 
		• only one null key is allowed and multiple null values are allowed.
		
		//Ex :-
		import java.util.*; 
		public class One { 
		public static void main(String[] args) { 
		 HashMap<Integer,String> m1=new HashMap<>(); 
		 m1.put(101,"Samsung"); 
		 m1.put(102,"Realme"); 
		 m1.put(103,"Oppo"); 
		 m1.put(104,"Vivo"); 
		 System.out.println("Map Objects are : "+m1); 
		 
		 m1.put(103, "Redmi"); 
		 System.out.println("Duplicate key : "+m1); 
		 m1.put(105, "Samsung"); 
		 System.out.println("Duplicate Value : "+m1); 
		 System.out.println("All keys : "+m1.keySet()); 
		 System.out.println("All Values : "+m1.values()); 
		 System.out.println("Particular Value : "+m1.get(102)); 
		 System.out.println("Check key : "+m1.containsKey(1001)); 
		 System.out.println("Check Value : 
		"+m1.containsValue("Iphone")); 
		}
		} 
		Output:
		Map Objects are : {101=Samsung, 102=Realme, 103=Oppo, 104=Vivo} 
		Duplicate key : {101=Samsung, 102=Realme, 103=Redmi, 104=Vivo} 
		Duplicate Value : {101=Samsung, 102=Realme, 103=Redmi, 104=Vivo, 
		105=Samsung} 
		All keys : [101, 102, 103, 104, 105] 
		All Values : [Samsung, Realme, Redmi, Vivo, Samsung] 
		Particular Value : Realme 
		Check key : false 
		Check Value : false 
	
		  

		// HashMap class is the child class of Map interface
		HashMap m = new HashMap();
		
		// Adding key value pairs using put() method and printing them
		m.put(101, "Abdul");
		m.put(102, "Shaik");
		m.put(103, "Baji");
	
		// Duplicate Keys are not allowed, if you try to insert any duplicate key the old value will get replaced with new value+
		// +and values can be duplicated
	    m.put(101, "Rassol");
		
		System.out.println(m.put(101, "Abdul"));
		System.out.println(m.put(102, "Shaik"));
		System.out.println(m.put(103, "Baji"));
		System.out.println(m.put(101, "Rassol") +" got replaced ");
	
		m.put(101, "Abdul");
		m.put(102, "Shaik");
		m.put(103, "Baji");
		
		//  Retrieving the values using get(key)
		System.out.println(m.get(103));
		System.out.println(m.get(101));
		System.out.println(m.get(105)); // null as result
		
		// Remove the values using remove(key)
		Object r = m.remove(101);
		System.out.println(m.remove(102));
		
		// Finding whether the key is available using containsKey(key) Returns boolean value
		System.out.println(m.containsKey(102)); // 102 was there that's why it was true
		System.out.println(m.containsKey(109)); // 109 was not there that's why it was false
		
		//Finding whether the value is available using containsValue(value) Returns boolean value
		System.out.println(m.containsValue("Abdul")); // Abdul was there that's why it was true
		System.out.println(m.containsValue("Rasool")); // Rasool was not there that's why it was false
		
		// Finding whether the HashMap is empty using isEmpty()
		System.out.println(m.isEmpty()); // Objects was there that's why it was false else true
		
		// Finding the size using size()
		System.out.println(m.size());
		
		// Clearing all the key value pairs using clear()
		m.clear();
		
		// Retrieving all the keys using keySet() Returns Set 
		System.out.println(m.keySet()); (or)
		Set k = m.keySet();
		System.out.println(k);
		
		// Retrieving all the values using values() Returns Collection
		System.out.println(m.values());  (or)
		Collection c = m.values();
		System.out.println(c);
		
		// Insertion order is not preserved, " HashMap internally taken Hash Algorith and applied on keys "
		
		// Retrieving all the Entries using enterySet()
 		   System.out.println(m.entrySet());
		   Set s = m.entrySet();
		   System.out.println(s);
		   
		   Iterator itr = s.iterator();
		   while(itr.hasNext())
		   {
			   System.out.println(itr.next());
		   }
		
		// Entry is the inner interface of Map Interface getKey(), getValue() and setValue()
		   Set s = m.entrySet();
		   System.out.println(s);
		   
		   Iterator itr = s.iterator();
		   while(itr.hasNext())
		   {
			   Map.Entry im = (Map.Entry) itr.next();
			   System.out.println(im.getKey()); 
			   System.out.println(im.getValue());
			   System.out.println("--------------------");
			   
			   if(im.getKey().equals(101))
			   {
				   im.setValue("Kareem");
			   }
		   }
 		
		// Generics
		HashMap<Integer,String> m = new HashMap<>();
		
		// Adding key value pairs using put() method and printing them
		m.put(101, "Abdul");
		m.put(102, "Shaik");
		m.put(103, "Baji");
		
		HashMap<String,String> m = new HashMap<>();
		
		// Adding key value pairs using put() method and printing them
		m.put("Shaik", "Abdul");
		m.put(102, "Shaik");
		m.put(103, "Baji");
		
        HashMap<Object,Object> m = new HashMap<>();
		
		// Adding key value pairs using put() method and printing them
		m.put("Shaik", "Abdul");
		m.put(102, "Shaik");
		m.put(103, "Baji");
		
		
		System.out.println(m);

*/
		
	}

}
