package Modifiers;

public class eprotected_access_modifier_classB {
	
	public void method()
	{
		eprotected_access_modifier_classA a = new eprotected_access_modifier_classA();
		
		a.a = 5;
		
		a.methoA();
	}

}
