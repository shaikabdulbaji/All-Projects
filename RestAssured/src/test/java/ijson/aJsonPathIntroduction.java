package ijson;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class aJsonPathIntroduction {
	
	@Test
	public void  jsonpathdemo()
	{
		
		// JSON = JavaScript Object Notation, json is used to pass the data
		
		
		String json = "{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\"\r\n"
				+ "}";
		
		JsonPath jsonpath = new JsonPath(json);
		
		String text = jsonpath.getString("firstname");
		System.out.println(text);
		
		//Object text1 = jsonpath.get(); //It will print all strings in json
		Object text1 = jsonpath.get("firstname"); //It will print particular name
		System.out.println(text1);
		
		/*
		// Example for ClasscastException
		int text2 = jsonpath.get("firstname"); //java.lang.String cannot be cast to class java.lang.Integer
		System.out.println(text2);
		
		
		// Example for NumberFormatException
		String s = "abdul";
		System.out.println(Integer.parseInt(s));
		*/
	}

}

/*
 
 
 
 
			 * Simple JSON  
			{
			  "firstname" : "shaik",
			  "lastname" : "abdul",
			  "age" : 28,
			  "address" : "banglore",
			  "salary" : 10.50,
			  "martialstatus" : false
			}
			
			
			* Nested JSON
			{
			  "firstname" : "shaik",
			  "lastname" : "abdul",
			  "age" : 28,
			  "address" : {
			    "flat.no" : 102,
			    "building name" : "abc",
			    "street name" : "xyz",
			    "pin" : 123456
			   },
			  "salary" : 10.50,
			  "martialstatus" : false
			}
			
			
			
			
			
			
			
			
			
			
			
			
 */
