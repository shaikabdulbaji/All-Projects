package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class gSet_Interface_and_HashSet_class {

	public static void main(String[] args) {

		System.out.println(" For Interfaces we can't create objects else we create objects for classes ");

/*
 
 		Set interface won't have his own specific methods
 		Even HashSet interface won't have his own specific methods
 		
 		* Set interface is the child interface of Collection interface
 		* Set only inherits methods from Collection interface and it doesn't have its own methods
 		* Represents the group of objects as a single entity where
 		* No indexing
 		* duplicates are not allowed
 		* insertion order is not preserved
 		* Child Classes and Interfaces of Set interface
 		* We cannot create objects for an interface
 		 
 		 
 		* HashSet(c) : 
	 	* HashSet is the child class of Set interface
	 	* Represents the group of objects as a single entity where
	 	* duplicates are not allowed
	 	* On trying to add the duplicates, the add method returns false and insertion wont happen
	 	* insertion order is not preserved
	 	* null can be inserted
	 	* Uses add() method for adding objects 
	 	* Using for-each loop or iterator() methods for retrieving the objects
	 	* Has a child class known as LinkedHashSet
 		
 		
		Set is an interface which is implemented by 3 different classes - 
		
		1. HashSet 
		2. Treeset 
		3. LinkedHashSet 
		
		• Set interface does not have index based process. 
		• Default capacity is 16. 
		• Duplicate objects are not allowed. 
		• Set is only uni directional, so it supports only Iterator interface(cursor). 
		• Methods of set interface -  javap java.util.set 239 G.Ravi Kiran
		
		1.HashSet 
		---------- 
		• It is a class which implements set interface. 
		• Introduced in 1.2 Version 
		• Hetrogenous objects are allowed. 
		• Duplicates are not allowed. In case if we add, we won't get compile time error, it will just add once. 
		• Only one NULL object is allowed. 
		• Data structure is hashtable. 
		• Insertion order is preserved(depends on hashcode number).
		
		
		

		HashSet<Object> h = new HashSet<>();
		
		//h.add("Abdul");
		System.out.println(h.add("Abdul")); // return type is boolean
		h.add("Shaik");
		h.add("Baji");
		h.add(9);
		h.add(9.5);
		h.add(true);
		h.add('s');
		h.add(null);
		//h.add("Abdul");
		System.out.println(h.add("Abdul")); // But this object  wont be inserted it will not give complie error but it will not inserted
		
		System.out.println(h); // Insertion order is not preserved means it will not print in given order
		
		
		HashSet<String> h = new HashSet<>();
		
		h.add("Abdul");
		h.add("Shaik");
		h.add("Baji");

		 To retrive the value from HashSet object we use for-each loop only we can't use for loop  
											(or)
		 We can use iterator() method in collections
		for(Object t : h)
		{
			System.out.println(t);
		}
		
		Iterator<String> itr = h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
 */		
		
		
		
		
		
		
		
		
	}

}
