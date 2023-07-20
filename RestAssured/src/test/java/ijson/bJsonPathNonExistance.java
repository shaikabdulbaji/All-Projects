package ijson;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class bJsonPathNonExistance {
	
	@Test
	public void  jsonpathdemo1()
	{
		
		String json = "{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\"\r\n"
				+ "}";
		
		JsonPath jsonpath = new JsonPath(json);
		
//		String text = jsonpath.getString("firstname1"); //Nonexistance Key it will return "null"
		
//		int text = jsonpath.getInt("firstname"); //java.lang.NullPointerException
//		System.out.println(text);
		
		
		// RootNode :  "$" is parent or root node
	//	System.out.print(jsonpath.get("$"));
		System.out.println(jsonpath.getString("$"));
	//	System.out.print(jsonpath.get());
		System.out.println(jsonpath.getString(""));
	}

}