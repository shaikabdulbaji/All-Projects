package ijson;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class dJsonPathforNestedJsonObject {
	
	@Test
	public void  jsonpathdemo1()
	{
		
		String json = "{\r\n"
				+ "  \"firstname\" : \"shaik\",\r\n"
				+ "  \"lastname\" : \"abdul\",\r\n"
				+ "  \"age\" : 28,\r\n"
				+ "  \"address\" : {\r\n"
				+ "    \"flatno\" : 102,\r\n"
				+ "    \"building name\" : \"abc\",\r\n"
				+ "    \"street name\" : \"xyz\",\r\n"
				+ "    \"pin\" : 123456\r\n"
				+ "   },\r\n"
				+ "  \"salary\" : 10.50,\r\n"
				+ "  \"martialstatus\" : false\r\n"
				+ "}";
		
		JsonPath jp = new JsonPath(json);
		
		int af = jp.getInt("address.flatno");
		System.out.println(af);
		
		Object add = jp.get("address");
		System.out.println(add);
		
	}
	

}
