package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class dArrayList_Interface {

	public static void main(String[] args) {

		/*
		 
		 * Child class of List Interface
	     * All the methods of Parent interfaces are inherited
		 * Purpose - Grouping individual objects
		 * Adding objects into the ArrayList (Explain indexing) using add() method
		 * Printing the ArrayList - []
		 * Retrieving the objects from the ArrayList using index using get() method
		 * Object will be returned
		 * Finding the size of the ArrayList using size() method
		 * Using for loop for retrieving the objects
		 * Using for-each loop for retrieving the objects
		 * Duplicates are allowed
		 * Insertion order is preserved
		 * null insertion is allowed
		 * Remove the objects from the ArrayList using remove(object)
		 * ArrayList is a re-sizable Array
		 * We can either add or remove the objects from the ArrayList
		 * Heterogeneous objects are allowed by default 
		 * Storing specific type of objects by specifying the wrapper classes, String, Objects etc. 
		 * Primitive data types cannot be provided in Generics
		 * Its not mandatory to provide the generic type at the object creation end
		 * Removing all the ArrayList objects at a go using clear() method
		 * Checking whether the ArrayList is Empty using isEmpty() method
		 * Checking whether the provided object is available in the ArrayList using contains() method
		 * Converting an ArrayList to Array using toArray() method
		 * Adding at a particular index using add(index,object) method
		 * Removing the object at a particular index using remove(index) method
		 * Setting the required object at a particular index using set(index,newObject)
		 * This will return the replaced object
		 * Retrieving the index position of the given object using indexOf(Object) method
		 * This will return -1 in case the given object is not available
		 * Retrieving the last occurrence index of the duplicated object in the ArrayList using lastIndexOf(Object) method
		 * Assigning the object of ArrayList to Collection interface
		 * Assigning the object of ArrayList to List interface
		 * Using Collections.sort() for soring the ArrayList objects
		 * Using iterator() method with ArrayList
		 * Using listIterator() method with ArrayList
		 * Best suitable when your frequent operation is retrieval
		 * Not suitable when your frequent operation is adding or removal of objects in between the ArrayList
		  
		  
		 ArrayList : 
		 
		 * ArrayList is a class which implements List interface 
		 * For checking methods javap java.util.Arraylist 
		 
		 * characteristics of ArrayList: 
		 * 1.It is introduced in java 1.2-version.
		 * 2.ArrayList stores Heterogeneous data . 
		 * 3.It is possible to add NULL objects in ArrayList. 
		 * 4.It allows Duplicate objects. 
		 * 5.In ArrayList Insertion Order is preserved i.e the way we added objects the way it will be printed. 
		 * 6.It follows Data Structure as growable size array. 
		 * 7.Iterator and ListIterator cursors are used.
		 
		 */
		
		ArrayList<Object> al = new ArrayList<>();  // In this new ArrayList<>(); is Object.
		
		// Using add() method we can add objects to ArrayList
		al.add("Abdul"); //0 index
		al.add("Shaik"); //1 index
		al.add("Baji");  //2 index
//		al.add("Shaik");//3 index " Duplicates are allowed "
//		al.add(9);
//		al.add(9.5);
//		al.add(10.55);
//		al.add(true);
//		al.add('a');
//		al.add(null);//4 index Null is allowed, Null means nothing (or) no object
/*
		System.out.println("Before clearing list");
		System.out.println(al.isEmpty());
		System.out.println(al); // Insertion order is allowed means it will print in order.
		
		System.out.println("-----------------------------");
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al);
		}
		
		System.out.println("-----------------------------");

		// for-each loop can be used for arrays and collections
		for(Object a : al)
		{
			System.out.println(a);
		}
		
		System.out.println("-----------------------------");
		
		// Using get() method we can Retrieve objects from ArrayList
		Object g = al.get(2);
		System.out.println(g);
			// (or)
		System.out.println(al.get(1));
		
		System.out.println("-----------------------------");
		
		// Using size() method we can get size of objects from ArrayList
		System.out.println(al.size());
		
		System.out.println("-----------------------------");
		
		// Using remove(object) method we can get remove of objects from ArrayList
		al.remove("Abdul");
		System.out.println(al);

		System.out.println("-----------------------------");
		
		// Using clear() method we can get remove all objects from ArrayList
		al.clear();
		System.out.println(al);
		
		System.out.println("-----------------------------");
		
		// Using clear() method we can get remove all objects from ArrayList
		al.clear();
		System.out.println(al);
		System.out.println("After clearing list");
		System.out.println(al.isEmpty());
		
		System.out.println("-----------------------------");
		
		// Using contains() method we can know wheather the object is there or not in ArrayList
		System.out.println(al.contains(9));
		System.out.println(al.contains(true));
		
		System.out.println("-----------------------------");
		

		// Using toArray() method for converting ArrayList to Array
		
		Object[] obj = al.toArray();
		System.out.println(obj[0]);

		// Using to add(index,object) this method is used to add any object at any required position
		al.add(3, "Kareem");
		System.out.println(al);

		
		// Using to remove(index,object) this method is used to remove any object at any required position
		Object removedobject = al.remove(3);
		System.out.println("The Object "+removedobject+" is Removed");

		// Using to set(index,new object) this method is used to replace any object at with old object
		al.set(0, "Hussain");
		System.out.println(al);

		// Using to indexOf(object) this method is used to get any object's index,  If we give correct object we get correct index, 
		//if we give wrong object we get -1.
		System.out.println(al.indexOf(9));
		System.out.println(al.indexOf(70));
		
		// Using to lastIndexOf(object) this method is used to get last object's index
		System.out.println(al.lastIndexOf(null));
		System.out.println(al.lastIndexOf('a'));

		// Assigning the ArrayList to Collection Interface
		Collection<String> c = new ArrayList<>(); 
		//we are assgning the object of ArrayList predefined class to variable(c) of the collection interface
		// In this case we will only access collection specific method's we can't access ArrayList methods.
		c.add("arun");
		List<String> li = new ArrayList<>();
		// In this case we can access List interface methods and it's parent class collection interface methods
		li.add("AB");		// This is related to collection
		li.add(10, "Amma"); // This is related to List
		
		// Using sort() method all the objects in ArrayList are sorted in ascending order (or) Alphabetical order
		Collections.sort(al);
		System.out.println(al);
		
		Cursors : 
		-------- 
		• This is the special characteristics given for collection concepts
		• Using cursors we can retrieve the objects in collection one by one
		• they are of 2 types -
		1.Iterator
		2.ListIterator
		
		1.Iterator 
		---------- 
		• Iterator is an interface which is used to traverse the list in forward direction.
		• Basically it provides the privilige to access the objects without using index.
		
		interface Iterator 
		{ 
		 public boolean hasNext(); 
		 public object next(); 
		 public void remove(); 
		} 
		
		hasNext(): 
		• It returns true, if there is Object available in collection.
		next(): 
		• It returns current Object and move the cursor to next Object.
		
		2.ListIterator 
		-------------- 
		• ListIterator is an interface which provides the facility to traverse the list in forward as well as backward direction.
		
		interface ListIterator 
		{ 
		 public boolean hasNext(); 
		 public object next(); 
		 public void remove(); 
		 public boolean hasPrevious(); 
		 public object previous(); 
		 public void add(); 
		234 G.Ravi Kiran_KCCM5
		} 
		
		hasPrevious(): 
		• Returns true, if object is available to iterate from previous direction. 
		previous(): 
		• prints the current object and move the cursor to next object in previous direction. 
		hasNext(): 
		• It returns true, if there is Object available. 
		next(): 
		• It returns current Object and move cursor to next Object.

		// Using iterator() method we can use this instead of for loop and for-each loop to retreive the objects one by one from ArrayList
		Iterator<String> itr = al.iterator();
		// This Iterator has hasnext() and next() methods and iterator() method belongs to collections interface
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		// listIterator(I) method is advanced method and it is belongs to List(I) method and iterator() method belongs to collections(I) method
		// listIterator(I) is child class of iterator(I)
		// why it is advance means it has { hasPrevious() and previous() and hasNext() and next() }
		ListIterator<Object> litr = al.listIterator();
		
		litr.next();
		litr.next();
		litr.next();
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		
		Conclusion :
		1. Where and when particularly the ArrayLlist is used.
		2. In case of mostly (or) frequently uses Retrival only then only we use ArrayList.
		3. We don't go to Arraaylist in case of adding or replacing or removing the objects why because while doing these three actions +
		   + waant to shift objects in right or left in memory, more work for memory that's y we not recommended ArrayList for this operation
		4. In case of retrival we use get(Index) and we get any object.
*/
		
		
		
	}

}
