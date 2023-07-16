package ijson;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class hWithoutInlineAssertions {
	
	public static void main(String[] args) {
		
		String jsonresponse = " ";
		jsonresponse = RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/auth")
				.body("{\r\n"
						+ "    \"username\" : \"admin\",\r\n"
						+ "    \"password\" : \"password123\"\r\n"
						+ "}")
				.contentType(ContentType.JSON)
			.when()
				.post()
			.then()
				.log()
				.all()
				.extract()
				.asString();
		
		JsonPath jp = new JsonPath(jsonresponse);
	//	Assert.assertNotNull((jp).get("token"));	
		Assert.assertNull((jp).get("token")); // withoutInline assertions java.lang.AssertionError
				
	}

}
