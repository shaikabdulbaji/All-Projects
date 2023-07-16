package Modifiers;

public abstract class habstract_non_access_modifier_classA {

	
	/*
	 
	 	* abstract is Non-access modifier
	    * abstract is used with methods and classes
	 
	 	Variables :
	 	---------
	 	* If you aasign abstract with variables we get compile error
		// Illegal modifier for the field a; only public, protected, private, static, final, transient & volatile are permitted
		abstract int a;
		
		Methods :
		-------
		* Java will not allow you have the method body
		* if you give abstract to any method by default we want to put class also as abstract
		* if you give atleast abstract to one method by default we want to put class also as abstract
		* If you don't want to 100% implimentation(partial), then we go to abstrat.
		* The partial implementation is methodA is fully implemented and methodB is only stated but not implemented.
		* Then who will implement the unimplemented method, the child call will do this.
	*/
		// we get comiple error here, if you give method body, error is : Abstract methods do not specify a body
		public void methodA()
		{
			
		}
		
		// we get comiple error here, if you give method body
		public abstract void methodB();
		// The abstract method methodB in type habstract_non_access_modifier_classA can only be defined by an abstract class
		
		 
	
	
}
