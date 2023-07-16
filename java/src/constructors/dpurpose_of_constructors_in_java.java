package constructors;

public class dpurpose_of_constructors_in_java {
	
	/*
	 	purpose_of_constructors_in_java :
	 	-------------------------------
	 	* To simplify the initialization of variables
	 		we can simplify this in two ways :
	 		1. Without constructors
	 		2. With constructors
	 */
	
	String carmodel;
	int carcost;
	String carcolor;
	
	public dpurpose_of_constructors_in_java(String cm, int cc, String ccl)
	{
		carmodel = cm;
		carcost = cc;
		carcolor = ccl;
	}
	
	
	public void cardetails()
	{
		System.out.println("Model of car is :" + carmodel);
		System.out.println("Cost of car is :" + carcost);
		System.out.println("color of car is :" + carcolor);
		System.out.println("---------------------------------");
}
	
	
	
	

}
