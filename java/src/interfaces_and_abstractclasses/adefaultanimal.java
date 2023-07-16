package interfaces_and_abstractclasses;

public interface adefaultanimal {
	
	void eat();
	
//	void legs();  If we create a method like this it will gives error in every child class, To over come this we create method like given below :
	
	default void legs()   // This is default method in interface
	{
		System.out.println(" All Animals has four legs ");
	}
	
	

}
