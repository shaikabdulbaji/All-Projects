package constructors;

public class eEmpty_hidden_constructor {
	
	/*
	 
	 	* Don't create a constructor inside a class
	 	* Java compiler will create a hidden empty constructor
	 
	 */
	
	String carModel;
	
	// No constructor 
	// Java Compiler - create a constructor internally
	// Hidden and Empty constructor
	// Public eEmpty_hidden_constructor() { }
	
	public void carDetails()
	{
		System.out.println("The model of the car is :"+carModel);
	}

}
