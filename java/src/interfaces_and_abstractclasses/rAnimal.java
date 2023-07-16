package interfaces_and_abstractclasses;

public abstract class rAnimal {
	
	/*
	 	
	 	This r alphabet concept is related to abstract classes and Fields
	 	
	 	Mainly Fields = Variables
	 	
	 	* Can we create fields inside the abstract classes ? Yes.
	 	* Are there any restrictions or any differences btw the fields created in abstract and 
	 	  normal classes ? No.
	 	
	 	For abstract classes there are no restrictions for creating variables the variables inside
	 	the abstract classes are same as variables in normal classes.
	 	eg : public or private or protected or static or final int speed;
	 	
	 	For interfaces there are restrictions they accept only static and final, if you forget to give 
	 	the access modifier it will defaultly taken as static and final
	 	
	 */
	
	public int speed; 
	private int speed1; 
	static int speed2;
	final int speed3 = 4;  // for final we ant to give some value
	protected int speed4; 




	

}
