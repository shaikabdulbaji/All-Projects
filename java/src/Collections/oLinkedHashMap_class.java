package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class oLinkedHashMap_class {

	public static void main(String[] args) {

/*
 		
		 LinkedHashMap 
		--------------- 
		• LinkedHashMap is a class which extends HashMap and implements Map interface. 
		
		Features :-
		• introduced in 1.4v 
		• heterogenous data allowed 
		• Data structure is hashtable 
		• duplicate keys are not allowed but values can be duplicate,if we add duplicate key it 
		• replaces with original one. 
		• As per Insertion order 
		• only one null key is allowed and multiple null values are allowed.
		//Only difference is output is as per insertion order// 
		 
		//Ex :-
		import java.util.*; 
		public class Linkmapdemo 
		{ 
			public static void main(String[] args) 
			{ 
		
				 LinkedHashMap<Integer,String> m1=new LinkedHashMap<>(); 
				 m1.put(388,"Rahul"); 
				 m1.put(1,"Riya"); 
				 m1.put(103,"Pooja"); 
				 // m1.put("334",445);
				 System.out.println(m1); 
				 System.out.println(m1.keySet()); 
				 System.out.println(m1.values()); 
				 System.out.println( m1.get(101)); 
				 System.out.println(m1.get(334)); 
				 System.out.println(m1.containsKey(1002)); 
				 System.out.println(m1.containsValue("Java")); 
				 m1.put(101,"Sanju"); 
				 m1.put(103,"Pooja1.0"); 
				 System.out.println("After adding duplicate keys"+m1); 
				 m1.put(null,"Pooja2.0"); 
				 System.out.println(m1); 
				 m1.put(null,"Pooja3.0"); 
				 System.out.println(m1); 
				 
			  }
				
			} 
		Output:
		{388=Rahul, 1=Riya, 103=Pooja} 
		[388, 1, 103] 
		[Rahul, Riya, Pooja] 
		null 
		null 
		false 
		false 
		After adding duplicate keys{388=Rahul, 1=Riya, 103=Pooja1.0, 101=Sanju}
		{388=Rahul, 1=Riya, 103=Pooja1.0, 101=Sanju, null=Pooja2.0} 
		{388=Rahul, 1=Riya, 103=Pooja1.0, 101=Sanju, null=Pooja3.0} 

 		 * LinkedHashMap class is the child class of Map interface
		 * " Similar to HashMap but with the below difference "
		  * Insertion order is preserved
		
		 		
		 Diff btw HashMap(c) and LinkedHashMap(c)
		 
		 HashMap(c) :
		 1. Insertion order is not preserved
		 
		 LinkedHashMap(c) :
		 1. Insertion order is preserved
 		
 
		
		HashMap h = new HashMap();
		h.put(101, "Shaik");
		h.put(102, "Abdul");
		h.put(103, "Baji");
		h.put(99, "Kareem");
		h.put(23, "Amma");
		System.out.println(h);
		
		System.out.println("-------------------");
		
		LinkedHashMap lm = new LinkedHashMap();
		lm.put(104, "Shaik");
		lm.put(105, "Abdul");
		lm.put(106, "Rasool");
		System.out.println(lm);
*/		
		
	}

}
