package Modifiers;

public class ddefault_access_modifier_classB {
	
	public void methodB()
	{
		ddefault_access_modifier_classA a = new ddefault_access_modifier_classA();
		
		a.a=5;
		
		a.methodA();
		
		System.out.println("The valu of a is"+a.a);
	}
	
	

}
