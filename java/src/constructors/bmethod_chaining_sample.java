package constructors;

import java.util.ArrayList;
import java.util.Iterator;

public class bmethod_chaining_sample {

	public static void main(String[] args) {

/*
		String str = "Abdul Baji";
		
		String str2 = str.replace(" ", "_");
		
		String str3 = str2.concat(" ");
		
		String str4 = str3.concat("Core Java");
		
		String str5  = str4.replace(" ", "_");
		
		System.out.println(str5);
		
		// For adding anything and replacing anything we want to write this much of line, To overcome this we go for
		// Method Chanining

		
		String str = "Abdul Baji";
		
		// Method Chanings
		String str2 = str.replace(" ", "_").concat(" ").concat("Core Java").replace(" ", "_");
		
		System.out.println(str2);
*/
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(9);
		al.add(5);
		al.add(10);
		
//		Iterator<Integer> itr = al.iterator();
//		while(itr.hasNext())
//		{
//			
//		}      This much of coding is not necessary
		
		boolean b = al.iterator().hasNext();    // This is method Chaining
		
		System.out.println(b);
	}

}
