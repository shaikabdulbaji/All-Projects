package interfaces_and_abstractclasses;

public abstract class oBird extends oAnimal {

	@Override
	public void eating() {
		
		System.out.println(" Bird is Eating ");
	}
	
	
	/*
		 If we don't want to implement all methods here then we get error to overcome this we put chils class as 
		 abstract.
		 Then who will implemet the remaining unimplemented methods, then we create another child class their we can
		 implement remaining child classes.
		 sub-class inheriting the super-class needs to implement the abstract specfied methods in super-class.
	*/
	
}
