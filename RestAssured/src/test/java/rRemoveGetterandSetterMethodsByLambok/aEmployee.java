package rRemoveGetterandSetterMethodsByLambok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class aEmployee {
	
	private String name;
	private int age; 
	private int salary;
	
	/*
	 * Before "Lambok" we use Getter and Setter methods to customize and retrive the data, there are so 
	   many disadvantage there. To overcome those we go for "Lambok" andd use "@Getter and @Setter"
	   methods
	   
	 * To use "Lambok" 1st we add dependencies from mvn repository then we go to site "project.lambok.org"
	   and go to install and click on eclipse and copy plugin and past in eclipse ide 
	   install(Under Help) new software option.
	 * By this lambok we can easily inster or remove parameters from POJO class
	 */

}
