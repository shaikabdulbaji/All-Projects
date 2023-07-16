package Modifiers;

public class bpublic_access_modifier_classA {
	
	/*
	 	* public(keyword) modifier was use with classes, variables, methods, constructors
	 	
	 	Classes :
	 	-------
	 	* we will be able to access all the above things :
	 	 	1. outside the class
	 	 	2. outside the package
	 	* If we specify a class as public we can access it in inside package(bpublic_access_modifier_classB)
	 	  and outside package(bpublic_access_modifier_classC)
	 	  
	 	Variables :
	 	---------
	 	* If we specify a variable as public we access it from anywhere means inside & outside package means we can 
	 	  access anywhere from project 
	 	  eg :
	 	  public int a;
	 	  
	 	Methods :
	    -------
	    * If we specify a method as public we access it from anywhere means inside & outside package means we can 
	 	  access anywhere from project 
	 	  eg :
	 	  public void methodA()
		  {
				
		  }
		  
		Constructors :
		------------
		* Constructor name is same as class name
	 	  
	 */
	
	
	public int a;
	
	public void methodA()
	{
		
	}
	
	public bpublic_access_modifier_classA()
	{
		
	}

}
