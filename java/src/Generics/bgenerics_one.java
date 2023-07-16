package Generics;

import java.util.ArrayList;

public class bgenerics_one {

	public static void main(String[] args) {

/*
 
 		* Generics for Type Saftey
 		* Generics was used at Collection frameworks and Classes and Methods
 		
 
		// Generics at Collection frameworks :
		ArrayList<Object> a = new ArrayList<>();
		a.add("Shaik");
		a.add("Abdul");
		a.add("Baji");
		a.add(9);
		a.add(9.66);
		a.add(true);
		System.out.println(a);
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Shaik");
		a1.add("Abdul");
		a1.add("Baji");
	//	a1.add(9);
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<>();
//		a2.add("Shaik");
		a2.add(8);
		a2.add(12);
		a2.add(9);
		System.out.println(a2);
*/		
		// Generics at Classes :
		cgenerics_one_lion<Integer> lion = new cgenerics_one_lion<>();
		
		lion.a = 10;
		
		lion.printmethod();	
	}
	
	// Generics at Method :
	public static void sampleMethod(cgenerics_one_lion<? extends Number> l)
	{
		System.out.println(l.a);
	}

}
