package OOPS_Concept;

public class mPolymorphismclasstwo1 extends mPolymorphismclasstwo {

/*
 	
    Overriding :
	When a method in the child class(i.e. sub-class) is duplicate of a method in parent class(i.e. super-class), then the method in the
	sub-class is said to override the method in super-class

	public void add(int a, int b)     // same method in parent class and child class is called overriding
	{
		System.out.println("Child " +(a+b)); // while calling if you give two parameters child will print based on constructor
	}
*/
	
	public void add(int a, int b, int c)     
	{
		System.out.println("Child " +(a+b+c)); 
	}
	
}
