package jJsonSchema;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class kConvertJsonArrayResponseToList {

	public static void main(String[] args) {

		List<Map<String, Object>> allemp = RestAssured
			.get("https://run.mocky.io/v3/6926602c-2126-43ff-8669-ef65379d3f48")
		//	.as(List.class);
		// Now we want to convert to Map to List with Generic form
		//	.as(List<Map<String, Object>>.class);
		//	Usually we insert the map in list by above method but it is not working then go to "TypeRef" method
			.as(new TypeRef<List<Map<String, Object>>>(){});
		
			System.out.println(allemp.size());
		
			Map<String, Object> emp1 = (Map<String, Object>) allemp.get(0);
			System.out.println(emp1.get("first_name"));
		
	}

}
