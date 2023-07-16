package Modifiers;

public class habstract_non_access_modifier_demo {
	
	public static void main(String[] args) 
	{
		// habstract_non_access_modifier_classB b = new habstract_non_access_modifier_classB();
		// we can't create objects for abstract classes
		// we can create objects for child classes means for non-abstract classes
		
		habstract_non_access_modifier_classC c = new habstract_non_access_modifier_classC();
		
		c.methodA();
		c.methodB();
		c.methodC();

	}

}
