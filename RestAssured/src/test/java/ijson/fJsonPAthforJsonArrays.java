package ijson;

import io.restassured.path.json.JsonPath;

public class fJsonPAthforJsonArrays {

	public static void main(String[] args) {

		/*
		 
		
		String json = "[\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"shaik\",\r\n"
				+ "    \"lastname\": \"abdul\",\r\n"
				+ "    \"age\": 28,\r\n"
				+ "    \"address\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"Karnataka\",\r\n"
				+ "        \"country\": \"india\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"tamilnadu\",\r\n"
				+ "        \"country\": \"india\"\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"salary\": 10.50,\r\n"
				+ "    \"martialstatus\": false\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"rasool\",\r\n"
				+ "    \"lastname\": \"kareem\",\r\n"
				+ "    \"age\": 26,\r\n"
				+ "    \"address\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"delhi\",\r\n"
				+ "        \"country\": \"india\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"ap\",\r\n"
				+ "        \"country\": \"india\"\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"salary\": 12.50,\r\n"
				+ "    \"martialstatus\": true\r\n"
				+ "  }\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(json);
		
		String city = jp.getString("[0].address[0].city");
		System.out.println(city);
		
		String city1 = jp.getString("[1].address[0].city");
		System.out.println(city1);
		
		
//		  If we want to retrive single value we use getString() method.
//		  if we want to retrive list or more than one value we use getList()     
		 
		
		System.out.println(jp.getList("[0].address.city"));
		
		System.out.println(jp.getList("address.city"));
		
		*/
		
		
		String json = "[\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"shaik\",\r\n"
				+ "    \"lastname\": \"abdul\",\r\n"
				+ "    \"age\": 28,\r\n"
				+ "    \"address\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"Karnataka\",\r\n"
				+ "        \"country\": \"india\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"tamilnadu\",\r\n"
				+ "        \"country\": \"india\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city1\": \"ts\",\r\n"
				+ "        \"country1\": \"india\"\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"salary\": 10.50,\r\n"
				+ "    \"martialstatus\": false\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"firstname\": \"rasool\",\r\n"
				+ "    \"lastname\": \"kareem\",\r\n"
				+ "    \"age\": 26,\r\n"
				+ "    \"address\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"delhi\",\r\n"
				+ "        \"country\": \"india\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"ap\",\r\n"
				+ "        \"country\": \"india\"\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"salary\": 12.50,\r\n"
				+ "    \"martialstatus\": true\r\n"
				+ "  }\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(json);
		
		String city = jp.getString("[0].address[0].city");
		System.out.println(city);
		
		String city1 = jp.getString("[1].address[0].city");
		System.out.println(city1);
		
		
//		  If we want to retrive single value we use getString() method.
//		  if we want to retrive list or more than one value we use getList()     
		 
		
		System.out.println(jp.getList("[0].address.city"));
		
		System.out.println(jp.getList("address.city"));
		
		
		
	}

}
