package ijson;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class cJsonPathforSimpleJsonObject {
	
	@Test
	public void  jsonpathdemo1()
	{
		
		String json = "{\r\n"
				+ "  \"firstname\" : \"shaik\",\r\n"
				+ "  \"lastname\" : \"abdul\",\r\n"
				+ "  \"age\" : 28,\r\n"
				+ "  \"address\" : \"banglore\",\r\n"
				+ "  \"salary\" : 10.50,\r\n"
				+ "  \"martialstatus\" : false\r\n"
				+ "}";
		
		JsonPath jp = new JsonPath(json);
		
		String firstname = jp.getString("firstname"); 
		System.out.println(firstname);
		
		int age = jp.getInt("age");
		System.out.println(age);
		
		boolean married = jp.getBoolean("martialstatus");
		System.out.println(married);
		
		float salary = jp.getFloat("salary");
		System.out.println(salary);
		
		double salaryd = jp.getDouble("salary");
		System.out.println(salaryd);
		
	}
	

}
