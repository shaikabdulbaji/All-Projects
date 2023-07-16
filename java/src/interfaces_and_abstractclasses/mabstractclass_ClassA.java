package interfaces_and_abstractclasses;

/*
public class mabstractclass_introduction {   // Normal class

	When you have a requirement for the parent class to provide a default implementation of certain methods, but other
	are open for their implementation in the child classes 
		unlike interfaces which are fully abstract, abstract classes are " partially " abstract
	
	abstract classs can have both abstract and non-abstract methods

}
*/


public abstract class mabstractclass_ClassA {				// abstract class
	
	public void methodX()						// Implementation here
	{
		System.out.println(" Inside methodX ");
	}
	
	public abstract void methodY();				// Don't want to implement here (OR) Definition here

}
