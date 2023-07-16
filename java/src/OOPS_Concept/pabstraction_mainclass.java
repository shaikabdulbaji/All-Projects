package OOPS_Concept;

public class pabstraction_mainclass {

	public static void main(String[] args) {
	
/*
		oabstraction oa = new oabstraction();
		 we can't create object for parent class in this case then how we can achive this by creating object for child class.
		 By creating object for child class we can achive the methods which are inside the parent class.
*/	
		pabstraction_childclass pac = new pabstraction_childclass();
		pac.methodtwo(); // This is method in parent class
		pac.classone(); // This is method in child class
		
		
		
		
	}

}
