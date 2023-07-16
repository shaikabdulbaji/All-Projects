package interfaces_and_abstractclasses;

public abstract class qAnimal {

/*
	This q alphabet concept is related to abstract classes and object creation
	
	 For abstract classes Thers is "NO" object creation
	 For Interfaces there is "NO" object creation
*/	
	
	int speed;
	int legscount;
	
	public abstract void eating();
	
	public void sleeping()
	{
		System.out.println(" Animal is Sleeping ");
	}

}
