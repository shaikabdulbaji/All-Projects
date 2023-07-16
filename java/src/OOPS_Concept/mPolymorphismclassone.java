package OOPS_Concept;

public class mPolymorphismclassone {
	
	// Overloading - no.of parameters, type of parameters and order of parametrs  (or) same method name with different parameters
/*	
	public void add(int a, int b)     // no.of parameters
	{
		System.out.println(a+b);
	}
	
	public void add(double a, int b)   // type of parameters
	{
		System.out.println(a+b);
	}
	
	public void add(int b, double a)   // Order of parameters
	{
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c)   // no.of parameters
	{
		System.out.println(a+b);
	}
*/
	
	
	// Constructor Overloading :
	// constructor won't have return type
	// Name of the constructor  sholud be same as class name
	
	public mPolymorphismclassone(int a, int b)     // no.of parameters
	{
		System.out.println(a+b);
		
	}
	
	public mPolymorphismclassone(double a, int b)   // type of parameters
	{
		System.out.println(a+b);
	
	}
	
	public mPolymorphismclassone(int b, double a)   // Order of parameters
	{
		System.out.println(a+b);
		
	}
	
	public mPolymorphismclassone(int a, int b, int c)   // no.of parameters
	{
		System.out.println(a+b);
	}
	
	
	
	
}
