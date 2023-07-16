package Collections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class eLinkedList_Interface {

	public static void main(String[] args) {

/*
		 * Child interface of Collection Interface
		 * ArrayList and LinkedList are almost similar and has the below differences:
		 * Has a different memory management mechanism
		 * Best suitable when the frequent operation is adding, removing or replacing the objects 
		 * Not suitable when the frequent operation is retrieving the objects
		 * Has below LinkedList specific methods
		 
 
		 LinkedList :
		-----------
		 • Introduced in 1.2 version.
		 • Hetrogenous objects are allowed.
		 • Null objects are allowed.
		 • Insertion order is preserved.
		 • Duplicate objects are allowed.
		 • Data structure is doubly LinkedList.
		 • cursors - ListIterator and Iterator
		 • Same process to write program, only in place of arraylist object
		 create object of linkedlist.

		 LinkedList lil = new LinkedList();
		
		 lil.add("Abdul");
		 lil.add(true);
		 lil.add("Shaik");
		 lil.add(9);
		 lil.add(1, "Baji");
		 lil.add("Shaik");
		 lil.add(null);
		 
		 System.out.println(lil.get(0));
		 System.out.println(lil.get(1));
		 
		 System.out.println(lil);  // Insertion order is allowed means it will print in order
		 System.out.println(lil);  // Duplicates are allowed means it will allow multiple same objects
		 
		 // Using addFirst() is used to add object at first position
		 lil.addFirst("Sk");
		 System.out.println(lil);
		 
		// Using addLast() is used to add object at last position
		lil.addLast("Ks");
		System.out.println(lil);

		// Using getFirst() is used to get First object 
		System.out.println(lil.getFirst());
		
		// Using getLast() is used to get Last object 
		System.out.println(lil.getLast());
		
		// Using removeFirst() remove 1st object
		System.out.println(lil.removeFirst());
		System.out.println(lil.removeLast());
		System.out.println(lil);
	
		
		LinkedList<String> lil = new LinkedList<>();  // It will only accepts string objects
		
		 lil.add("Abdul");
		 lil.add("Baji");
		 lil.add("Shaik");
//		 lil.add(9);
		 
		 LinkedList<Integer> lil1 = new LinkedList<>();  // It will only accepts string objects
			
		 lil1.add(5);
		 lil1.add(10);
		 lil1.add(19);
//		 lil.add("AB");
		 
		 LinkedList<Object> lil2 = new LinkedList<>();  // It will only All Hetrogenous objects
			
		 lil2.add(5);
		 lil2.add(10);
		 lil2.add(19);
		 lil2.add("AB");
		 lil2.add(9.55);

		// Assigning the LinkedList to Collection Interface
		Collection<Object> c = new LinkedList<>(); 
		//we are assgning the object of LinkedList predefined class to variable(c) of the collection interface
		// In this case we will only access collection specific method's we can't access LinkedList methods.
		c.add("arun");
//		c.add(1,"AB");
		List<Object> li = new LinkedList<>();
		// In this case we can access List interface methods and it's parent class collection interface methods
		li.add("AB");		// This is related to collection
		li.add(10, "Amma"); // This is related to List
*/		
		
		
	}

}
