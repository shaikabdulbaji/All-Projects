package Modifiers;

public class fstatic_non_access_modifier_car {
	
	/*
	    Classes :
	    -------
	    * Java classes cannot be specified with 'static' non-access modifier, if we use it we get compile error
	      eg : public static class fstatic_non_access_modifier_car {  }
	      
	    Variables :
	    ---------
		* Variables declared directly inside the class but outside the methods and are specified with 'static' 
		  modifier are known as static variables
		* Memory allocated to the static variables is different from the memory allocated to the instance variables
		 	local variable : it is directly initialized under the method.
		 	instance variable : it is initialized under the class but outside the method.
		 	static variable : it is initialized under the class but outside the method with static non-access modifier.
		
		* static variables need to be accessed with the help of Class name, as they belong to the Class memory
		* static variables are generally used to store common data, whereas Object variables/Instance variables 
		  are used to store Object-specific data.
		  
		  Methods :
		  -------
		* static can also be used with methods
		* static can only access static stuff
	    
	 */
	
	int cost; //instance variable
	int milage; //instance variable
	static int wheels = 4; //static variable
	
	// Non-static memory  //object memory
	public void methodA()
	{
		// In this we can directly call any variable no restrictions we can call static methods also directly
		System.out.println(cost);
		System.out.println(milage);
		System.out.println(wheels);
		methodC();
		methodB();
	}
	
	public static void methodC()
	{
		
	}

	// static memory  //class memory
	public static void methodB()
	{
		// static can also be used with methods
		System.out.println(wheels);
		// System.out.println(milage); we get compile error because it is not static
		
		// There is a way to access non-static variable or methods
		fstatic_non_access_modifier_car c = new fstatic_non_access_modifier_car();
		System.err.println(c.milage);
		System.out.println(c.cost);
		c.methodA();
		c.methodC();
		
	}
}
