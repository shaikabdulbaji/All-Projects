package Collections;

import java.util.ArrayList;
import java.util.List;

public class cList_Interface {

	public static void main(String[] args) {

		/*
		 * List l = new List();
		  
		 * we can't create object for any interface in java and we can create objects
		 * for child classes.
		 * 
		 * . add(object):Used to add objects • addAll(Collection): Used to copy one
		 * collection objects into another • remove(Object): Used to Removes object •
		 * remove(Index): Used to Remove the Object at given index • set(Index,Object):
		 * it replaces the old object with new object at given index • get(index):
		 * Retrieves the object at given index 229 G.Ravi Kiran_KCCM5 • isEmpty(): check
		 * whether Collections empty or not • contains(Object): check whether Object is
		 * present or not • containsAll(Collection): checks whether content of one
		 * collection is present in another collection or not. • removeAll(Collection):
		 * Removes whole objects of collection • size(): Provides size of
		 * collection(always calculates from 1) • Collections.sort(): Sort the
		 * collection in ascending order(In case char's as per unicode order) •
		 * Collections.reverse(): Sort in reverse way
		  
		 * List<Interface>1.2 version 
		 * List is an Interface which extends Collection Interface 
		 * List is implemented by 3 different classes 
		 * 1.ArrayList
		 * 2.LinkedList 
		 * 3.vector 
		 * List follows Index Based process.
		 * List allows heterogeneous Objects. 
		 * List allows Null objects.
		  
		 */

		// For accessing all methods of List_Interface we can create objects for child
		// classes of list_interface

		List l = new ArrayList();

		l.add(l);
		l.addAll(l);
		l.remove(0);
		l.remove(l);
		l.set(0, l);
		l.get(0);
		l.isEmpty();
		l.iterator();
		l.size();

	}

}
