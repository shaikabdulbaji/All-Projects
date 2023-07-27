package rRemoveGetterandSetterMethodsByLambok;

import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class cEmployee {
	
	private String name;
	private int age; 
	private int salary;
	
	/*
	 * Before "@Builder" method we use to customize(or)set any value we use to call .set methods and for
	   retriving that values we use .get methods. It is too complex to us to make them easy we have one
	   annotation from lambok called "@Builder" annotation.
	 * "(toBuilder = true)" parameter with builder is used to customize that values in json
	   
	 */

}
