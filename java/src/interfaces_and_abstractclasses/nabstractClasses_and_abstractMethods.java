package interfaces_and_abstractclasses;

public abstract class nabstractClasses_and_abstractMethods {
	
	
	public void methodX()
	{
		System.out.println(" Inside MethodX ");
	}
	
	public void methodY()
	{
		System.out.println(" Inside MethodY ");
	}
	
	public abstract void methodZ(); 
	
	/*
	If the class to be abstract then atleast one method should be abstract
	This is the relation btw abstract class and abstract method
	Normal classes can't contain abstract methods else abstract classes contain atleast one abstract method
	*/

}
