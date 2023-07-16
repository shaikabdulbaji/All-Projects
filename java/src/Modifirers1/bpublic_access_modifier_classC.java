package Modifirers1;

import Modifiers.bpublic_access_modifier_classA;

public class bpublic_access_modifier_classC {
	
	public void methodC()
	{
		bpublic_access_modifier_classA a = new bpublic_access_modifier_classA();
		
		a.a=6;
		
		a.methodA();
	}

}
