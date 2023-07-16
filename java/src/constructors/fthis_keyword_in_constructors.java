package constructors;

public class fthis_keyword_in_constructors {

	// Instance Variable
	String carModel;
	int carCost;
	String carColor;
	
	public fthis_keyword_in_constructors(String carModel, int carCost, String carColor)
	{
		/*
		 
		carModel = carModel;
		carCost = carCost;
		carColor = carColor;
		
		The Java is not assigning instance variable = parameter, it assigning instance variable = instance variable
        and assigning parameter = parameter.
        
        Java was not differentiate instance variable & parameter, To overcome this warning we use "this" keyword
        
        The role of "this"  keyword is to differentiate instance variables & parameters, when instance variables 
        names and parameters names are same.
        
		*/
		
		this.carModel = carModel;
		this.carCost = carCost;
		this.carColor = carColor;
		
		
	}
	
}
