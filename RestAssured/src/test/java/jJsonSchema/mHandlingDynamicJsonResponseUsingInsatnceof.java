package jJsonSchema;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class mHandlingDynamicJsonResponseUsingInsatnceof {

	public static void main(String[] args) {

		Response res =
			//RestAssured.get("https://run.mocky.io/v3/d35bb226-d0cd-4b0a-b4f9-b93fad189860");
			RestAssured.get("https://run.mocky.io/v3/1c86e76e-5a46-483c-962d-ffe2ee7e2b3b");
		
		Object respasObject = res.as(Object.class);
		if(respasObject instanceof List)
		{
			List respasList = (List) respasObject;
			System.out.println(respasList.size());
		}else if(respasObject instanceof Map)
		{
			Map respasMap = (Map) respasObject;
			System.out.println(respasMap.keySet());
		}
		
	}

}
