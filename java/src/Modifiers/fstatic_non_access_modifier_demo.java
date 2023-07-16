package Modifiers;

public class fstatic_non_access_modifier_demo {

	public static void main(String[] args) {
		
/*
 		* static variables need to be accessed with the help of Class name, as they belong to the Class memory
		* static variables are generally used to store common data, whereas Object variables/Instance variables 
		  are used to store Object-specific data.
 */

		fstatic_non_access_modifier_car benz = new fstatic_non_access_modifier_car();
		
		benz.milage = 10;
		benz.cost = 50000000;
		System.out.println("The no.of wheels for car is :"+fstatic_non_access_modifier_car.wheels);
		
        fstatic_non_access_modifier_car audi = new fstatic_non_access_modifier_car();
		
        audi.milage = 10;
        audi.cost = 50000000;
		System.out.println("The no.of wheels for car is :"+fstatic_non_access_modifier_car.wheels);
		
	}

}
