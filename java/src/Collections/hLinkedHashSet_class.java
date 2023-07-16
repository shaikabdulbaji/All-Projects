package Collections;

import java.util.LinkedHashSet;

public class hLinkedHashSet_class {

	public static void main(String[] args) {

/*		
 		Diff btw HashSet(c) and LinkedHashSet(c) :
 		
 		" Main difference is Insertion order is not preserved in HashSet and Insertion order is preserved in LinkedHashSet "
 		
 		HashSet(c) :
 		1. Random order (Insertion order is preserved)
 		2. Group individual objects, Duplicates not allowed , " Insertion order is not preserved ".
 		
 		LinkedHasSet(c) :
 		1. Insertion order is preserved
 		2. Group individual objects, Duplicates not allowed , " Insertion order is preserved ".
 		
		LinkedHashSet(c) :
		------------------
		* LinkedHashSet is the child class of HashSet Class
		* Represents the group of objects as a single entity where
    	  * duplicates are not allowed
    	  * On trying to add the duplicates, the add method returns false and insertion won't happen
    	* insertion order is preserved
	    * null can be inserted
		   
		  
		LinkedHashSet(c) :
		---------------- 
		It is a class which extends HashSet and implements set interface. 
		Features: 
		• Introduced in 1.2v 
		• Heterogenous objects are allowed 
		• Duplicates are not allowed. In case if we add we won't get compile time error, it will just add once 
		• only one NULL object is allowed 
		• Data structure is Linkedlist. 
		• Insertion order is preserved. 
		• Set is only uni directional so it supports only Iterator 
		//Same program only difference is output is as per insertion order// 
		import java.util.*; 
		
		Ex :
		public class Seventh 
		{ 
		 public static void main(String[] args) { 
		 LinkedHashSet<Object> s1=new LinkedHashSet<>(); 
		 s1.add("Rohan"); 
		 s1.add("Riya"); 
		 s1.add("Pooja"); 
		 s1.add(445); 
		 s1.add('A'); 
		 System.out.println("Hash set objectss are: "+s1); 
		 s1.add("Riya"); 
		 s1.add(445); 
		 System.out.println("After add duplicates: "+s1); 
		 s1.add(null); 
		 s1.add(null); 
		 System.out.println("After adding null objects: "+s1); 
		 System.out.println("-------Forward direction-----"); 
		 Iterator<Object> i1=s1.iterator(); 
		 while(i1.hasNext()) 
		 { 
		 System.out.println(i1.next()); 
		 } 
		 }
		 } 
		Output:
		Hash set objectss are: [Rohan, Riya, Pooja, 445, A] 
		245 G.Ravi Kiran_KCCM5
		After add duplicates: [Rohan, Riya, Pooja, 445, A] 
		After adding null objects: [Rohan, Riya, Pooja, 445, A, null] 
		-------Forward direction----- 
		Rohan 
		Riya 
		Pooja 
		445 
		A 
		null
	
		LinkedHashSet<Object> h = new LinkedHashSet<>();
		
		h.add("Abdul");
		h.add("Shaik");
		h.add("Baji");
		h.add(9);
		h.add(9.5);
		h.add(true);
		h.add('s');
		h.add(null);
		h.add("Abdul"); // Duplicates are ignored
		
		System.out.println(h); // Insertion order is preserved means it will print in given order and duplicates are not allowed
*/		
		
		
		
		
		
	}

}
