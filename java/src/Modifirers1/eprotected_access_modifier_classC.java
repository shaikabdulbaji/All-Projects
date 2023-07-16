package Modifirers1;

import Modifiers.eprotected_access_modifier_classA;

public class eprotected_access_modifier_classC extends eprotected_access_modifier_classA {
	
	public void methodC()
	{
//		eprotected_access_modifier_classA b = new eprotected_access_modifier_classA();
		
	//  eprotected_access_modifier_classA cannot be resolved to a type
		
		// if we want to access anything we can put public before that
		
		
		
		// if we want to access anything we can put protected before that, this is special refer classA
		System.out.println("The value of a is"+a);
	}
}
