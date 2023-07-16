package OOPS_Concept;

public class tmethod_hiding {

	public static void main(String[] args) {
		
/*
		
	Parent class					child class					|			Parent class					child class
	------------					-----------					|			------------					-----------
	static methodA()				methodA()					|			methodA()						static methodA()
	{								{					        |			{								{
																|
																|
																|
	}								}							|			}								}
																|
																|																															|
	This is not possible (static and non-static)				|			This is not possible (non-static and static)
																|
																|
																|
																|
-----------------------------------------------------------------------------------------------------------------------------------------------------
																|
	Parent class					child class					|			Parent class					child class
	------------					-----------					|			------------					-----------
	methodA()						methodA()					|			static methodA()				static methodA()
	{   							{							|			{								{
																|
																|
																|			
	}								}							|			}								}
																|
																|
																|
	This combination is possible (non-static & non-static)		|			This combination is possible (static & static)
	This is methodoverriding same method name					|			This is method Hiding in this both parent & child class methods are
	 															|			static																|
																|
																|
	
																	
	Difference between the Method overriding and Method Hiding ?
	* Method Overriding will take Object as reference (based on the object either parent or child will be printed)
	* Method Hiding will take Object class asreference (based on the class either parent or child will be printed) 
																	
																	
*/
	}

}
