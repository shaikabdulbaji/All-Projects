package ijson;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class eJsonPathforSimpleJsonArray {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 
		 // For Simple JSON
		String jsonArray = "[\r\n"
				+ "  \"10\",\r\n"
				+ "  \"20\",\r\n"
				+ "  \"30\",\r\n"
				+ "  \"40\",\r\n"
				+ "  \"50\"\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(jsonArray);
		
		System.out.println(jp.getString("[0]"));
		System.out.println(jp.getString("[2]"));
		System.out.println(jp.getString("[4]"));
		
		System.out.println(jp.getString("[5]")); // we get "null" value because it is default value of getSting method
	
		System.out.println(jp.getList("$"));
		System.out.println(jp.getList("$").size());
		
		*/
		// For Nested JSON
		String jsonArray = "[\r\n"
				+ "  [\r\n"
				+ "    \"10\",\r\n"
				+ "    \"20\",\r\n"
				+ "    \"30\",\r\n"
				+ "    \"40\",\r\n"
				+ "    \"50\"\r\n"
				+ "  ],\r\n"
				+ "  [\r\n"
				+ "    \"100\",\r\n"
				+ "    \"200\",\r\n"
				+ "    \"300\",\r\n"
				+ "    \"400\",\r\n"
				+ "    \"500\",\r\n"
				+ "    \"600\"\r\n"
				+ "  ]\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(jsonArray);
		
		System.out.println(jp.getString("[0][3]"));
		System.out.println(jp.getString("[1][4]"));
		
		System.out.println(jp.getList("$").size());
		
		List<Object> internallist = (List<Object>) jp.getList("$").get(0);
		System.out.println(internallist.size());

		List<Object> internallist1 = (List<Object>) jp.getList("$").get(1);
		System.out.println(internallist1.size());
		
	}

}
