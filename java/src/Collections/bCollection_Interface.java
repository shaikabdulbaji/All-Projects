package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class bCollection_Interface {

	public static void main(String[] args) {

		Collection c = new ArrayList();	
		
		c.add(c);           //Object o
		c.addAll(c);        //Collection c
		c.remove(c);        //Object o
		c.removeAll(c);     //Collection c
		c.size();
		c.retainAll(c);
		c.clear();
		c.iterator();
		c.contains(c);      //Object o
		c.containsAll(c);   //Collection c
		c.isEmpty();
		
		
		
		// we can't use these all methods directly, we can implement those methods by using some Interfaces like  List, Set, Map
		
		/*
		characteristics to study for every class - 
		• version
		• homogeneous or hetrogeneous
		• Null object is possible or not
		• duplicates allowed or not
		• insertion order is preserve or not
		• data structure
		• cursors
		*/
		
	}

}
