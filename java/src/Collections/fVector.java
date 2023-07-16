package Collections;

import java.util.Stack;

public class fVector {

	public static void main(String[] args) {

		/*
		Differences between ArrayList and Vector ?
		
		ArrayList :
		Default capacity of ArrayList is 10
		Inroduced in 1.2 version of Java, so Non Legacy Class. 
		When it reaches its saturation point size increases by 3/2+1 
         ex: 10*3 
		    ------ + 1 = 16 
		      2
		Performance is higher in ArrayList(Not Thread Safe) non-synchronized means multiple threads will attack
		It follow indexing and list(I) is parent class of ArrayList and collection(I) is grand parent of ArrayList.
		 
		Vector :
		Default capacity of Vector is 10
		Introduced in 1.0 version of Java, so Legacy Class. 
		when it reaches its saturation point size increases by its equal size ex: 10+10=20 
		Performance is poor in Vector(Thread Safe) synchronized means single threads will attack
		It follow indexing and list(I) is parent class of Vector and collection(I) is grand parent of Vector.
		
		Introduced in 1.0 version, so Vector is also referred as Legacy class.
		• Heterogenous objects are allowed.
		• Null objects are allowed.
		• Insertion order is preserved.
		• Duplicate objects are allowed.
		• Datastructure is growable array.
		241 G.Ravi Kiran_KCCM5
		• cursors - ListIterator and Iterator 
		• Same process to write program, only in place of arraylist object 
		create object of Vector. 

		Vector methods :
		addElement()        // Used for adding Hetrogenous elements
		removeAllElements()
		removeElement()
		removeElementAt()
		elementAt()
		elements()
		size()
		lastElement()
		firstElement()
		
		Vector v = new Vector();
		v.addElement("ab");
		v.addElement(9);
		v.addElement(true);
		v.addElement("ab"); // Duplicates are allowed
		v.addElement(null);

		System.out.println(v.getElement(3));
*/		
		Stack s = new Stack();
		s.push("Srun");
		s.push(9);
		s.push(true);
		s.push(9.5);
		
		System.out.println(s);
		
		System.out.println(s.pop()); // retrive last element and removed from object
		
		System.out.println(s);
		
		System.out.println(s.peek()); // retrive first element but won't remove it
		
		System.out.println(s);
		
		System.out.println(s.empty()); // empty or not true or false empty=true or not empty=false
		
		System.out.println(s.search(9));
		System.out.println(s.search("AB"));
		
		
		
		
		
		
	}

}
 