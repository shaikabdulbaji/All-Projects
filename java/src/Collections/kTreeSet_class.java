package Collections;

import java.util.TreeSet;

public class kTreeSet_class {

	public static void main(String[] args) {

/*
 
		 * TreeSet is the child class of SortedSet and NavigableSet interfaces
		 * Represents the group of objects as a single entity where
		  * duplicates are not allowed
		  * According to some sorting order
		   * Default sorting order 
		   * customized sorting order
		   * " Heterogeneous objects are not allowed (For Sorting needs) "
		  * Object Classes should be implementing Comparable Interface (StringBuffer is not supported)
		  * " null insertion is not allowed (Exception) "
		 * Default Sorting Order followed by empty TreeSet() constructor
		  * Comparable Interface and compareTo() method
		  * compareTo() has return type int
		   * Have to be used like this obj1.compareTo(obj2)
		 * TreeSet(Comparator) needs to be used for customized sorting order
		  * Comparator interface meant for customized sorting order
		  * compare() method return type int
		   * compare(obj1,obj2) 
		  * Inserting Integer Objects in descending order
		  * Inserting Integer Objects in Insertion order
		  * Inserting Integer Objects in reverse of Insertion order
		  * Inserting String objects in reverse of Alphabetical order
		  * Inserting String Objects in Insertion order
		  * Inserting String Objects in reverse of Insertion order
		 * SortedSet specific methods demonstration
		 * NavigableSet specific methods demonstration

		TreeSet(c) :
		----------
		It is a class which implements set interface 
		
		Features:
		• Introduced in 1.2v
		• Heterogenous objects are not allowed if we add we will get class cast exception
		• Duplicates are not allowed .In case if we add we won't get compile time error, it will just add once
		• No NULL object is allowed
		• Data structure is tree.
		• Output is in Sorted Order.
		• Set is only uni directional so it supports only Iterator
		
		Methods :
		• In TreeSet output will defaultly in sorted order 
		• It allows only homogenous objects i.e it allows only comparable type of objects, if we add heterogeneous objects it gives ClassCastExc.
		• If we add null objects it gives NullPointerException. 
		• first()-->provides first object 
		• last()--->provides last object 
		• pollFirst()-->provides first object and delete it from tree 
		• pollLast()--->provides last object and delete it from tree
		
		//Ex-1 :
		import java.util.*; 
		public class Seventh 
		{ 
			public static void main(String[] args) 
			{ 
				TreeSet<Object> s1=new TreeSet<>(); 
				 s1.add("Rohan"); 
				 s1.add("Riya"); 
				 s1.add("Pooja"); 
				 s1.add(445); 
				 s1.add('A'); 
				 System.out.println("Hash set objectss are: "+s1); 
			}
		} 
		
		Output:
		Exception in thread "main" java.lang.ClassCastException: 
		java.base/java.lang.String cannot be cast to java.base/java.lang.Integer
		
		//Ex-2 :
		import java.util.*; 
		public class Treedemo 
		{ 
			 public static void main(String[] args) 
			 { 
				 TreeSet<Object> s1=new TreeSet<>(); 
				 s1.add("Java"); 
				 s1.add("SQL"); 
				 s1.add("APtitude"); 
				 s1.add("J2EE"); 
				 System.out.println("Treeset Objects are: "+s1); 
				 //s1.add(122); 
				 //s1.add('A'); 
				 //s1.add(new Student("John",566)); 
				 //System.out.println("Tree set after adding heterogenous obj 
				:"+s1); 
				 //s1.add(null); 
				 //System.out.println("After adding null :"+s1); 
				 System.out.println( s1.first()); 
				 System.out.println(s1.last()); 
				 System.out.println(s1.pollFirst()); 
				 System.out.println(s1.pollLast()); 
				 System.out.println(s1.contains("APtitude")); 
				 System.out.println(s1.contains("SQL")); 
			}
		} 
		Output:
		Treeset Objects are: [APtitude, J2EE, Java, SQL] 
		APtitude 
		SQL 
		APtitude 
		SQL 
		false 
		false 
		
		Difference between SortedSet(I) and NavigableSet(I) :
 		
 		SortedSet(I) :
 		1. Objects will print in some sorting order " Default sorting order " and " Customize sorting order " 
 			eg :
 				1. Integer Objects --> Ascending order
 				2. String Objects --> Alphabetical order
 		2. Duplicate Objects not allowed
 		
 		NavigableSet(I) :
 		1. There are some specific methods for Navigation purpose.
 		2. Duplicate Objects not allowed
 		
 		TreeSet(I) :
 		1. Objects will print in some sorting order " Default sorting order " and " Customize sorting order " internally it was used compareTo().
 			eg :
 				1. Integer Objects --> Ascending order
 				2. String Objects --> Alphabetical order
 		2. Duplicate Objects not allowed
 		3. If we try to add Hetrogenous Objects we get ClassCast Exception
	
		// Default Sorting Order
		TreeSet t = new TreeSet(); 
		
		// " If the constructor is empty that is Default sorting order "
		// " If the constructor is not empty that is Customized sorting order "
		 * Comparable = Default Sorting Order
		 * Comparator = Customized Sorting Order
		
		t.add("Abdul");
		t.add("Baji");
		t.add("Shaik");
		t.add("Abdul"); // Duplicates are not alowed but it will not give any compile error
		t.add(null);  // we will get Null Pointer Exception
//		t.add(9);
//		t.add(20);
//		t.add(3);
//		t.add(10);
		
		System.out.println(t);
		
		
		Integer a = 3;
		Integer b = 4;
		// If a and b are equal then result is zero.
		System.out.println(a.compareTo(b)); 
		System.out.println(b.compareTo(a));
		
		// Customized Sorting Order
		TreeSet t = new TreeSet(new TreeSet_class_comparator());
		
//		t.add(9);
//		t.add(20);
//		t.add(3);
//		t.add(10);
//		t.add(1);
//		t.add(23);
//		t.add(15);
		
		t.add("Abdul");
		t.add("Baji");
		t.add("Shaik");
		t.add("Abdul");
		
		System.out.println(t);

		
		System.out.println("----------------------------------------------");
		
		// SortedSet(I) : SortedSet is an interface we can't create object for interface but we can create object by using child class.
		 * This SortedSet mmethods are for Sorting purpose
		
		TreeSet t = new TreeSet();
		
		t.add(9);
		t.add(20);
		t.add(3);
		t.add(10);
		t.add(1);
		t.add(23);
		t.add(15);
		
		System.out.println(t);
		
		System.out.println(t.first()); // This print first object
		System.out.println(t.last()); // This print last object
		System.out.println(t.headSet(9)); // This print objects before given object like it print objects before (<9).
		System.out.println(t.tailSet(9)); // This print objects after or equal to given object like it print objects after or equal (>=9).
		System.out.println(t.subSet(15, 23)); // This will print btw given objects
		
		System.out.println("----------------------------------------------");
	
		// NavigableSet : NavigableSet is an interface we can't create object for interface but we can create object by using child class.
		// This NavigableSet methods are for Navigation purpose
		
		TreeSet<Object> t = new TreeSet<>();
		
		t.add(9);
		t.add(20);
		t.add(3);
		t.add(10);
		t.add(1);
		t.add(23);
		t.add(15);
		
		System.out.println(t);
		
		System.out.println(t.lower(9)); // This method will print objects below <9 and in that objects which object is greatest and print that.
		
		System.out.println(t.higher(9)); // This method will print objects above >9 and in that objects which object is lowest and print that.
		
		System.out.println(t.floor(9)); // This method will print objects <=9 and in that objects which object is greatest and print that.
		
		System.out.println(t.floor(10)); // This method will print objects <=10 and in that objects which object is greatest and print that.

		System.out.println(t.ceiling(9)); // This method will print objects >=9 and in that objects which object is least and print that.

		System.out.println(t.ceiling(10)); // This method will print objects >=10 and in that objects which object is least and print that.

		System.out.println(t.descendingSet()); // This method will print objects from High to Low and print that.
		
		System.out.println(t.pollFirst()); // This method will print First object and remove from objects
		System.out.println(t);
		
		System.out.println(t.pollLast()); // This method will print Last object and remove from objects
		System.out.println(t);
*/
	}

}

