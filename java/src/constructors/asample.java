package constructors;

public class asample {

/*
	final int count;  if we want to initialize a value to variable with keyword as final, in 2 ways we can do
	
	1. public void initializeCount()   // we get an error while initialing an value to variable, To overcome this we do like below
	   {
	   		count = 5;
	   }
	
	2. final int count = 5;  // directly we intilaize here only that is one way with no error there is no risk if we initilaize directly
	
	I  don't want to do like this in alernate way i want to do.
	
	There is one way to intilize by using constructor
	
	
	final int count;
	
	public asample()
	{
		count = 5;     // By using constructor we initialize the value to variable
	}
	
	// If we have more than one constructor (OR) multiple constructor then all other constructors also to initialize
	public asample(int a)
	{
		count = 5;
	}
*/
	
	static final int count = 5;  // In this case we initiliaze directly there is no another way
	
	
}
