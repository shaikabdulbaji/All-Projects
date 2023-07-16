package Modifiers;

public class cprivate_access_modifier_classB {
	
	public void methodB()
	{
		// cprivate_access_modifier_classA a = new cprivate_access_modifier_classA();
		
		// cprivate_access_modifier_classA a = new cprivate_access_modifier_classA();
		// The constructor cprivate_access_modifier_classA() is not visible : while we make constructor as private
		
		// a.a  we can't access that variable a here because it is private. we can access with in class.
		// System.out.println("The value of a is"+a.a); when we make variable as public we can access it else private
		
		// a.methodA();  when we make constructor as public we can access it else private

	}
}
