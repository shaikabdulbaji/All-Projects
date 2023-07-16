package Modifiers;

public class cprivate_access_modifier_classA {
	
/*
 	* private(keyword) modifier was use with variables, methods, constructors and while using for classes we get (compile error)
 	* They can not be accessed outside the class in which they are created
 	* They can be accessed inside the class in where they got created
 	
 	Classes :
 	-------
 	* They can not be accessed outside the class in which they are created
 	* They can be accessed inside the class in where they got created 
 	  
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
	
	private int a;
	
	private void methodA()
	{
		System.out.println("The value of a is"+a);
		
		cprivate_access_modifier_classA a = new cprivate_access_modifier_classA();
		
	}
	
	private cprivate_access_modifier_classA()
	{
		methodA();
	}

}
