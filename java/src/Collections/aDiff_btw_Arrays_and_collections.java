package Collections;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class aDiff_btw_Arrays_and_collections {

	public static void main(String[] args) {
		
		/*
		 int[] a = new int[3];
		 Arrays are fixed in size and after adding s[3]we will "not get any compile time error" but "we will get +
		 run time error" we are getting array out of bound exception
		 
		  " For Testers Queue and Dictnary and weakHashMap and IdentityHashMap and SortedMap(I) ans NavigableMap(I) 
		    and TreeMap(I) are not used by Testers "
		 		  
		   Arrays :-
		   ------ 
		 * Arrays are used to store collection of homogeneous(similar) data.
		 * Arrays are fixed in size. ex : int a[]=new int[3]; Arrays can deal with primitive as well as wrapper classes 
		   Primitive : int a[]; 
		   Wrapper class :Integer a[]; 
		 * Arrays does not have any underlying data structure.
		 * Arrays does not contains predefine methods(add, sorting, removing, replacing) which makes manipulation of 
		   data difficult. 
		 * We should use arrays, when we already knows the elements in advance. 
		 * Memory wise array is not preferred. 
		 * Perfomance wise arays are preferred.
		  
		   Collections :-
		   ----------- 
		 * Collections is used to store heterogeneous data as well as homogeneous data. 
		 * Collections are numerous (growable in size). 
		 * collections purely deals with wrapper classes(Objects).
		   ArrayList<int>a1;(Invalid)
		   ArrayList<Integer>a1;(Valid) 
		 * Every classes of Collection have data structure.
		 * In collection 80% support is by predefine API's(App Programming Interface).
		 * We should go for collection, when we don't know the elements in advance.
		 * Memory wise collections is prefered. 
		 * Performance wise collection is not preferred.
		  
		 */

		// int[] = {9,10,"ab"};
		// To over come this we can go to objects
		// Object[] a = {9,true,9.5,10.55,"Abdul"}; Here the problem in objects is we
		// want go manually and write as Object[]
		// To over come this we go to collection in collections it is by default
		// Hetrogenous objects.

		String[] s = new String[3];
		s[0] = "Shaik";
		s[1] = "Abdul";
		s[2] = "Baji";
//		s[3] = "Rasool";

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		System.out.println("-------------------------------------");

		// To overcome this problem in Arrays we go to Collections

		ArrayList al = new ArrayList();

		al.add("Abdul");
		al.add("Shaik");
		al.add("Baji");
		al.add("Shaik");
		al.add(9);
		al.add(9.5);
		al.add(true);
		al.add('s');

		System.out.println(al);

		al.remove(3);
		System.out.println(al);
		
		// To overcome this warning we go to generics

		ArrayList<String> al1 = new ArrayList<String>();

		al1.add("Abdul");
		al1.add("Shaik");
		al1.add("Baji");
		al1.add("Shaik");
//		al1.add(9);
//		al1.add(9.5);
//		al1.add(true);
//		al1.add('s');
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
//		al2.add("Shaik"); 
		al2.add(9);
		
		ArrayList<Boolean> al3 = new ArrayList<Boolean>();
		
//		al3.add(9);
//		al3.add('s');
		al3.add(true);
		
		ArrayList<Double> al5 = new ArrayList<Double>();
		
//		al3.add(9);
//		al3.add('s');
		al5.add(9.55);
		
		// To over come this warning problem we simple write generic as objects and we can give hetrogenous values.
		
		ArrayList<Object> al4 = new ArrayList<Object>();
		
		al4.add(9.5);
		al4.add("Shaik"); 
		al4.add(9);
		
		// In place of generics we can give only wrapper classes only but not premitive data types

/*
		Collections Framework :
			1. Collection(I)
			2. Map(I)
			3. Others
			
			1.1 List(I)
			1.2 Set(I)
			1.3 Queue(I)
			
			1.1.1 ArrayList(c)
			1.1.2 LinkedList(c)
			1.1.3 Vector(c)
			1.1.3.1 Stack(c)
			
			1.2.1 HashSet(c)
			1.2.1.1 LinkedHashSet(c)
			1.2.2 SortedSet(I)
			1.2.2.1 NavigableSet(I)
			1.2.2.2 TreeSet(c)
			
			1.3.1 PriorityQueue(c)
			1.3.2 BlockingQueue(c)
			1.3.2.1 PriorityBlockingQueue(c)
			1.3.2.2 LinkedBlockingQueue(c)
			1.3.2.3 Other classes
			
			2.1 HashMap(c)
			2.1.2 LinkedHashMap(c)
			2.2 WeakHashMap(c)
			2.3 IdentityHashMap(c)
			2.4.0 Dictionary(c) // This is parent class of Hashtable
			2.4 Hashtable(c) // In this "t" is small other else are camel case words
			2.4.1 Properties(c)
			2.5 SortedMap(I)
			2.5.1 NavigableMap(I)
			2.5.2 TreeMap(c)
			
			3.1 Cursors // Neither class or interface
			3.1.1 Enumaration(I)
			3.1.2 Iterator(I)
			3.1.2.1 ListIterator(I)
			3.2 Sorting
			3.2.1 Comparable(I)
			3.2.2 Comparator(I)
			3.3 Utility classes
			3.3.1 Collection(c)
			3.3.2 Arrays(c)
			
			" For Interfaces we can't create objects else we create objects for classes "
		
*/
	}

}
