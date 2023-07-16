package Collections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class treflection_API {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

/*
 		Reflection API is not part of Collection Framework
 		
 		What is purpose of Reflection API?
 		Call the methods using the String text, when the string text and method name matches
 		
 		Relection API contains Method Class and it's invoke() method
 		
 		String str = "methodA";
 		public static void methodA()    // calling from string to method by using Reflection API
 		{
 				sysou();
 		}		
 */
		
		String str = "methodc";
		
		// Retrive the method - getMethod()
		//Method m = treflection_API.class.getMethod(str);
		  Method m = treflection_API.class.getMethod(str,Integer.class,Integer.class);

			
		// Call the method
		//m.invoke(m);
		  m.invoke(m,3,4);
		
	}
	
	public static void methodA()
	{
		System.out.println(" Inside MethodA ");
	}
	
	public static void methodB()
	{
		System.out.println(" Inside MethodB ");
	}

	public static void methodc(Integer a, Integer b)
	{
		System.out.println(a+b);
	}
	
}
