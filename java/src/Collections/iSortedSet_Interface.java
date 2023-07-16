package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class iSortedSet_Interface {

	public static void main(String[] args) {

/*
 
 		Difference between HashSet(c) and LinkedHashSet(c) and SortedSet(I):
 		
 		" Main difference is Insertion order is not preserved in HashSet and Insertion order is preserved in LinkedHashSet "
 		
 		HashSet(c) :
 		1. Insertion order is not preserved (Random order)
 		2. Duplicates not allowed
 		3. Group individual objects, Duplicates not allowed , " Insertion order is not preserved ".
 		
 		LinkedHasSet(c) :
 		1. Insertion order is preserved
 		2. Duplicates not allowed
 		3. Group individual objects, Duplicates not allowed , " Insertion order is preserved ".
 
 		SortedSet(I) :
 		1. Objects will print in some sorting order " Default sorting order "
 		2. Duplicates not allowed
 		
 		We can not create object for Interface that's why we create object for grand child class
 		
 		
 		 * SortedSet interface is the child interface of Set interface
		 * Represents the group of objects as a single entity where
		  * duplicates are not allowed
		  * According to some sorting order
		   * Default sorting order
		 * SortedSet interface specific methods
		 * Objects can't be created
		 * Parent interface of NavigableSet interface
 
 */
		
		SortedSet ss = new TreeSet(); 
		
		
	}

}
