package staticimportexample;

import static staticimportexample.utilitymethods.*;

import staticimportexampledemo.demo;

import static java.lang.System.*;

public class usageclass {
	
	/*
	 * part - 1
	public static void main(String[] args)
	{
		utilitymethods um = new utilitymethods();
		um.add(5, 5);
		um.printsomething();	
	}
	
	 * importance of static in program is
	 * part - 1 : we have 2 methods in utilitymethods class to call this methods in usageclass we creat object and we call
	   that methods.
	 * part - 2 : if we have methods as static we can those methods easily or directly in main method
	 * part - 3 : if we have 100 methods in utilitymethods we can use classname.methodname 100 times, to overcome this we
	   use static import(on below paackage line). use of using static import is we can't use "classname.methodname" directly
	   we use methodname, and we can import static variables(salary) also directly.
	   ex : 1.import static staticimportexample.utilitymethods.add; (one method only import like add method)
	   		2.import static staticimportexample.utilitymethods.printsomething; (one method only import like 
	   		  printsomething method)
	   		3.import static staticimportexample.utilitymethods.*; (import all methods)
	  
	   		
	 * main difference btw import and static import is :
	 * while we use import, it will import the only class.
	   ex : import staticimportexampledemo.demo;
	   
	 * while we use static import, it will import the members(methods & variables) of the class
	   ex : import static staticimportexample.utilitymethods.*;
	 */
	
	
	
	/*
	 * part - 2
	public static void main(String[] args)
	{
		utilitymethods.add(5, 5);
		utilitymethods.printsomething();	
	}
	*/
	
	public static void main(String[] args)
	{
		add(5, 5);
		printsomething();
		out.println(salary);
		
		demo d = new demo();
	}

}
