package Collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class qproperties_class {

	public static void main(String[] args) throws IOException {

/*
 		
	 	* Properties class is the child class of Hashtable class
	    * Frequent changing data should not be "hard-coded in the Java programs, instead we have to seperate it in Properties files and read 
	      from these files"
		* Property Name and Property Value should be String type
	    * Property class specific methods
 				
 
		String username = "Abdul";
		String password = "12345";
		
		System.out.println(" Login to application by "+username+" and "+password);
*/
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\Ecli[pse workspace\\java\\src\\Collections\\rprofile.properties");
		
		// Loading the properties files
		p.load(fis);
//		
//		// Retriving the property values using property names
//		System.out.println(p.getProperty("username"));
//		System.out.println(p.getProperty("password"));
//		
//		String username = p.getProperty("username");
//		String password = p.getProperty("password");
//		
//		System.out.println(" Login to application by "+username+" and "+password);
//		
//		System.out.println("------------------------------------------------------");
//
//		Enumeration e = p.propertyNames(); //hasMoreElements() //nextElement()
//		while(e.hasMoreElements())
//		{
//			System.out.println(e.nextElement());
//		}
		
		System.out.println("------------------------------------------------------");

		// setProperty()
		p.setProperty("username", "Shaik");
		
		System.out.println(p);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\Ecli[pse workspace\\java\\src\\Collections\\rprofile.properties");
		
		p.store(fos, "Updated Abdul to Shaik");
	}

}
