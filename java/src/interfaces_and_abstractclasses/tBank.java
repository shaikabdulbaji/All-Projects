package interfaces_and_abstractclasses;

public interface tBank {
	
	/*
	 
	 	* The methods inside the interface are by default public and abstract(no body)
	 	*
	 	
	 	 Can we create a method having body inside the interfaces ?
	 	 It depends on what version of java we are using
	 	 Java < 8 -----> No ( 100% abstraction )
	 	 Java >= 8 -----> Yes ( default or static )
	 	
	 	defalut keyword can be used only with the methods in interfaces but not in classes
	 	
	    This all methods will work the compiler is above or equal to 8, if we give less than 8 we get compiler error
	 	
	 */
	
	
	void methodA();
	
	default void methodB()
	{
		System.out.println(" Inside default methodB of bank interface ");
	}
	
	static void methodC()
	{
		System.out.println(" Inside default methodC of bank interface ");
	}

}
